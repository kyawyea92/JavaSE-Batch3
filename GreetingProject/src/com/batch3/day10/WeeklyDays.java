package com.batch3.day10;

import com.batch3.day9.Days;

public class WeeklyDays {
	public static void main(String[] args) {
		System.out.println("Yesterday is : "+Days.FRIDAY);
		System.out.println("Today is : "+Days.SATURDAY);
		System.out.println("Tomorrow is : "+Days.SUNDAY);
		
		for(int i = 0; i < Days.values().length; i++) {
			System.out.println(Days.values()[i]);
		}
		System.out.println("Today is "+Days.SATURDAY.getName());
	//	System.out.println("Today is : "+Days.valueOf("FRIDAY"));
	}
}
