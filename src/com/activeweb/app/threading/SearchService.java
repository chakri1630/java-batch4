package com.activeweb.app.threading;

import java.util.concurrent.Callable;

public class SearchService extends Thread implements Callable<String> {

	private Integer i = 20;

	public SearchService() {
	}

	public synchronized String search() {
		i++;
		return "10";
	}

	@Override
	public String call() throws Exception {
		return search();
	}

	

}
