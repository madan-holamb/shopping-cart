package com.osc.email.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.osc.email.constants.AppConstants;
import com.osc.email.service.MailService;

@Configuration
public class MailConfig {

	private final Logger logger = LoggerFactory.getLogger(MailConfig.class);

	@Autowired
	MailService mailService;

	@KafkaListener(topics = AppConstants.EMAIL_TOPIC_NAME,groupId = AppConstants.GROUP_ID)
	public void updatedLocation(String mailjson) {
		try {
			logger.info("================Email Service get called from user service=====================");
			logger.info(mailjson);
			mailService.sendMail(mailjson);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
