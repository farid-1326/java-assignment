package com.te.problem8;

public class UserMainCode {
	public static Integer sumElements(Integer[] array) {
		Integer sum=0;
		for (int i = 0; i < array.length; i++) {
			if(i<array.length-1 && array[i]!=array[i+1]) {
				if(array[i]%2==0) {
					sum += array[i];
				}
			}
		}
		Integer result= sum>0?sum:-1;
		return result;
	}
}
