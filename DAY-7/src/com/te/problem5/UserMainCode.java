package com.te.problem5;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List arrayListSubtractor(List<Integer> list1,List<Integer> list2) {
		List<Integer> result1=new ArrayList<Integer>(list1);
		result1.removeAll(list2);
		
		List<Integer> result2=new ArrayList<Integer>(list2);
		result2.removeAll(list1);
		
		List<Integer> finalResult=new ArrayList<Integer>(result1);
		finalResult.addAll(result2);
		
		return finalResult;
		
		
		
	}
}
