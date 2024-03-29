package com.osc.cache.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.osc.cache.constants.AppConstants;
import com.osc.cache.payload.Category;
import com.osc.cache.payload.ProductDto;
import com.osc.cache.payload.UserDto;
import com.osc.cache.serializer.CategorySerializer;
import com.osc.cache.serializer.ProductDtoSerializer;
import com.osc.cache.service.CacheService;

@Configuration
public class CacheConfig {

	private Logger logger = LoggerFactory.getLogger(CacheConfig.class);

	@Autowired
	CacheService cacheService;

	public static HazelcastInstance configureHazelCast() {
		Config config = new Config();
		config.getSerializationConfig().addSerializerConfig(
				new SerializerConfig().setTypeClass(ProductDto.class).setImplementation(new ProductDtoSerializer())
				);
		
		config.getSerializationConfig().addSerializerConfig(
				new SerializerConfig().setTypeClass(Category.class).setImplementation(new CategorySerializer())
				);
		NetworkConfig network = config.getNetworkConfig();

		network.setPort(5701).setPortCount(20);
		network.setPortAutoIncrement(true);	

		JoinConfig join = network.getJoin();
		join.getMulticastConfig().setEnabled(false);
		join.getTcpIpConfig()
		.addMember("localhost").setEnabled(true);

		return Hazelcast.newHazelcastInstance(config);


	}

	@KafkaListener(topics = AppConstants.CACHE_STORE_TOPIC,groupId = AppConstants.GROUP_ID)
	public void storeCache(String cacheJson) {
		try {

			logger.info("================Cache Service get called from user service=====================");
			logger.info("===Json Data==="+cacheJson);
			if(cacheJson.contains("PRODUCED BY WEBSOCKET SERVICE")) {
				cacheService.storeWebSocketDetails(cacheJson);
			}else {
				UserDto userData = new ObjectMapper().readValue(cacheJson, UserDto.class);
				userData.setEmail(userData.getTo());
				cacheService.storeUserData(userData);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
