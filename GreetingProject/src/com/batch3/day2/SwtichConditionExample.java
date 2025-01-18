package com.batch3.day2;

public class SwtichConditionExample {

	public static void main(String[] args) {
		//Grade A , B ,C,D,E
		// 81->100  = GradeA
		// 61->80 = GradeB
		// 41 -> 60 = GradeC
		// 21 -> 40 = GradeD
		// 0 -> 20 = GradeE
		// please check again!
		/*
		int engMark = 60;
		
		switch(engMark) {
			case 80 : System.out.println("Grade A");
			case 70 : System.out.println("Grade B");
		}
		*/
		
		String dayOfWeek = "Mondays"; //Enum
		switch(dayOfWeek) {
			case "Monday" : System.out.println("Today is Monday");break;
			case "Tuesday" : System.out.println("Today is Tuesday");break;
			case "Wednesday" : System.out.println("Today is Wednesday");break;
			case "Thursday" : System.out.println("Today is Thursday");break;
			case "Friday" : System.out.println("Today is Friday");break;
			case "Saturday" : System.out.println("Today is Saturday");break;
			case "Sunday" : System.out.println("Today is Sunday");break;
			default : System.out.println("Input is something wrong!!!");
		}
		
		//
		System.out.println("Your Code Pointing is here");
		
		String days = "Monday"; //Enum
		switch(days) {
			case "Monday","Mon","M" -> System.out.println("Today is Monday");
			case "Tuesday" -> System.out.println("Today is Tuesday");
			case "Wednesday" -> System.out.println("Today is Wednesday");
			case "Thursday" -> System.out.println("Today is Thursday");
			case "Friday" -> System.out.println("Today is Friday");
			case "Saturday" -> System.out.println("Today is Saturday");
			case "Sunday" -> System.out.println("Today is Sunday");
			default -> System.out.println("Input is something wrong!!!");
		}
	}

}
