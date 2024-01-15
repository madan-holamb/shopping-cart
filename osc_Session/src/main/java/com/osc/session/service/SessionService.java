package com.osc.session.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.grpc.user.LoginRequest;
import com.grpc.user.LoginResponse;
import com.grpc.user.LoginStatusServiceGrpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SessionService extends LoginStatusServiceGrpc.LoginStatusServiceImplBase  {
    @Autowired
    KafkaUtils kafkaService;
    

    @Override
	public void findIsUserLogedIn(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        try {
			boolean isSessionExists = kafkaService.getSessionStatus(request.getUserId(),request.getDevice());
			LoginResponse response = LoginResponse.newBuilder()
									 .setIsUserLogin(isSessionExists)
									 .build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
  }
