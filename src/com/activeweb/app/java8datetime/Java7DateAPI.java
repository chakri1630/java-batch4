package com.activeweb.app.java8datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Java7DateAPI {

	public static void main(String args[]) {

		Date d = new Date();

		System.out.println("current date is..." + d);

		DateFormat df = new SimpleDateFormat("mm/DD/YYYY");

		System.out.println("" + df.format(d));

		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");

		java.sql.Date date = new java.sql.Date(1530319325);
		
		System.out.println("current time is"+date);
		
		Calendar c = new GregorianCalendar();
		
		System.out.println("Gregorian calendar time is ..."+c.getTime());
		
	}

}
