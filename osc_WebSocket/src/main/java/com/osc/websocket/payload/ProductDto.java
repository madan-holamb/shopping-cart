package com.osc.websocket.payload;

import java.math.BigDecimal;

import com.osc.websocket.entities.Categories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class ProductDto {

	private String productId;

	private Categories category;

	private String productName;

	private BigDecimal productPrice;

	private String productDescription;

	private Integer viewCount;

	private String imagePath;
	
	private Long rank;
	
	private String userId;
	
	private String cartQty;

	public ProductDto(String productId, Categories category, String productName, BigDecimal productPrice,
			String productDescription, Integer viewCount, String imagePath, Long rank, String userId, String cartQty) {
		super();
		this.productId = productId;
		this.category = category;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.viewCount = viewCount;
		this.imagePath = imagePath;
		this.rank = rank;
		this.userId = userId;
		this.cartQty = cartQty;
	}

	public ProductDto(String productId, Categories category, String productName, BigDecimal productPrice,
			String productDescription, Integer viewCount, String imagePath) {
		super();
		this.productId = productId;
		this.category = category;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.viewCount = viewCount;
		this.imagePath = imagePath;
	}

}
