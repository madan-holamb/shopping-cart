package com.osc.websocket.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osc.websocket.Utils;
import com.osc.websocket.payload.ProductDto;
import com.osc.websocket.service.ProductService;
import com.osc.websocket.service.ProductUtility;
import com.osc.websocket.service.impl.ProductRepoServiceImpl;

@RestController
@RequestMapping("/user")
public class DashboardController {
	
	@Autowired
	ProductService service;
	
	@Autowired
	ProductRepoServiceImpl repoService;

	@PostMapping("/dashboard")
	public ResponseEntity<?> signUp(@RequestBody Map<String, String> bodyMap) {
		
		
		String device = bodyMap.get("sessionId").split("_")[1];
		String userId = bodyMap.get("userId")+"_"+device.toUpperCase();
		
		Map<String, Map<String, ProductDto>> recentlyViewedMap = ProductUtility.recentlyViewedMap;
		
		if(Utils.isNotEmpty(recentlyViewedMap.get(userId))) {
			
			//return ResponseEntity.status(HttpStatus.OK).body(service.findUserHadHistoryRecord(recentlyViewedMap.get(userId),userId));
			
			return ResponseEntity.status(HttpStatus.OK).body(repoService.findUserHadHistoryRecord(recentlyViewedMap.get(userId),userId));
		}
		
		//return ResponseEntity.status(HttpStatus.OK).body(service.findNoViewingHistoryRecord());
		
		return ResponseEntity.status(HttpStatus.OK).body(repoService.findNoViewingHistoryRecord(userId));
		


	}



}
