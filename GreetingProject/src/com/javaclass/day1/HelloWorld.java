package com.javaclass.day1;



/**
 * This is first Java Program.
 * @author Kyaw Ye Lwin
 * @since 2025
 * @version 1
 */

public class HelloWorld {
	
	static char myChar;
	{
		System.out.println("HAHAHAHA");
	}
	/**
	 * <b>This method is use for start program.</b>
	 * @param args for user input
	 */
	public static void main(String[] args) {
		/*
		System.out.print("Hello World \t");
		System.out.println("Now I'm a Java Developer!!!");//ln -> line break
		System.out.print("I'm Kyaw Ye Lwin");
		*/
		
		int[] numbers = new int[10];
		numbers[0] = 1;
		System.out.println(numbers[0]);
		
		byte hat = 1;
		byte gloves = 7 * 10;
		short scarf = 5;
		short boots = 2 + 1;
		System.out.println();
		HelloWorld hello = new HelloWorld();
		System.out.println(myChar);
		System.out.print("Hello World \t");
		System.out.println("Now I'm a Java Developer!!!");//ln -> line break
		System.out.print("I'm Kyaw Ye Lwin");
		
		
		System.out.print("Hello World \t");
		System.out.println("Now I'm a Java Developer!!!");//ln -> line break
		System.out.print("I'm Kyaw Ye Lwin");
		
		{System.out.println("TEsting 111");}
	}
	
	
	public void patternMatching(Number number) {
		
		if(!(number instanceof Integer data)) { 
			return;
		}	
		data.intValue();
		System.out.println(data);
	}

}
