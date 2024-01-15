package com.osc.cache.service;

import java.util.List;
import java.util.stream.Collectors;

import com.grpc.user.product.Category;
import com.grpc.user.product.Product;
import com.grpc.user.product.SortByFilterRequest;
import com.grpc.user.product.SortByFilterResponse;
import com.grpc.user.product.findProductListByFilterGrpc;
import com.osc.cache.payload.ProductDto;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class NarrowFilter extends findProductListByFilterGrpc.findProductListByFilterImplBase {

	@Override
	public void findListByFilter(SortByFilterRequest request, StreamObserver<SortByFilterResponse> responseObserver) {
		
		List<ProductDto> productDtoList = findProductListByFilter(request.getCategoryId(), request.getFilter());
		
		List<Product> productList =  productDtoList.stream().map( i ->
		Product.newBuilder()
		.setProductId(i.getProductId())
		.setProductName(i.getProductName())
		.setProductPrice(i.getProductPrice())
		.setProductDescription(i.getProductDescription())
		.setViewCount(i.getViewCount())
		.setImagePath(i.getImagePath())
		.setCategory(
				Category.newBuilder()
				.setCategoryId(i.getCategory().getCategoryId())
				.setImagePath(i.getCategory().getImagePath())
				.setCategoryName(i.getCategory().getCategoryName())
				.build())
		.build()).collect(Collectors.toList());
		
		SortByFilterResponse response = SortByFilterResponse.newBuilder()
										.addAllProduct(productList)
										.build();
		
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
		
	}
	
	public List<ProductDto> findProductListByFilter(String categoryId,String filter){
		
		List<ProductDto> allProductsList = ProductServiceHelper.getAllProducts();
		
		List<ProductDto> filteredProducts = allProductsList.stream()
				.filter(product -> categoryId.equals(product.getCategory().getCategoryId()))
				.collect(Collectors.toList());
		
		
		
		if(filter != null && filter.equals("LH")) {
			filteredProducts.sort((product1, product2) -> 
            Double.compare(Double.parseDouble(product1.getProductPrice()), Double.parseDouble(product2.getProductPrice())));
			return filteredProducts;
		}

		if(filter != null && filter.equals("HL")) {
			filteredProducts.sort((product1, product2) -> 
            Double.compare(Double.parseDouble(product2.getProductPrice()), Double.parseDouble(product1.getProductPrice())));
			return filteredProducts;
		}
			

		if(filter != null && filter.equals("P")) {
			filteredProducts.sort((product1, product2) -> 
            Double.compare((product2.getViewCount()) ,product1.getViewCount()));
			return filteredProducts;
		}

		if(filter != null && filter.equals("NF")) {
			filteredProducts.sort((product1, product2) -> 
            Double.compare((product2.getViewCount()) ,product1.getViewCount()));
			return filteredProducts;
		}
		
		return null;
	}
	

}
