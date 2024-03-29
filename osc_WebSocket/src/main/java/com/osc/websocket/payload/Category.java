package com.osc.websocket.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Category {

	private String categoryId;

	private String categoryName;
	
	private String count;
	
	private String imagePath;
	
	public Category(String categoryId,String categoryName,String count) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.count = count;
	}
	

}
