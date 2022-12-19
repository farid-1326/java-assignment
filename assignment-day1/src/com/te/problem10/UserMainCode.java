package com.te.problem10;

public class UserMainCode {
	public static Integer addNumbers(Integer num) {
		Integer sum = 0;
		int count = 0;
		while (num > 0) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count > 2 || num == 1) {
				sum = sum + num;
			}

			count = 0;
			num--;
		}

		return sum;
	}
}
