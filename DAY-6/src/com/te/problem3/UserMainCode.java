package com.te.problem3;

public class UserMainCode {
	public static String repeatFirstThreeCharacters(String input, Integer repeat) {
		StringBuffer output = new StringBuffer();
		StringBuffer output1 = new StringBuffer();
		if (input.length() > 2) {
			while (repeat > 0) {
				output.append(input.charAt(0));
				output.append(input.charAt(1));
				output.append(input.charAt(2));
				repeat--;
			}
			return output.toString();

		} else {
			while (repeat > 0) {
				output1.append(input);
				repeat--;
			}
			return output1.toString();
		}

	}
}
