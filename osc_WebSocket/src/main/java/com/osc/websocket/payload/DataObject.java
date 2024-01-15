package com.osc.websocket.payload;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DataObject {
	
	private List<DataStore> data = new ArrayList<DataStore>();
	
}
