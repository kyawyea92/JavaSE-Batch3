package com.batch3.day7;

public class AccessModifierExample1 {
	
	void printName() {
		PublicAccessModifierExample accessModifierExample = new PublicAccessModifierExample();
		//System.out.println("Name : "+accessModifierExample.name);
		int age = accessModifierExample.getAge();
		System.out.println("Age : "+age);
	}
	public static void main(String[] args) {
		AccessModifierExample1 example1 = new AccessModifierExample1();
		example1.printName();
		PublicAccessModifierExample example = new PublicAccessModifierExample();
		example.getName();
		
		PublicAccessModifierExample.getGender();
	}
}
