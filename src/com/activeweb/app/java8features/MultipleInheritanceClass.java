package com.activeweb.app.java8features;

public class MultipleInheritanceClass implements StaticDefaultClass1, StaticDefaultClass2 {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultTest() {
		// TODO Auto-generated method stub
		StaticDefaultClass1.super.defaultTest();
	}

}
