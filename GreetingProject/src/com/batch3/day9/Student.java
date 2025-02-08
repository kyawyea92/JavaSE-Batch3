package com.batch3.day9;

public class Student { //student
	
	private static String address; //static variable
	private String name; //instance varaible
	private char gender; // instance varaible
	
	public static void main(String[] args) {
		int age = 30; // local variable
		Student std = new Student();
		System.out.println("My age is : "+age);
		System.out.println("My address variable is : "+address);
		std.getAddress();
	//	System.out.println("My name method is : "+getName());
		Student std2 = new Student();
	//	System.out.println("My gender is "+ std2.getGender() );
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
}
