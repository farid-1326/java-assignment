package com.te;

public class UserMainCode {
	public static String getMiddleChars(String input) {
		Integer middle=input.length()/2;
		
		 String result=Character.toString(input.charAt(middle-1))+Character.toString(input.charAt(middle));
			return result;
		
		
	}
}
