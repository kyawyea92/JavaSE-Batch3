package com.batch3.day4;

public class PrimitiveDataTypeExample {

	static Byte byteValue = 127 ; // reference data type
	static Short shortValue ;
	static Integer intValue ;
	static Long longValue;
	
	
	
	static Double doubleValue;
	static Float floatValue;
	
	static Character charValue; //ASCII code
	static Boolean booleanValue;
	
	static String name;
	
	public static void main(String[] args) {
		System.out.println("-----int data types-----");
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		
		System.out.println("-----decimal-----");
		System.out.println(doubleValue);//default value 0.0
		System.out.println(floatValue);
		
		System.out.println("---char & boolean----");
		
		System.out.println(charValue);
		System.out.println(booleanValue);
		System.out.println(name);
	}

	
}
