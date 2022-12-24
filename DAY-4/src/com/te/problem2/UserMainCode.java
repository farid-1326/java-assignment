package com.te.problem2;

public class UserMainCode {
	public static Integer checkCharacter(String input) {
		char last = input.charAt(input.length() - 1);
		char first = input.charAt(0);
		Integer result = first == last ? 1 : -1;
		return result;
	}
}
