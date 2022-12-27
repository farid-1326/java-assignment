package com.te.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static List sortMergedArrayList(List<Integer> list1, List<Integer> list2) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (Integer integer : list1) {
			arrayList.add(integer);
		}
		for (Integer integer : list2) {
			arrayList.add(integer);
		}
		Collections.sort(arrayList);

		result.add(arrayList.get(2));
		result.add(arrayList.get(6));
		result.add(arrayList.get(8));

		return result;
	}
}
