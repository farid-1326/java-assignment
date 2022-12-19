package com.te.problem1;

public class UserMainCode {
	public static String checkSum(Integer num) {
		int sum = 0;
		if (num >= 0) {
			while (num > 0) {
				int last = num % 10;
				if (last % 2 != 0) {
					sum = sum + last;
				}
				num = num / 10;

			}

		}
		if (sum % 2 != 0) {
			return "The sum of odd number is odd";
		} else {
			return "The sum of odd number is even";
		}
	}
}
