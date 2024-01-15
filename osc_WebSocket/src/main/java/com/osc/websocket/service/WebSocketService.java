package com.osc.websocket.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebSocketService {

	public static final String REST_API_URL_CACHE = "http://localhost:9094/websocket/store";
	
	public static final String REST_API_URL_LOGOUT = "http://localhost:8085/user/logout";
	
	

	public void storeInCache(String userSocketDetails) {

		try {
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			
			HttpEntity<String> requestEntity = new HttpEntity<>(userSocketDetails, headers);
			
			ResponseEntity<String> responseEntity = restTemplate.postForEntity(REST_API_URL_CACHE, requestEntity, String.class);
			
			System.out.println("===========Response From Cache Service===============  "+responseEntity.getBody());
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void logoutUser(String logoutDataJson) {

		try {
			Map<String, String> map = new HashMap<>();
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			
			HttpEntity<String> requestEntity = new HttpEntity<>(logoutDataJson, headers);
			
			ResponseEntity<String> responseEntity = restTemplate.postForEntity(REST_API_URL_LOGOUT, requestEntity, String.class);
			
			System.out.println("===========Response From User Service===============  "+responseEntity.getBody());
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
