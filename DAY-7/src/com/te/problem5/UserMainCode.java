package com.te.problem5;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List arrayListSubtractor(List<Integer> list1,List<Integer> list2) {
		List<Integer> result=new ArrayList<Integer>(list1);
		result.removeAll(list2);
		return result;
	}
}
