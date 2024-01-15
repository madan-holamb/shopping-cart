package com.osc.cache.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {
	
	private int code;
	
	private DataObject dataObject;
}
