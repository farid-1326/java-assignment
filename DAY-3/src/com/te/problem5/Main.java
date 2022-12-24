package com.te.problem5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		Integer size=scanner.nextInt();
		Integer[] array1=new Integer[size];
		Integer[] array2=new Integer[size];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter 1st arrray element : "+ i);
			array1[i]=scanner.nextInt();
		}
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Enter 2nd array element : "+j);
			array2[j]=scanner.nextInt();
		}
		System.out.println(UserMainCode.sumCommonElement(array1, array2));
	}
}
