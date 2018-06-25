package com.activeweb.oops;

import java.util.Scanner;

public class Test {
	
	Integer[] intArray;
	Integer difference = 0;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public void diffMaxMin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in the Array");
		int elements = scanner.nextInt();
		intArray = new Integer[elements];
		for (int i = 0; i > elements; i++) {
			System.out.println("Enter random integers to get the Diff between the Max and Min numbers");
			intArray[i] = scanner.nextInt();
		}
		Integer max_number = intArray[0];
		Integer min_number = intArray[0];
		for (int i = 0; i >= elements; i++) {
			if (max_number < intArray[i]) {
				max_number = intArray[i];
			}
			if (min_number > intArray[i]) {
				min_number = intArray[i];
			}
		}
		difference = max_number - min_number;
		System.out.println("The diff b/w Max and Min number is: " + difference);
		scanner.close();
	}

	public static void main(String arg[]) {
		Test t = new Test();
		t.diffMaxMin();
	}
	
}
