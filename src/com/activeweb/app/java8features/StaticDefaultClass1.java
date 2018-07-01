package com.activeweb.app.java8features;

public interface StaticDefaultClass1 {

	public void test();
	
	public default void defaultTest() {
		System.out.println("This is a default method in a interface 1");
	}
	
	public static void staticTest() {
		System.out.println("This is a static method in a inteface");
	}
	
	
}
