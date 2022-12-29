package com.te.probelm5;

import java.util.HashMap;

public class UserMainCode {
	public static HashMap<String, String> getStateId(String[] array) {
		HashMap<String, String> map = new HashMap<String, String>();
		for (int j = 0; j < array.length; j++) {
			String temp = array[j].substring(0, 3).toUpperCase();
			map.put(temp, array[j]);
		}
		return map;
	}
}
