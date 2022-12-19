package com.te.problem3;

public class UserMainCode {
	public static Integer reverseNumber(Integer num) {
		if (num >= 0) {
			Integer rev = 0;
			while (num > 0) {
				int last = num % 10;
				rev = rev * 10 + last;
				num = num / 10;
			}
			return rev;
		} else {
			return 0;
		}

	}

}
