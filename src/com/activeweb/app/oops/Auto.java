package com.activeweb.app.oops;

public class Auto<T> {

	T t;

	public Auto() {

	}

	public Auto(String modelName, String value, String make, Integer yearOfMake) {
		
	}

	String model;
	String value;
	String make;
	Integer year;

	public void doSomething() {

		System.out.println("here..." + t.toString());

	}

}
