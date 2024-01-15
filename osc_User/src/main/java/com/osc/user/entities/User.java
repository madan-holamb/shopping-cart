package com.osc.user.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "USER_NAME")
	private String name;

	@Column(name = "USER_EMAIL",unique = true)
	private String email;

	@Column(name = "USER_CONTACT")
	private String contact;

	@Column(name = "USER_DOB")
	private Date dob;

	private String password;

	@CreationTimestamp
	private Date createDate;

	private String userId;


}
