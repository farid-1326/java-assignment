package com.te.problem4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of map");
		int size=scanner.nextInt();
		HashMap<String, String> map=new HashMap<String, String>(size);
		for (int i = 0; i < size; i++) {
			map.put(scanner.next(), scanner.next());
		}
		String designation=scanner.next();
		
		String[] arr=(UserMainCode.obtainDesignation(map,designation));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
