package com.te.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=5;
		List<Integer> list1=new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter array1 element index:"+i);
			list1.add(scanner.nextInt());
		}
		List<Integer> list2=new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter array1 element index:"+i);
			list2.add(scanner.nextInt());
		}
		
		System.out.println(UserMainCode.sortMergedArrayList(list1, list2));
	}
}
