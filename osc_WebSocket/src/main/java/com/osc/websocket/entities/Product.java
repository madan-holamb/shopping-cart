package com.osc.websocket.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductId")
	private String productId;
	
	@ManyToOne
	@JoinColumn(name = "CategoryId")
	private Categories category;
	
	@Column(name = "ProductName")
	private String productName;
	
	@Column(name = "ProductPrice")
	private BigDecimal productPrice;
	
	@Column(name = "ProductDescription")
	private String productDescription;
	
	@Column(name = "ViewCount")
	private Integer viewCount;
	
	@Column(name = "ImagePath")
	private String imagePath;

}
