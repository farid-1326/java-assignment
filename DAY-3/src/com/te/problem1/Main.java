package com.te.problem1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[] = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element :"+ i);
			arr[i]=scanner.nextInt();
			
		}

		System.out.println(UserMainCode.getSumOfPower(arr));
	
	}
}
