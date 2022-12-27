package com.te.problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of first arraylist");
		int size=scanner.nextInt();
		List<Integer> list1=new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element :"+i);
			list1.add(scanner.nextInt());
		}
		System.out.println("Enter the size of second arrayList");
		int length=scanner.nextInt();
		List<Integer> list2=new ArrayList<Integer>(length);
		for (int i = 0; i < length; i++) {
			System.out.println("Enter element :"+i);
			list2.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.arrayListSubtractor(list1, list2));
	}
}
