package com.te.problem5;

public class UserMainCode {
	public static Integer sumCommonElement(Integer[] array1,Integer[] array2) {
		Integer common=0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					common +=array1[i];
				}
			}
		}
		return common;
	}
}
