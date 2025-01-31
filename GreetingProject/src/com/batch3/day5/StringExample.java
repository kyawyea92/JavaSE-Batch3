package com.batch3.day5;

public class StringExample {
	static String name="Justin"; //static class variable - null
	
	String nickName="Lwin"; //instance variable - null value
	
	public static void main(String[] args) { //static method
		
		String address = ""; // local variable
		
		StringExample example = new StringExample(); //Object create
		
		System.out.println(address);
		System.out.println("Name is " + name);
		System.out.println("Nickname is "+ example.nickName);
		System.out.println("NickName length is "+ example.nickName.length());
		System.out.println("CharAt 0 : "+example.nickName.charAt(2));
		System.out.println("Change to Lowercase : "+example.nickName.toLowerCase());
		System.out.println("Change to Uppercase : "+example.nickName.toUpperCase());
		System.out.println("Equal Operator: "+ (example.nickName == example.nickName));
		System.out.println("Equal method :"+example.nickName.equals("Lwin"));
		System.out.println(example.nickName.isEmpty());
		System.out.println("Check startWith : "+example.nickName.startsWith("l"));
		
		example.greet();
		
		myAddress();
	}
	
	public void greet() { //instance method
		String greetText  = "Hello Greeting";//local variable
		System.out.println(name);
		System.out.println(nickName);
		System.out.println(greetText);
		myAddress();
	}
	
	public static void myAddress() { // static method
		System.out.println("My address : Yangon");
	}
}
