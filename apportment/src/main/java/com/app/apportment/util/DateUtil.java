package com.app.apportment.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	/*
	 * This returns date of Sunday for that week
	 */
	public static Date getWeekStartDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int delta = -cal.get(GregorianCalendar.DAY_OF_WEEK) + 1; // add 1 if your week start on sunday
		cal.add(Calendar.DAY_OF_MONTH, delta);
		return cal.getTime();
	}
	
	/*
	 * This returns date of Saturday for that week
	 */
	public static Date getWeekEndDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int delta = -cal.get(GregorianCalendar.DAY_OF_WEEK) + 1; // add 1 if your week start on sunday
		cal.add(Calendar.DAY_OF_MONTH, delta);
		return cal.getTime();
	}

	public static int dayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(GregorianCalendar.DAY_OF_WEEK);
	}

	public static int dayOfWeek(String stringDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date date = format.parse(stringDate);
		return dayOfWeek(date);
	}

	public static Date toDate(String stringDate) {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null;
		try {
			date = format.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String toString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String stringDate = format.format(date);
		return stringDate;
	}

}
