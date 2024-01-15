package com.osc.websocket;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.osc.websocket.service.ProductService;
import com.osc.websocket.service.impl.ProductRepoServiceImpl;
import com.osc.websocket.verticle.WebSocketVerticle;

import io.vertx.core.Vertx;

@SpringBootApplication
@EnableScheduling
public class OscWebSocketApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OscWebSocketApplication.class, args);

		ProductService bean = context.getBean(ProductService.class);
		
		ProductRepoServiceImpl beanRepo = context.getBean(ProductRepoServiceImpl.class);

		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(new WebSocketVerticle(bean,beanRepo));

	}

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
