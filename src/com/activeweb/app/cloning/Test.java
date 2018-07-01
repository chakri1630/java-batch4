package com.activeweb.app.cloning;

public class Test {

	public static void main(String args[]) {

		Employee e = new Employee();
		e.setName("Rob");

		Employee eClone = (Employee) e.clone();

		System.out.println("" + eClone + "" + e + "Value..." + eClone.getName());

	}

}
