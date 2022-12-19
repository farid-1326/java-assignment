package com.te.problem8;

public class UserMainCode {
	public static Integer getLuckySum(Integer a, Integer b, Integer c) {
		Integer sum = 0;
		if (a == 13 && b == 13 && c == 13) {
			sum = sum + 0;
		} else if (a == 13) {
			if (c != 13 && b != 13) {
				sum = sum + c;
			}
		} else if (b == 13) {
			sum = sum + a;
		} else if (c == 13) {
			sum = a + b;
		} else {
			sum = a + b + c;
		}
		return sum;
	}
}
