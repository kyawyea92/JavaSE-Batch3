package com.batch3.day4;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input firstValue : ");
		double firstValue  = sc.nextDouble();
		
		System.out.print("Please input secondValue : ");
		double secondValue  = sc.nextDouble();
		
		System.out.print("Please input Operator (+,-,*,/) : ");
		String operator  = sc.next();
		
		/*double result1 = sum(3,7);//method call
		System.out.println("Sum : "+result1);
		
		double result2 = sub(3,7);
		System.out.println("Sub : "+result2);
		
		double result3 = mul(3,7);
		System.out.println("Mul : "+result3);
		
		double result4 = div(3,7);
		System.out.println("Div : "+result4);
		
		double result5 = ifCalculation(3, 2, "/");
		System.out.println(result5);*/
		
		double result6 = switchCalculation(firstValue,secondValue,operator);
		System.out.println("Result is : "+result6);
	}
	/*
	static double sum(double firstValue,double secondValue){//create initialize
		double thirdValue = firstValue + secondValue;
		return thirdValue;
	}
	
	static double sub(double firstValue,double secondValue){//create initialize
		double thirdValue = firstValue - secondValue;
		return thirdValue;
	}
	
	static double mul(double firstValue,double secondValue){//create initialize
		double thirdValue = firstValue * secondValue;
		return thirdValue;
	}
	
	static double div(double firstValue,double secondValue){//create initialize
		double thirdValue = firstValue / secondValue;
		return thirdValue;
	}
	*/
	
	static double ifCalculation(double firstValue,double secondValue,String operator){
		double thirdValue = 0;
		if(operator.equals("+")) {
			thirdValue = firstValue + secondValue;
		}else if(operator.equals("-")) {
			thirdValue = firstValue - secondValue;
		}else if(operator.equals("*")) {
			thirdValue = firstValue * secondValue;
		}else if(operator.equals("/")) {
			thirdValue = firstValue / secondValue;
		}
		return thirdValue;
	}
	
	static double switchCalculation(double firstValue,double secondValue,String operator){
		double thirdValue = switch(operator) {
		 case "+" -> firstValue + secondValue;
		 case "-" -> firstValue - secondValue;
		 case "*" -> firstValue * secondValue;
		 case "/" -> firstValue / secondValue;
		 default  -> 0.0;
		};
		return thirdValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
