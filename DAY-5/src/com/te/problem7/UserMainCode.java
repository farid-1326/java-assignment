package com.te.problem7;

import java.util.Arrays;

public class UserMainCode {
	public static Integer getLargestSpan(Integer[] array) {
		Integer maxCount=0;
		Integer count=0;
		Integer largestSpan=array[0];
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
			if(array[i]==array[i-1]) {
				count++;
			}else {
				count=1;
				
			}
			if(count>maxCount) {
				maxCount=count;
				largestSpan=array[i-1];
			}
		}
		return largestSpan;
		
	}
}
