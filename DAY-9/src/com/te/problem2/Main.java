package com.te.problem2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date in DD/MM/YYYY");
		String input=scanner.next();
		System.out.println(UserMainCode.isLeapYear(input));
	}
}
