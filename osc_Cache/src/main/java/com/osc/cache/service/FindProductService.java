package com.osc.cache.service;

import java.util.List;
import java.util.stream.Collectors;

import com.grpc.user.product.Category;
import com.grpc.user.product.FindByProductIdRequest;
import com.grpc.user.product.FindByProductIdResponse;
import com.grpc.user.product.Product;
import com.grpc.user.product.findByIdServiceGrpc;
import com.osc.cache.payload.ProductDto;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class FindProductService extends findByIdServiceGrpc.findByIdServiceImplBase {

	@Override
	public void findByProductIdService(FindByProductIdRequest request,
			StreamObserver<FindByProductIdResponse> responseObserver) {
		
		FindByProductIdResponse response = findProduct(request.getProductId());
		
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
		
	}
	
	public FindByProductIdResponse findProduct(String productId) {
		
		List<ProductDto> allProductsList = ProductServiceHelper.getAllProducts();
		
		ProductDto productDto = allProductsList.stream()
								.filter(i -> i.getProductId().equals(productId))
								.findFirst().get();
		
		List<ProductDto> findByCategoryList = findByCategoryId(allProductsList, productDto);
		
		Object[] objectArr = {productDto,findByCategoryList};
		
		return findByProductIdResponse(objectArr);
		
	}
	
	private List<ProductDto> findByCategoryId(List<ProductDto> allProductsList,ProductDto productDto){

		String categoryId = productDto.getCategory().getCategoryId();
		
		return allProductsList.stream()
				.filter(product -> categoryId.equals(product.getCategory().getCategoryId()) &&
						!productDto.getProductId().equals(product.getProductId()) )
				.sorted((p1, p2) -> {
					int viewCount = p2.getViewCount() - p1.getViewCount();
					return viewCount != 0 ? viewCount : p1.getProductId().compareTo(p2.getProductId());
				})
				.collect(Collectors.toList());
		
	}
	
	private FindByProductIdResponse findByProductIdResponse(Object[] objectArr) {
		
		ProductDto productDto = (ProductDto) objectArr[0];
		
		List<ProductDto> productDtoList  = (List<ProductDto>) objectArr[1];
		
		Category category = Category.newBuilder()
							.setCategoryId(productDto.getCategory().getCategoryId())
							.setImagePath(productDto.getCategory().getImagePath())
							.setCategoryName(productDto.getCategory().getCategoryName())
							.build();
							
		
		Product product = Product.newBuilder()
							.setProductId(productDto.getProductId())
							.setProductName(productDto.getProductName())
							.setProductPrice(productDto.getProductPrice())
							.setProductDescription(productDto.getProductDescription())
							.setViewCount(productDto.getViewCount())
							.setImagePath(productDto.getImagePath())
							.setCategory(category)
							.build();
		
		List<Product> productList = productDtoList.stream().map( i ->
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
		
		
		return FindByProductIdResponse.newBuilder()
										   .setProduct(product)
										   .addAllProductList(productList)
										   .build();
							
		
		
	}
	
	

}
