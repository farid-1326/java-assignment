package com.te.problem1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date in DD/MM/YYYY format");
		String input=scanner.next();
		System.out.println(UserMainCode.getAge(input));
		
	}
}
