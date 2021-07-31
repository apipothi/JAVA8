package com.apipothi.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA8
 * JAVA      : 1.8
 * Program   : 
*/

public class DateTimeExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDate ldObj = LocalDate.of(2017, 11, 6);

		System.out.println(ldObj); // prints "2017-11-06"

	}

}
