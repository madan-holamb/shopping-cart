package com.osc.websocket.payload;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DataStore {
	
	@JsonProperty("TYPE") 
	private String type;
	
    @JsonProperty("Featured Products") 
    private List<FeaturedProduct> featuredProducts;
    
    @JsonProperty("Categories") 
    private List<Category> categories;
    
    @JsonProperty("Recently Viewed Products") 
    private Collection<ProductDto> recentlyViewedProducts;
    
    @JsonProperty("Similar Products") 
    private Collection<ProductDto> similarProducts;
    
    @JsonProperty("Cart") 
    private Cart cart;
}
