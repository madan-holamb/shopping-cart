package com.osc.user.payloads;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
@AllArgsConstructor
@Builder
public class UserDto {

	private int id;

	private String name;

	private String email;

	private String contact;

	@JsonProperty("DOB")
	private Date dob;

	private String password;

	private Date createDate;

	private String userId;

	private String loginDevice;

	private String sessionId;
}
