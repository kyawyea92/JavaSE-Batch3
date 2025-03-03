package com.batch3.day16;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("3CS_001", "Pass");
		hashMap.put("3CS_002", "Pass");
		hashMap.put("3CS_004", "Pass");
		
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.get("3CS_002"));
		System.out.println(hashMap.putIfAbsent(null, "Fail"));
		//System.out.println(hashMap.putIfAbsent(null, "Pass"));
		System.out.println("--------------");
		System.out.println(hashMap);
		System.out.println(hashMap.getOrDefault("3CS_003", "I'm sorry!!! You didn't pass the exam"));
		System.out.println(hashMap.values());
		
		for(String valueList : hashMap.values()) {
			System.out.println(valueList);
		}
		
	}

}
