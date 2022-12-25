package com.te.problem1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scanner.next();
		System.out.println("Enter a delimiter");
		String delimiter=scanner.next();
		System.out.println(UserMainCode.reshape(word,delimiter));
	}
}
