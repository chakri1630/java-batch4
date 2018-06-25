package com.activeweb.threading;

public class MailService implements Runnable {

	public void sendMail() {
		System.out.println("mail task is running");
	}

	@Override
	public void run() {
		sendMail();
	}

}
