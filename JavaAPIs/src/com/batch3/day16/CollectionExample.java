package com.batch3.day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		/*
		//array
		String[] weeks = new String[7];
		weeks[0] = "Monday";
		weeks[1] = "Tuesday";
		weeks[2] = "Wednesday";
		weeks[3] = "Thursday";
		weeks[4] = "Friday";
		weeks[5] = "Saturday";
		
		for(String days: weeks) {//for-each
			System.out.println(days);
		}*/
		
		/*
		String[] weekDays = {"Monday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(String days: weekDays) {//for-each
			System.out.println(days);
		}
		*/
		
		ArrayList<String> weeksList = new ArrayList<>();
		
		weeksList.add("Tuesday");
		weeksList.add("Monday");
		weeksList.add("Tuesday");
		weeksList.add(0, "Wednesday");
		weeksList.add(2, "Friday");
		weeksList.addFirst("Sunday");
		weeksList.addLast("Saturday");
		
		/*
		for(int i =0; i < weeksList.size();i++) {
			if(i==3) {
				continue;
			}
			System.out.println(weeksList.get(i)+" - "+i);
		}
		*/
		
		for(String days: weeksList) {//for-each
			System.out.println(days);
		}
		System.out.println("------");
		System.out.println(weeksList.get(4));
		System.out.println(weeksList.getFirst());
		System.out.println(weeksList.getLast());
		
		
		System.out.println("------");
		System.out.println(weeksList.set(0, "Thursday"));
		weeksList.remove(3);
		weeksList.remove("Tuesday");
		//weeksList.clear();
		
		for(String days: weeksList) {//for-each
			System.out.println(days);
		}
		
		System.out.println(weeksList.isEmpty());
		System.out.println(weeksList.size());
		
		System.out.println("------");
		List<String> reverseWeekList = weeksList.reversed();
		for(String days: reverseWeekList) {//for-each
			System.out.println(days);
		}
		
		System.out.println("---LinkedList Example---");
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println(linkedList.size());
		linkedList.add("Monday");
		linkedList.add("Tuesday");
		linkedList.add("Tuesday");
		linkedList.add(null);
		//System.out.println("Peek method: "+linkedList.peek());
		//System.out.println("Poll method: "+linkedList.poll());
		System.out.println("------");
		for(String days: linkedList) {//for-each
			System.out.println(days);
		}
		
	}

}
