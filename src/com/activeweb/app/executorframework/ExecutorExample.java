package com.activeweb.app.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

	public static void main(String args[]) {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		// ExecutorService executorService = new ThreadPoolExecutor(1, 1, 0L,
		// TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

		/*
		 * Runnable runnableTask = () -> { System.out.println("I am a task..."); };
		 * 
		 * Runnable sortTask = () -> { System.out.println("I am a sort task..."); };
		 * 
		 * Runnable searchTask = () -> { System.out.println("I am a search task..."); };
		 * 
		 * Runnable printTask = () -> { System.out.println("I am a print task..."); };
		 * 
		 * List<Runnable> runnables = new ArrayList<>(); runnables.add(runnableTask);
		 * runnables.add(sortTask); runnables.add(searchTask); runnables.add(printTask);
		 * 
		 * for (Runnable task : runnables) { executor.submit(task); }
		 */

		Callable<String> callableTask = () -> {
			System.out.println("Callable is executed...");
			return "Task's execution";
		};

		Future<String> future = executorService.submit(callableTask);

		try {
			String s = future.get();
			System.out.println("result from Callable is ..." + s);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("End of main thread");

	}

}
