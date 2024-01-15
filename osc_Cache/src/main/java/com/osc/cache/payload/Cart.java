package com.osc.cache.payload;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cart {

	private String userId;

	private List<ProductDto> cartProducts;

	@JsonProperty("ProductsCartCount")
	private int productsCartCount;

	@JsonProperty("Price") 
	private BigDecimal price;

}
