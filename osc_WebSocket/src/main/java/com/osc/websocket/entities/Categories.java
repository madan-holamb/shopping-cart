package com.osc.websocket.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CategoryId")
	private Character categoryId;
	
	@Column(name = "CategoryName")
	private String categoryName;
	
	@Column(name = "ImagePath")
	private String imagePath;

}
