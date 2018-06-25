package com.activeweb.threading;

public class SearchService extends Thread implements Runnable {

	private Integer i = 20;
	
	public SearchService(String threadName) {
		super(threadName);
	}
	
	public synchronized void search() {
		System.out.println("Search logic is running" + i + getName());
		i++;
		System.out.println("Search logic is running" + i + getName());

	}

	@Override
	public void run() {

		search();
	}

}
