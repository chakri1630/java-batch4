package com.activeweb.threading;

public class Utility {

	public static void main(String args[]) throws InterruptedException {

		SearchService s1 = new SearchService("Thread1");
		SearchService s2 = new SearchService("Thread2");

		s1.start();
		s2.start();

		// Thread.sleep(10000); -- sleeps the current running thread for some
		// s1.join(); // Executing thread(main) will wait till this thread s1 is
		// completed.
		//s1.wait(); // IllegalMonitorStateException will occur if we do this, wait, notify,
					// notifyAll should be invoked only from sychronized context
		
		Thread.yield();//Current thread will inform the JVM that its ready to yield itself
		
		System.out.println("Main thread is done...");
	}

}
