package com.osc.websocket.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@AutoConfigureAfter(name="org.springframework.cloud.client.CommonsClientAutoConfiguration",
                   value=net.devh.boot.grpc.common.autoconfigure.GrpcCommonCodecAutoConfiguration.class)
public class GrpcConfig {
	
}

