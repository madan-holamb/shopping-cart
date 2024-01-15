package com.osc.websocket.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.user.product.FindByProductIdRequest;
import com.grpc.user.product.FindByProductIdResponse;
import com.grpc.user.product.Product;
import com.grpc.user.product.SortByFilterRequest;
import com.grpc.user.product.SortByFilterResponse;
import com.grpc.user.product.findByIdServiceGrpc.findByIdServiceBlockingStub;
import com.grpc.user.product.findProductListByFilterGrpc.findProductListByFilterBlockingStub;
import com.grpc.user.similarproduct.FindDashBoardDataRequest;
import com.grpc.user.similarproduct.FindDashBoardDataResponse;
import com.grpc.user.similarproduct.GetDashBoardServiceGrpc.GetDashBoardServiceBlockingStub;
import com.osc.websocket.Utils;
import com.osc.websocket.entities.Categories;
import com.osc.websocket.payload.Category;
import com.osc.websocket.payload.ProductDto;
import com.osc.websocket.payload.Response;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ProductRepoServiceImpl  {
	
	@GrpcClient("dashboard-service")
	GetDashBoardServiceBlockingStub dashBoardBlockingStub;
	
	@GrpcClient("product-service")
	findByIdServiceBlockingStub findByIdBlockingStub;
	
	@GrpcClient("product-service")
	findProductListByFilterBlockingStub filterBlockingStub;


	public Object findNoViewingHistoryRecord(String userId) {
		try {
			FindDashBoardDataRequest request = FindDashBoardDataRequest.newBuilder()
												.setRecentlyViewedJson("null")
												.setUserId(userId)
												.build();
			
			FindDashBoardDataResponse response = dashBoardBlockingStub.findSimilarProducts(request);
			
			return new ObjectMapper().readValue(response.getResponseJson(), Object.class);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	public Object[] findByProductId(String productId) {
		
		FindByProductIdRequest request = FindByProductIdRequest.newBuilder()
										 .setProductId(productId)
										 .build();
		
		FindByProductIdResponse response = findByIdBlockingStub.findByProductIdService(request);
		
		Product product = response.getProduct();
		
		List<Product> productList = response.getProductListList();
		
		ProductDto dto = new ProductDto();
		
		Object[] objArr = new Object[2];
		
		if(Utils.isNotEmpty(product)) {
			dto.setProductId(product.getProductId());
			dto.setProductName(product.getProductName());
			dto.setCategory(new Categories(product.getCategory().getCategoryId().charAt(0), 
										   product.getCategory().getCategoryName(),
										   product.getCategory().getImagePath() ));
			dto.setProductPrice(new BigDecimal(product.getProductPrice()));
			dto.setProductDescription(product.getProductDescription());
			dto.setViewCount(product.getViewCount());
			dto.setImagePath(product.getImagePath());
			objArr[0]=dto;
		}
		
		
		if(Utils.isNotEmpty(productList)) {
			
			List<ProductDto> productDtoList = productList.stream().map(i->
				new ProductDto(i.getProductId(), 
								new Categories(i.getCategory().getCategoryId().charAt(0),
											   i.getCategory().getCategoryName(), 
										       i.getCategory().getImagePath()), 
								i.getProductName(), 
								new BigDecimal(i.getProductPrice()), 
								i.getProductDescription(), 
								i.getViewCount(), i.getImagePath())
			).collect(Collectors.toList());
			
			objArr[1] = productDtoList;
			
		}
		
		
		return objArr;
		
	}


	public List<ProductDto> findByCategoryId(char caegoryId) {
		
		return null;
	}


	public Object findUserHadHistoryRecord(Map<String, ProductDto> recentlyViewedProductMap, String userId) {
		try {
			String	recentlyViewedJson = new ObjectMapper().writeValueAsString(recentlyViewedProductMap);

			FindDashBoardDataRequest request = FindDashBoardDataRequest.newBuilder()
					.setRecentlyViewedJson(recentlyViewedJson)
					.setUserId(userId)
					.build();

			FindDashBoardDataResponse response = dashBoardBlockingStub.findSimilarProducts(request);

			return new ObjectMapper().readValue(response.getResponseJson(), Object.class);

		}catch (Exception e) {
			e.printStackTrace();
		}


		return null;
	}
	
	public List<ProductDto> findFilteredProduct(String categoryId, String filter) {
		
		SortByFilterRequest request = SortByFilterRequest.newBuilder()
									  .setCategoryId(categoryId)
									  .setFilter(filter)
									  .build();
		
		SortByFilterResponse response = filterBlockingStub.findListByFilter(request);
		
		return response.getProductList().stream().map(i->
					new ProductDto(i.getProductId(), 
							new Categories(i.getCategory().getCategoryId().charAt(0),
										   i.getCategory().getCategoryName(), 
									       i.getCategory().getImagePath()), 
							i.getProductName(), 
							new BigDecimal(i.getProductPrice()), 
							i.getProductDescription(), 
							i.getViewCount(), i.getImagePath())
					).collect(Collectors.toList());
		
		
		
	}


}
