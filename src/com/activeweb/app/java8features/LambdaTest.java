package com.activeweb.app.java8features;

public class LambdaTest {

	int i = 0;

	public void testing() {
		System.out.println("testing....");
	}

	public int find(int a, int b) {
		return Math.max(a, b);
	}

	public String complex(int a, int b, String s) {
		int c = a + b;
		c = a + b / b;
		return "crazy";
	}

	public static void main(String args[]) {
		PrintInterface printLamdba = () -> System.out.println("testing....");
		printLamdba.print();
	}

}

/*
 * lamdbaFunction = () -> System.out.println("testing....");
 * 
 * findLambda = (int a, int b) -> max(a, b);
 * 
 * complexLambda = (int a, int b, String s) -> { int c = a+b; c=a+b/b ; return
 * "crazy";};
 */
