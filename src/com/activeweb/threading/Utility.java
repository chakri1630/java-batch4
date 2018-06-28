package com.activeweb.threading;

final public class Utility {

	public static void main(String args[]) throws InterruptedException {

		SearchService s1 = new SearchService();
		SearchService s2 = new SearchService();

		s1.start();
		s2.start();

		Thread t = new Thread(new MailService());

		t.start();

		Thread.sleep(10000); // sleeps the current running thread for some

		s1.join(); // Executing thread(main) will wait till this thread s1 is completed.

		s1.wait(); // IllegalMonitorStateException will occur if we do this, wait,
				   // notify notifyAll should be invoked only from sychronized context

		System.out.println("Thread alive or not..." + s1.isAlive());
		System.out.println("Thread priority" + s1.getPriority());
		System.out.println("Active threads.." + Thread.activeCount());

		Thread.yield();// Current thread will inform the JVM that its ready to yield itself

		System.out.println("Main thread is done...");
	}

}
