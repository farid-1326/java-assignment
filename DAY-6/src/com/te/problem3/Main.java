package com.te.problem3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string value");
		String input = scanner.next();
		System.out.println("Enter integer value");
		Integer repeat = scanner.nextInt();
		System.out.println(UserMainCode.repeatFirstThreeCharacters(input, repeat));
	}
}
