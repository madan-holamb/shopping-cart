package com.osc.cache.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.grpc.user.cart.product;
import com.grpc.user.cart.viewCartRequest;
import com.grpc.user.cart.viewCartResponse;
import com.grpc.user.cart.viewCartServiceGrpc;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.osc.cache.dao.ProductDataHandling;
import com.osc.cache.payload.ProductDto;
import com.osc.cache.serializer.ProductDtoSerializer;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ViewCartService extends viewCartServiceGrpc.viewCartServiceImplBase {

	@Override
	public void viewAllCart(viewCartRequest request, StreamObserver<viewCartResponse> responseObserver) {

		List<ProductDto> cartProductList = new ProductDataHandling().findCartProductOfTheUser(request.getUserId());
		
		if(cartProductList == null) {
			cartProductList = new ArrayList<ProductDto>();
		}
		
		viewCartResponse response = viewCartResponse.newBuilder()
				.addAllProductList(cartProductList.stream()
								 .map(this :: transform)
								 .collect(Collectors.toList())
						).build();
		
		responseObserver.onNext(response);

		responseObserver.onCompleted();
	}


	private product transform(ProductDto dto) {
		return product.newBuilder()
				.setProductId(dto.getProductId())
				.setProductName(dto.getProductName())
				.setProductPrice(dto.getProductPrice())
				.setProductDescription(dto.getProductDescription())
				.setViewCount(dto.getViewCount()+"")
				.setTotalProducts(dto.getTotalProducts())
				.setUserId(dto.getUserId())
				.build();
	}




}
