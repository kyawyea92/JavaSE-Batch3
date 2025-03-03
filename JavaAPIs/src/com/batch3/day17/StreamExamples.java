package com.batch3.day17;

import java.util.ArrayList;

public class StreamExamples {

	public static void main(String[] args) {
		ArrayList<String> lastFourMonths = new ArrayList<String>();
		ArrayList<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		/*
		for(String month : months) { //stream
			if(month.endsWith("ber")) {//
				String upperMonth = month.toUpperCase();
				lastFourMonths.add(upperMonth);			
			}
		}
		for(String fourMonth: lastFourMonths) {
			System.out.println(fourMonth);
		}
		
		
		months.stream().filter(value -> value.endsWith("ber")).forEach(value-> {
			String upperMonth = value.toUpperCase();
			System.out.println(upperMonth);
		});
		*/
		months.stream()
				.filter(value -> value.endsWith("ber"))
				.map(value-> value.toUpperCase())
				.forEach(System.out::println);
		
	}

}
