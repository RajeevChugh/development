package com.test.datetime;

import java.time.LocalDate;

public class DateTimeUtil {

	public static void main(String[] args) {
		
		System.out.println("Today date is:"+dateNow());
		System.out.println("printing again:"+dateNow());
		System.out.println("printing one more time:"+dateNow());
	}

	
	private static LocalDate dateNow(){
		LocalDate now =LocalDate.now();
		return now;
	}
}
