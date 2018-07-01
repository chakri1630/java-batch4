package com.activeweb.app.java8features;

public class Caller {

	public static void main(String args[]) {
		StaticDefaultClass1.staticTest();
		
		StaticDefaultClass1 sdc1 = new MultipleInheritanceClass();
		sdc1.defaultTest();
	}
	
}
