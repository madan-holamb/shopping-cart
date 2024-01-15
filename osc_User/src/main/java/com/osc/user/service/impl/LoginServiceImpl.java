package com.osc.user.service.impl;

import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.user.LoginRequest;
import com.grpc.user.LoginResponse;
import com.grpc.user.LoginStatusServiceGrpc.LoginStatusServiceBlockingStub;
import com.osc.user.constants.AppConstants;
import com.osc.user.encryption.EncryptDecrypt;
import com.osc.user.entities.Session;
import com.osc.user.entities.User;
import com.osc.user.payloads.UserDto;
import com.osc.user.repository.SessionRepository;
import com.osc.user.repository.UserRepository;
import com.osc.user.service.LoginService;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class LoginServiceImpl implements LoginService {

	@GrpcClient("login-service")
	LoginStatusServiceBlockingStub  loginServiceStub;

	@Autowired
	SessionRepository sessionRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public boolean isUserIdValid(String userId) {

		User user = userRepository.findByUserId(userId);

		return user != null ? true : false;

	}

	@Override
	public boolean isPasswordValid(String password){
		try {
			String encryptedPassword = new EncryptDecrypt().encrypt(password);

			User user = userRepository.findByPassword(encryptedPassword);

			return user != null ? true : false;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean produceInSession(Map<String, String> sessionMap){

		try {
			kafkaTemplate.send(AppConstants.SESSION_STREAM_TOPIC,
					sessionMap.get("userId"),
					new ObjectMapper().writeValueAsString(sessionMap));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return true;

	}

	@Override
	public boolean isUserSessionExists(String userId,String device) {

		LoginRequest loginRequest = LoginRequest.newBuilder()
				.setUserId(userId)
				.setDevice(device)
				.build();

		LoginResponse loginResponse =  this.loginServiceStub.findIsUserLogedIn(loginRequest);


		return loginResponse.getIsUserLogin();
	}

	@Override
	public String getUserName(String userId) {
		User user = userRepository.findByUserId(userId);
		return user!=null ? user.getName():"John Doe";
	}

	@Override
	public UserDto findByEmailId(String mail) {
		mail = mail.trim();
		User user = userRepository.findOneByEmail(mail);

		if(user != null) {
			return modelMapper.map(user, UserDto.class);
		}

		return null;

	}

	@Override
	public boolean isPasswordChanged(String email,String newPassword) {
		try {
			newPassword =  new EncryptDecrypt().encrypt(newPassword);
			userRepository.changePassword(newPassword,email);
			return true;

		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Session saveUserSession(Map<String,String> sessionMap) {

		Session session =  new Session();

		session.setSessionId(sessionMap.get("sessionId"));
		session.setUserId(sessionMap.get("userId"));
		session.setDevice(sessionMap.get("device"));

		return sessionRepository.save(session);

	}


}
