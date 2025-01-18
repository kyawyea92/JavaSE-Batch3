package com.batch3.day2;

public class ArithmeticOperatorsExample {
	//() -block
	//{} - curly brace - bracket
	//[] - 
	public static void main(String[] args) {
		String myAddress = "";
		int fstNumber = 6; //number variable
		int secNumber = 10;// a variable 10 initialize
		int thNumber = 3;
		System.out.println(fstNumber + secNumber + thNumber);//use
		System.out.println(fstNumber - secNumber - thNumber);
		System.out.println(fstNumber * secNumber + thNumber);
		System.out.println(fstNumber / secNumber / thNumber);
		System.out.println(fstNumber % secNumber % thNumber);
		
		System.out.println(fstNumber - ((secNumber * thNumber) / fstNumber)); //6-(30)
									//	(6-5)
		
		secNumber +=  fstNumber;
		fstNumber -= secNumber; //fristNumber -= secondNumber;
		System.out.println("This is firstNumber result " +fstNumber);
		
		//Unary Operator
		
		System.out.println("This is firstNumber Value "+fstNumber);
				//6				//7
		int increaseNumber =  fstNumber++;
				//6				//6
		int decreaseNumber =  --fstNumber;
		
		System.out.println("This is Increment firstNumber Value  "+increaseNumber);
		System.out.println("This is Decrease Value "+decreaseNumber);
		System.out.println("This is FirstNumber value "+fstNumber);
		System.out.println();
		
		
		int x = 0;
		int y = 1;
		int z = x+y; //1 = 0 + 1 
		//x = x+y; // 1= 0+1
		x -= y; //x = x - y;
		System.out.println(z);
		System.out.println(x);
	}

}
