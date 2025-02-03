package com.batch3.day7;

public class PublicAccessModifierExample {
	
	public String name = "James";
	
	private int age = 30;
	
	private static char gender = 'M';
	
	public static void main(String[] args) {
		PublicAccessModifierExample accessModifier = new PublicAccessModifierExample();
		accessModifier.getName();
		int age = accessModifier.getAge();
		System.out.println(age);
		System.out.println("My Gender : "+gender);
	}
	
	
	void getName() {
		System.out.println(name);
	}
	
	public int getAge() {
		int age = 40;
		return this.age;
	}
	
	public static void getGender() {
		System.out.println("Sex : "+gender);
	}

}
