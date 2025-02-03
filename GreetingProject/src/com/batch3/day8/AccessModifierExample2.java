package com.batch3.day8;

import com.batch3.day7.PublicAccessModifierExample;

public class AccessModifierExample2 {
	
	public static void main(String[] args) {
		PublicAccessModifierExample example = new PublicAccessModifierExample();
		int age = example.getAge();
		System.out.println("Age : "+age);
		PublicAccessModifierExample.getGender();
	}
	
}
