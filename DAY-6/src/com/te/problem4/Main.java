package com.te.problem4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of array");
		String[] array=new String[scanner.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element : "+i);
			array[i]=scanner.next();
		}
		System.out.println("Enter an integer value");
		Integer input=scanner.nextInt();
		
		System.out.println(UserMainCode.formString(array, input));
		
	}
}
