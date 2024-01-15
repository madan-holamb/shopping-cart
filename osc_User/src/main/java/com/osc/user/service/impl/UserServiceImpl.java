package com.osc.user.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.user.FindUserRequest;
import com.grpc.user.UserResponse;
import com.grpc.user.UserServiceGrpc.UserServiceBlockingStub;
import com.osc.user.constants.AppConstants;
import com.osc.user.entities.User;
import com.osc.user.payloads.UserDto;
import com.osc.user.repository.UserRepository;
import com.osc.user.service.UserService;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class UserServiceImpl implements UserService {

	@GrpcClient("user-service")
	UserServiceBlockingStub userServiceBlockingStub;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public UserDto addUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);

		return modelMapper.map(userRepository.save(user), UserDto.class);
	}

	public boolean isEmailExists(String mail) {

		User user = userRepository.findOneByEmail(mail);

		return user != null ?  true :  false;


	}

	public boolean sendMail(Map<String, String> mailMap){

		try {
			kafkaTemplate.send(AppConstants.EMAIL_TOPIC_NAME,new ObjectMapper().writeValueAsString(mailMap));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return true;

	}

	@Override
	public void storeInCache(Map<String, String> mailMap) {

		try {
			kafkaTemplate.send(AppConstants.CACHE_STORE_TOPIC,new ObjectMapper().writeValueAsString(mailMap));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}


	@Override
	public UserDto getUserDetails(String userId) {
		//communicating with cache-service using grpc proto
		FindUserRequest userRequest = FindUserRequest.newBuilder()
				.setUserId(userId)
				.build();
		UserResponse userResponse = this.userServiceBlockingStub.getUserDetails(userRequest);

		return UserDto.builder()
				.name(userResponse.getName())
				.email(userResponse.getEmail())
				.contact(userResponse.getContact())
				.dob(stringToDate(userResponse.getDob()))
				.userId(userResponse.getUserId())
				.build();

	}

	private Date stringToDate(String date)  {
		try {
			if(date == null || "".equals(date)) {
				return null;
			}
			SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy", Locale.ENGLISH);

			String dateInString =date;
			return formatter.parse(dateInString);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}


}