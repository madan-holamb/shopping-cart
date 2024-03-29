package com.osc.email.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;

	@Value("${spring.mail.username}")
	private String fromMail;

	public void sendMail(String mailjson) {
		Map<String, String> mailMap = null;
		try {
			mailMap = new ObjectMapper().readValue(mailjson, HashMap.class);
			String body = mailMap.get("userId")+mailMap.get("otp");

			SimpleMailMessage mailMsg = new SimpleMailMessage();
			mailMsg.setFrom(fromMail);
			mailMsg.setSubject(mailMap.get("subject"));
			mailMsg.setText(body);
			mailMsg.setTo(mailMap.get("To"));

			mailSender.send(mailMsg);
			
			System.out.println("==========>>>>>>>MAIL SENT SUCCESSFULLY<<<<<<<<<=============");
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
