package com.te.program11;

public class UserMainCode {
	public static String sumOfOddEvenPositioned(Integer num) {
		int evenSum = 0;
		int oddSum = 0;
		String str = Integer.toString(num);
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + Character.getNumericValue(str.charAt(i));
			} else {
				oddSum = oddSum + Character.getNumericValue(str.charAt(i));
			}

		}
		if (oddSum == evenSum) {
			return "yes";
		} else {
			return "no";
		}

	}
}
