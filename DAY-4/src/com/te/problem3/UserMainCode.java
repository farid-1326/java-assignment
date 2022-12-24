package com.te.problem3;

public class UserMainCode {
	public static String formNewWord(String input,Integer num) {
		StringBuffer buffer=new StringBuffer();
		buffer.append(input.substring(0, num)).append(input.substring(input.length()-num));
		String result=buffer.toString();
		return result;
	}
}
