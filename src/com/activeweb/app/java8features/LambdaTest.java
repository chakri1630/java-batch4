package com.activeweb.app.java8features;

import java.util.function.Predicate;

import com.activeweb.app.oops.Loan;

public class LambdaTest extends Loan {

	int i = 0;

	long x = 100;

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

	// Java 8 Implementation
	public static void util8(Predicate<Loan> makeCheck) {
		Loan l1 = new Loan();
		l1.make = "Toyota";
		Loan l2 = new Loan();
		l2.make = "Audi";
		System.out.println("Result from 8..." + makeCheck.test(l2));
		System.out.println("Resutl from 8..." + makeCheck.test(l1));
	}

	// Java 7 Implementation
	public static void util7(LambdaTest lamdaTest) {
		Loan l1 = new Loan();
		l1.make = "Toyota";
		Loan l2 = new Loan();
		l2.make = "Audi";
		System.out.println("Result from 7..." + lamdaTest.makeCheckMethod(l2));
		System.out.println("Resutl from 7..." + lamdaTest.makeCheckMethod(l1));
	}

	// Regular function as per Java 7
	public boolean makeCheckMethod(Loan loan) {
		if (loan.make.equals("Audi"))
			return true;
		return false;
	}

	public static void main(String args[]) {
		// Equivalent Lambda expression as per Java 8 (using Functional Interface
		// Predicate)
		util8((Loan loan) -> {if (loan.make == "Audi")	return true; return false;});
		util7(new LambdaTest());
	}

}
