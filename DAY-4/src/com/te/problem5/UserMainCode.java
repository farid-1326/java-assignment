package com.te.problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMainCode {
	public static void getElementPosition(String[] array, String input) {
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for (int j = 0; j < list.size(); j++) {
			if(input.equals(list.get(j))){
				System.out.println(j+1);
			}
		}
		
		
	}
	
}
