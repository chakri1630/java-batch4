package com.activeweb.app.executorframework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExectuorTest {

	public static void main(String args[]) {

		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

		long startTIme = System.currentTimeMillis();

		ScheduledFuture sf = ses.scheduleWithFixedDelay(new SendEmailTask(), 0, 1000, TimeUnit.MILLISECONDS);

		if (startTIme + 1000 == System.currentTimeMillis()) {
			ses.shutdown();
		}

	}

}
