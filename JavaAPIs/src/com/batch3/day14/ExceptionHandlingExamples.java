package com.batch3.day14;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		
		try {
			int firtNumber = 10;
			int secondNumber =0;
			int result = firtNumber/ secondNumber;
			System.out.println(result);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.err.println("Second Number must not be zero");
		}finally {
			System.out.println("Do everytime error occur or not");
		}
		System.out.println("System ended in here");
		//checkNumber(-10);
		
		try {
			checkPhoneNumber("qbag");
		} catch (NumberFormatException e) {
			System.out.println("You must input correct value");
		}
		
	}
	
	public static void checkNumber(int number) {
		
		if(number <=0) {
			throw new IllegalArgumentException("Number greater than zero");
		}
		System.out.println("Your input is correct");
	}
	
	public static void checkPhoneNumber(String phoneNumber) throws NumberFormatException {
			
		 int result = Integer.parseInt(phoneNumber);// String -> int
		 System.out.println("Your input is "+result);
	}

}
