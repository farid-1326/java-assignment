package com.te.problem2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String Value");
		String input = scanner.next();
		Integer result = UserMainCode.checkCharacter(input) == 1 ? 1 : -1;
		System.out.println(result);
	}
}
