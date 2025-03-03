package com.batch3.day16;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<>();
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Monday");
		hashSet.add("Tuesday");
		hashSet.add("Tuesday");
		hashSet.add("Wednesday");
		hashSet.add("Thursday");
		hashSet.add("Friday");
		hashSet.add(null);
		hashSet.add(null);
		
		System.out.println(hashSet);
		
		for(String value:hashSet) {
			System.out.println(value);
		}
		
		System.out.println(hashSet.contains("monday"));
		

		System.out.println("-------------");
		Iterator<String>  iterator =   hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			/*
			if(iterator.next() != null && iterator.next().equals("Friday")) {
				iterator.remove();
				continue;
			}else {
				System.out.println(iterator.next());
			}
			*/
		}
		
	}

}
