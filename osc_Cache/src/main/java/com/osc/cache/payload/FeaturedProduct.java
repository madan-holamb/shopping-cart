package com.osc.cache.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeaturedProduct {
	
	private String productId;
	
	private String categoryId;
	
	private String prodName;
	
	private String prodMarketPrice;
}
