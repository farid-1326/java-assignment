package com.te.problem2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of hashmap");
		int size=scanner.nextInt();
		HashMap<String, String> map=new HashMap<String, String>(size);
		for (int i = 0; i < size; i++) {
			map.put(scanner.next(), scanner.next());
		}
		String state=scanner.next();
		System.out.println(UserMainCode.getCapital(map,state));
	}
}
