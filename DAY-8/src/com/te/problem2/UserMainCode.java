package com.te.problem2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UserMainCode {
	public static String getCapital(HashMap<String, String> hashMap,String state) {
		String key="";
		String val="";
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			if(entry.getKey().equalsIgnoreCase(state)){
				key=entry.getKey();
				val=entry.getValue();
			}
					
		}
		return val.toLowerCase()+"$"+key.toLowerCase();
	}
}
