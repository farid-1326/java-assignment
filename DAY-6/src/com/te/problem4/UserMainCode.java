package com.te.problem4;

public class UserMainCode {
	public static String formString(String[] array, Integer number) {
		StringBuffer newString = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			String string = array[i];
			for (int j = 0; j < string.length(); j++) {
				if (string.length() >= number) {
					newString.append(string.charAt(number - 1));
					break;
				} else {
					newString.append("$");
					break;
				}
			}
		}
		return newString.toString();
	}
}
