package com.activeweb.app.java8datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8DateTimeAPI {

	public static void main(String args[]) {

		LocalDate date = LocalDate.now();

		System.out.println("Current date is ..." + date);

		LocalTime time = LocalTime.now();

		System.out.println("Current date is ..." + time);

		LocalDateTime dateTime = LocalDateTime.now();

		Instant instantTime = Instant.now();
		
		System.out.println("Instant time is .." + instantTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("current time zone"+zonedDateTime);
		
		ZonedDateTime timeInPhx = ZonedDateTime.now(ZoneId.of("America/Phoenix"));
		
		ZonedDateTime timeInIndia = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
		
		System.out.println("different in hours..."+(timeInPhx.getHour()-timeInIndia.getHour()));
		
	}

}
