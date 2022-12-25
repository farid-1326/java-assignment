package com.te.problem1;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		Integer[] array=new Integer[scanner.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element :"+i);
			array[i]=scanner.nextInt();	
		}
		UserMainCode.removeTens(array);
	}
}
