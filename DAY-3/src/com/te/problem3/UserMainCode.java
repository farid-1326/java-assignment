package com.te.problem3;

public class UserMainCode {
	public static Integer checkLargestAmongCorner(Integer[] arr) {
		if(arr.length>1) {
			Integer result;
			Integer first=arr[0];
			Integer middle=arr[arr.length/2];
			Integer last=arr[arr.length-1];
			
			result= middle>(first>last?first:last)?middle:(first>last?first:last);
			return result;
			
		}else {
			return arr[0];
		}
	}
}
