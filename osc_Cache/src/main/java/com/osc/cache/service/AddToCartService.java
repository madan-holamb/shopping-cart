package com.osc.cache.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.grpc.user.cart.addToCartRequest;
import com.grpc.user.cart.addToCartResponse;
import com.grpc.user.cart.addToCartServiceGrpc.addToCartServiceImplBase;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.osc.cache.payload.Category;
import com.osc.cache.payload.ProductDto;
import com.osc.cache.serializer.ProductDtoSerializer;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AddToCartService extends addToCartServiceImplBase {

	@Autowired
	HazelcastInstance hazelcastInstance;


	@Override
	public void addProductToCartService(addToCartRequest request, StreamObserver<addToCartResponse> responseObserver) {

		ProductDto dto = new ProductDto(request.getProductId(), 
					   request.getProductName(), 
					   request.getProductPrice(), 
					   request.getProductDescription(), 
					   request.getViewCount(), 
					   request.getTotalProducts()+"", 
					   request.getUserId(), 
					   null, null,null,null);

		addToCartResponse response = addToCartResponse.newBuilder()
				.setResponseMessage(storeCartInCache(dto))
				.build();

		responseObserver.onNext(response);

		responseObserver.onCompleted();

	}

	private String storeCartInCache(ProductDto dto) {

		try {
			
			hazelcastInstance.getConfig().getSerializationConfig().addSerializerConfig(
				    new SerializerConfig().setTypeClass(ProductDto.class).setImplementation(new ProductDtoSerializer())
					);

			IMap<String, Map<String, ProductDto>> map = hazelcastInstance.getMap("cart");

			Map<String, ProductDto> productMap = map.get(dto.getUserId());
			if(productMap == null)
				productMap = new HashMap<>();
			
			productMap.put(dto.getProductId(), dto);

			map.put(dto.getUserId(), productMap);

			return "====>>>Succesfully Added In Cache<<<====";
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("====>>>Got Exception<<<===="+e.getMessage());
			return "====>>>Got Exception<<<===="+e.getMessage();
		}
	}

}
