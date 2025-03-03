package com.batch3.day16;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Set<String> treeSet = new TreeSet<>();
		
		TreeSet<String> treeSet = new TreeSet<>(); //1-9 //A-Z a-b
		treeSet.add("Monday");
		treeSet.add("monday");
		treeSet.add("Tuesday");
		treeSet.add("Tuesday");
		treeSet.add("Wednesday");
		treeSet.add("Thursday");
		treeSet.add("Friday");
		//treeSet.add(null);
		//treeSet.add(null);
		
		System.out.println(treeSet);
		
		for(String value:treeSet) {
			System.out.println(value);
		}
		
		System.out.println("GetFrist :"+treeSet.getFirst());
		System.out.println("PollFirt : "+treeSet.pollFirst());
		System.out.println("------------");
		for(String value:treeSet) {
			System.out.println(value);
		}
		
		System.out.println(treeSet.reversed());
		//System.out.println(treeSet.get(0)); //not support method work hashkey
	}

}
