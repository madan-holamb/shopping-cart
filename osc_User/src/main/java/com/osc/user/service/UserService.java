package com.osc.user.service;

import java.util.Map;

import com.grpc.user.UserResponse;
import com.osc.user.payloads.UserDto;

public interface UserService {

	UserDto addUser(UserDto user);
	
	boolean isEmailExists(String mail);
	
	boolean sendMail(Map<String,String> mailMap);
	
	void storeInCache(Map<String,String> mailMap);
	
	UserDto getUserDetails(String userId);
	
}
