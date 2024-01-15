package com.osc.cache.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private String productId;

	private String productName;

	private String productPrice;

	private String productDescription;

	private int viewCount;

	private String totalProducts;
	
	private String userId;
	
	private String imagePath;
	
	private Category category;
	
	private String rank;
	
	private String cartQty;
	
}