package com.te.problem5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of String array");
		String [] array= new String[scanner.nextInt()];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the String "+ (i+1) + ":");
			array[i]=scanner.next();
		}
		System.out.println("Enter the colour to get the index");
		
		UserMainCode.getElementPosition(array,scanner.next());
	}
}
