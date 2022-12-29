package com.te.problem3;

import java.util.Collections;
import java.util.Map;

public class UserMainCode {

	public static Integer getYear(Map<Integer, Integer> hashMap) {
		Integer key = 0;
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (Collections.max(hashMap.values()) == entry.getValue()) {
				key = entry.getKey();
			}
		}
		return key;
	}

}
