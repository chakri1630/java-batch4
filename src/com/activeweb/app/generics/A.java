package com.activeweb.app.generics;

public class A<T> {

	private T t;
	
	public T getObj() {
		return t;
	}
	
	/*
	 * This method is setting the value inside class
	 * 
	 */

	public void setObj(T t) {

		if(t instanceof String) {
			System.out.println("true...");
		}

		this.t = t;
	}

}
