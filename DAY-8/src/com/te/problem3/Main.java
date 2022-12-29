package com.te.problem3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new  Scanner(System.in);
		System.out.println("Enter the size of map");
		int size=scanner.nextInt();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>(size);
		for (int i = 0; i < size; i++) {
			map.put(scanner.nextInt(), scanner.nextInt());
		}
		System.out.println(UserMainCode.getYear(map));
	}
}
