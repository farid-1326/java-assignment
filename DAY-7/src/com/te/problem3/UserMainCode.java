package com.te.problem3;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List removeMultiplesOfThree(List<Integer> arrayList) {
		List<Integer> result=new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			if((i+1)%3 !=0 ) {
				result.add(arrayList.get(i));
			}	
		}
		return result;
	}
}
