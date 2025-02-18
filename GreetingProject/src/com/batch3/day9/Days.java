package com.batch3.day9;

public enum Days {
	MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wednesday"),THURSDAY("Thursday")
	,FRIDAY("Friday"),SATURDAY("Saturday"),SUNDAY("Sunday");
	
	String name;
	
	private Days(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
