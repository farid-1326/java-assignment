package com.te.problem2;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List matchCharacter(String[] array) {
		List<String> arrayList = new ArrayList<String>();
		String vowels = "aeiou";
		for (int j = 0; j < array.length; j++) {
			String s = array[j];
			for (int i = 0; i < s.length(); i++) {
				if (s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o")
						|| s.startsWith("u") && s.endsWith("a") || s.endsWith("e") || s.endsWith("i") || s.endsWith("o")
						|| s.endsWith("u")) {
					arrayList.add(s);
					break;
				}
			}
		}

		return arrayList;
	}
}
