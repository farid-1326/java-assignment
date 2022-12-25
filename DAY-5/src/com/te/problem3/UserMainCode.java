package com.te.problem3;

public class UserMainCode {
	public static String checkTripplets(Integer[] array) {
		Integer count = 0;
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 2 && array[i] == array[i + 1] && array[i] == array[i + 2]) {
				count++;
			}
		}
		if (count > 0) {
			return "TRUE";
		} else {
			return "FALSE";
		}
	}
}
