package com.te.problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class UserMainCode {
	public static Integer getLastDayOfMonth(String date) {
		LocalDate lastday=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-M-yyyy")).with(TemporalAdjusters.lastDayOfMonth());
		return lastday.getDayOfMonth();
	}
}
