package com.te.problem2;

public class UserMainCode {
	public static Integer getSubString(String word,String sub) {
		Integer count = ( word.split(sub, -1).length ) - 1;
		return count;
	}
}
