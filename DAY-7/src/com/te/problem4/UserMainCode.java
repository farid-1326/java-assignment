package com.te.problem4;

import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static String[] convertToStringArray(List<String> arrayList) {
		Collections.sort(arrayList);
		String[] stringArray=new String[arrayList.size()];
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i]=arrayList.get(i);
		}
		return stringArray;
	}
}
