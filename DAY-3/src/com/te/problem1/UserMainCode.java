package com.te.problem1;

public class UserMainCode {

	public static Integer getSumOfPower(int[] array) {
		Integer sum=0;
		for (int i=0;i<array.length;i++) {
			sum=(int) (sum+Math.pow(array[i], i));
		}
		return sum;
	}
}
