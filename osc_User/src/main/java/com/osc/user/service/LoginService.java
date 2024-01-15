package com.osc.user.service;

import java.util.Map;

import com.osc.user.entities.Session;
import com.osc.user.payloads.UserDto;

public interface LoginService {

	boolean isUserIdValid(String userId);

	boolean isPasswordValid(String password);

	boolean produceInSession(Map<String, String> sessionMap);

	boolean isUserSessionExists(String userId,String device);

	UserDto findByEmailId(String mail);

	String getUserName(String userId);

	boolean isPasswordChanged(String email, String newPassword);

	Session saveUserSession(Map<String, String> sessionMap);
}
