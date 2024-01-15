package com.osc.cache.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.user.FindUserRequest;
import com.grpc.user.UserResponse;
import com.grpc.user.UserServiceGrpc;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.osc.cache.payload.UserDto;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CacheService extends UserServiceGrpc.UserServiceImplBase {

	@Autowired
	HazelcastInstance hazelcastInstance;

	@Autowired
	ModelMapper mapper;

	public void storeUserData(UserDto userCache) {
		IMap<String, UserDto> map = hazelcastInstance.getMap("data");

		if(userCache.getIsClear().equals("true")) {
			map.delete(userCache.getUserId());
		}else {
			map.put(userCache.getUserId(), userCache);
		}

	}

	public UserDto getClientMap(String userId){
		ClientConfig config = new ClientConfig();
		config.setClusterName("dev");
		HazelcastInstance hazelcastInstanceClient = HazelcastClient.newHazelcastClient(config);

		IMap<String, UserDto> map = hazelcastInstanceClient.getMap("data");

		return map.get(userId);

	}

	public String storeWebSocketDetails(String socketDataJson) throws JsonMappingException, JsonProcessingException {
		IMap<String, List<String>> map = hazelcastInstance.getMap("webSocket-data");

		List<String> socketDetailList = new ObjectMapper().readValue(socketDataJson, ArrayList.class);

		if(socketDetailList != null && !socketDetailList.isEmpty()) {
			if(socketDetailList.contains("CLEAR")) {
				map.delete(socketDetailList.get(1));
				return "DATA DELETED SUCCESSFULLY";
			}else {
				map.put(socketDetailList.get(1), socketDetailList);
				return "DATA STORED SUCCESSFULLY";
			}
		}

		return "DATA NOT STORED";

	}

	@Override
	public void getUserDetails(FindUserRequest request, StreamObserver<UserResponse> responseObserver) {

		UserDto userDto = getClientMap(request.getUserId());


		UserResponse response = UserResponse.newBuilder()
				.setTo(userDto.getTo())
				.setEmail(userDto.getEmail())
				.setName(userDto.getName())
				.setContact(userDto.getContact())
				.setDob(userDto.getDob())
				.setUserId(userDto.getUserId())
				.build();

		responseObserver.onNext(response);

		responseObserver.onCompleted();

	}




}
