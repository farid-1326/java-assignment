package com.te.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UserMainCode {
	public static String[] obtainDesignation(HashMap<String, String> hashMap, String designation) {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(designation)) {
				arrayList.add(entry.getKey());
			}

		}
		Collections.sort(arrayList);
		String[] array=new String[arrayList.size()];
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			for (int i = 0; i < array.length; i++) {
				array[i]=iterator.next();
			}
		}
		return array;
	}
}
