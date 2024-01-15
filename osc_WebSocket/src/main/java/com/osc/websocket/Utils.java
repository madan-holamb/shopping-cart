package com.osc.websocket;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Utils {

	public static boolean isNotEmpty(Object value) {
		if(value == null) {
			return false;
		}else if(value instanceof String) {
			String text = (String) value;
			return text.trim().length() > 0 && !"null".trim().equals(text);
		}else if(value instanceof Collection) {
			return ((Collection<?>) value).size() > 0;
		}else if(value instanceof List){
			return ((List<?>) value).size() > 0;
		}else if(value instanceof Map) {
			return ((Map<?,?>) value).size() > 0;
		}else if(value instanceof  Set) {
			return ((Set<?>) value).size() > 0;
		}else if(value instanceof  Vector) {
			return ((Vector<?>) value).size() > 0;
		}else if(value instanceof  StringBuffer) {
			StringBuffer text = (StringBuffer) value;
			return text.toString().trim().length() > 0 && !"null".trim().equals(text);
		}else if(value instanceof  StringBuilder) {
			StringBuilder text = (StringBuilder) value;
			return text.toString().trim().length() > 0 && !"null".trim().equals(text);
		}else if(value instanceof  Object[]) {
			Object[] objArr = (Object[]) value;
			return objArr.length > 0;
		}else {
			return true;
		}
	}

}
