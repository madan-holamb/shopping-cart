package com.osc.websocket.payload;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeaturedProduct {
	
	private String productId;
	
	private char categoryId;
	
	private String prodName;
	
	private BigDecimal prodMarketPrice;
}
