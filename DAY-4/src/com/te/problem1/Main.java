package com.te;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string value");
		String input=scanner.next();
		System.out.println(UserMainCode.getMiddleChars(input));
	}

	
}
