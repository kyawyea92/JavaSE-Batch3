package com.batch3.day10;

public class EncapsulationMain {

	
	public static void main(String[] args) {
		Student std = new Student();
		
		std.setName("Kyaw");
		std.setAge(30);
		std.setAddress("Yangon");
		
		System.out.println("std: Name - " +std.getName());
		System.out.println("std: Address - " +std.getAddress());
		System.out.println("std: Age - " +std.getAge());
		
		Student std2 = new Student();
		
		std2.setName("Aung");
		std2.setAge(40);
		std2.setAddress("Mandalay");
		
		System.out.println("std2: Name - " +std2.getName());
		System.out.println("std2: Address - " +std2.getAddress());
		System.out.println("std2: Age - " +std2.getAge());
	}
}
