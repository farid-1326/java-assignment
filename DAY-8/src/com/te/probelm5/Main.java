package com.te.probelm5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static HashMap<String, String> map = new HashMap<String, String>();
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		String[] arr = new String[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		map = UserMainCode.getStateId(arr);
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ":" + val);

		}
		
	}

}
