package com.osc.cache;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.osc.cache.config.CacheConfig;

@SpringBootApplication
@EnableCaching
public class OscCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(OscCacheApplication.class, args);
	}
	
	@Bean
	public HazelcastInstance hazelcastInstance() {
		return CacheConfig.configureHazelCast();
	}
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
     

}
