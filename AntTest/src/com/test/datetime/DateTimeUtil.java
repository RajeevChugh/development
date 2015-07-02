package com.test.datetime;

import java.time.LocalDate;

public class DateTimeUtil {

	public static void main(String[] args) {
		
		System.out.println("Today date is:"+dateNow());

	}

	
	private static LocalDate dateNow(){
		LocalDate now =LocalDate.now();
		return now;
	}
}
