package com.te.problem2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String input");
		String word=scanner.next();
		System.out.println("Enter substring");
		String subString=scanner.next();
		
		System.out.println(UserMainCode.getSubString(word, subString));
	}
}
