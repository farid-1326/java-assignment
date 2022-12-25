package com.te.problem1;

public class UserMainCode {
	public static String reshape(String word,String delimiter) {
		StringBuffer buffer=new StringBuffer(word);
		StringBuffer reverse=new StringBuffer(buffer.reverse());
		StringBuffer result=new StringBuffer();
		
		for (int i = 0; i < reverse.length(); i++) {
			result.append(reverse.charAt(i)+delimiter);
		}
		result.deleteCharAt(result.length()-1);
		String finalResult=result.toString();
		return finalResult;
	}
}
