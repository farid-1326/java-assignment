package com.te.problem3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String value");
		String input=scanner.next();
		System.out.println("Enter an integer");
		Integer num=scanner.nextInt();
		
		System.out.println(UserMainCode.formNewWord(input, num));
		
	}
}
