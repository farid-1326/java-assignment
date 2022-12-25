package com.te.problem1;

import java.util.Arrays;

public class UserMainCode {
	public static void removeTens(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==10) {
				array[i]=0;
			}
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=0) {
				System.out.println(array[i]);
			}
		}
		
	}
}
