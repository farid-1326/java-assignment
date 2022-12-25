package com.te.problem7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		Integer [] array=new Integer[scanner.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element: "+i);
			array[i]=scanner.nextInt();
		}
		System.out.println(UserMainCode.getLargestSpan(array));
	}
}
