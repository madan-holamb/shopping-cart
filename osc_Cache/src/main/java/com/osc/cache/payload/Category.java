package com.osc.cache.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	
	private String categoryId;

	private String categoryName;
	
	private String imagePath;
	
	private String count;

}
