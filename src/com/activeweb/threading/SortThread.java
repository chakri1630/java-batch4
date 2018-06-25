package com.activeweb.threading;

public class SortThread extends Thread {

	String name;

	public SortThread(String string) {
		this.name = string;

	}

	public void run() {
		// sorting

		System.out.println("sort logic is running..." + name);

	}

}
