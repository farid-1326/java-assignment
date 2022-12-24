package com.te.problem2;

import java.util.Arrays;

public class UserMainCode {
	static Integer getBigDiff(int[] arr) {
		if(arr.length>1) {
		Arrays.sort(arr);
		Integer max = arr[arr.length-1];
		Integer min = arr[0];
	
		int diff=max-min;
		return diff;
		}
		else {
			return arr[0];
		}
	}
}
