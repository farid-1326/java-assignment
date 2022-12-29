package com.te.problem1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

	public static String getMaxKeyValue(String value) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		String input = value.replaceAll("[{}]", "").trim();

		String[] split=input.split(",");
		for (int i = 0; i < split.length; i++) {
			String str=split[i];
			String[] arr=str.split("=");
			map.put(Integer.parseInt(arr[0].trim()), arr[1]);
		}
		 
		return map.get(Collections.max(map.keySet()));

	}
}
