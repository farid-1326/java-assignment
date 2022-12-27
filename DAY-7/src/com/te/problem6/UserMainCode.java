package com.te.problem6;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List generateOddEvenList(List<Integer> list1, List<Integer> list2) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if (list1.get(i) % 2 != 0 && j % 2 != 0) {
					result.add(list1.get(i));
					break;
				} else if(list2.get(i)%2 ==0 && j%2==0) {
					result.add(list2.get(i));
					break;
				}

			}
		}
		return result;
	}
}