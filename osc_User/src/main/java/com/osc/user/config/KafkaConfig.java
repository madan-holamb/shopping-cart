package com.osc.user.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.osc.user.constants.AppConstants;

@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic newTopic() {
		return TopicBuilder
				.name(AppConstants.EMAIL_TOPIC_NAME)
					.partitions(0)
					.replicas(0)
				.build();
	}

	@Bean
	public NewTopic cacheTopic() {
		return TopicBuilder
				.name(AppConstants.CACHE_STORE_TOPIC)
				//	.partitions(0)
				//	.replicas(0);
				.build();
	}

	@Bean
	public NewTopic sessionTopic() {
		return TopicBuilder
				.name(AppConstants.SESSION_STREAM_TOPIC)
					.partitions(0)
					.replicas(0)
				.build();
	}

}
