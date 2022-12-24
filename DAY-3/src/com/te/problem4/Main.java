package come.te.problem4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		Integer[] arr=new Integer[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: "+i);
			arr[i]=scanner.nextInt();
		}
		System.out.println(UserMainCode.averageElements(arr));
	}
}
