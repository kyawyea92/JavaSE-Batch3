package com.batch3.day2;

public class CondtionStatementExample {

	public static void main(String[] args) {
		
		//raining?
		   //true -> umberalla
		//sunny?
		   //true -> hat
		// "Today weather is good
		boolean raining = false;
		boolean sunny = false;
		
		if(raining) {
			System.out.println("I take umberalla.");
		}else if(sunny) {
			System.out.println("I take hat");
		}else {
			System.out.println("I like this weather.");
		}
		     
	}

}
