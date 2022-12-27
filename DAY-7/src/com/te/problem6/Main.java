package com.te.problem6;

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
			System.out.println("Enter first arraylist element :"+i);
			list1.add(scanner.nextInt());
		}
		List<Integer> list2=new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter second arraylist element :"+i);
			list2.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.generateOddEvenList(list1, list2));
	}
}
