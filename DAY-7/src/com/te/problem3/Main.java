package com.te.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of arraylist followed by values");
		int size=scanner.nextInt();
		List<Integer> list=new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element :"+i);
			list.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.removeMultiplesOfThree(list));

	}
}
