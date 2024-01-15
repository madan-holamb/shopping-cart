package com.osc.cache.service;

import java.util.Map;

import com.grpc.user.cart.cartDetailsServiceGrpc;
import com.grpc.user.cart.findIsProductAvailableRequest;
import com.grpc.user.cart.findIsProductAvailableResponse;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.osc.cache.payload.ProductDto;
import com.osc.cache.serializer.ProductDtoSerializer;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CartService extends cartDetailsServiceGrpc.cartDetailsServiceImplBase {

	@Override
	public void getCartDetails(findIsProductAvailableRequest request,
			StreamObserver<findIsProductAvailableResponse> responseObserver) {

		findIsProductAvailableResponse response = findIsProductAvailableResponse.newBuilder()
				.setIsProductAvailable(findIsProductAvailable(request.getUserId(), request.getProdId(),request.getCacheOperation()))
				.build();

		responseObserver.onNext(response);

		responseObserver.onCompleted();

	}

	public boolean findIsProductAvailable(String userId,String ProductId,String cacheOperation){
		
		ClientConfig config = new ClientConfig();
		
		config.setClusterName("dev");
		config.getSerializationConfig()
				.addSerializerConfig(new SerializerConfig()
										.setTypeClass(ProductDto.class)
										.setImplementation(new ProductDtoSerializer()));
		
		HazelcastInstance hazelcastInstanceClient = HazelcastClient.newHazelcastClient(config);

		IMap<String, Map<String, ProductDto>> map = hazelcastInstanceClient.getMap("cart");
		
		Map<String, ProductDto> productMap = map.get(userId);

		if(productMap != null && productMap.containsKey(ProductId)) {

			if(cacheOperation != null && cacheOperation.equals("remove")) {
				productMap.remove(ProductId);
			}else {
				int productCount = 0;
				ProductDto productDto = productMap.get(ProductId);
				if(cacheOperation != null && cacheOperation.equals("decreases")) {
					productCount = Integer.parseInt(productDto.getTotalProducts())-1;
				}else {
					productCount = Integer.parseInt(productDto.getTotalProducts())+1;
				}

				productDto.setTotalProducts(productCount+"");
			}
			
			map.put(userId, productMap);

			return true;
		}

		return false;

	}



}
