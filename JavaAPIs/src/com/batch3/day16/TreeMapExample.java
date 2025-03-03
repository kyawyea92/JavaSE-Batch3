package com.batch3.day16;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("Mon", "Monday");
		treeMap.put("Tue", "Tuesday");
		treeMap.put("Wed", "Wednesday");
		treeMap.put("Thu", "Thursday");
		
		System.out.println(treeMap);
		System.out.println(treeMap.get("Mon"));
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.firstEntry());
		System.out.println(treeMap.firstEntry().getValue());
		//treeMap.put(null, "Empty");
		
		//treeMap.putFirst("Sun", "Sunday");
		//System.out.println("After Put First : "+treeMap); //get UnspportedOperationException
		System.out.println("----------");
		for(String value : treeMap.values()) {
			System.out.println(value);
		}
	}
}
