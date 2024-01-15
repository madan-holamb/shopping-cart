package com.osc.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.osc.cache.service.CacheService;

@RestController
@RequestMapping("/websocket")
public class CacheController {
	
	@Autowired
	CacheService cacheService;
	
	@PostMapping("/store")
	public ResponseEntity<?> storeWebSocketInfo(@RequestBody String body) throws JsonMappingException, JsonProcessingException{
		
		String message = cacheService.storeWebSocketDetails(body);
		
		return ResponseEntity.status(HttpStatus.OK).body(message);
		
		
	}

}
