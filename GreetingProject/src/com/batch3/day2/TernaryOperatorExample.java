package com.batch3.day2;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int engMark = 61;
		
		String result = engMark > 50 ? "Pass" :  "Fail";
		
		System.out.println(result);
		
		
		if(engMark > 80 && engMark <= 100 ) {
			System.out.println("Grade A");
		}else if(engMark >60 && engMark <=80) {
			System.out.println("Grade B");
		}else {
			System.out.println("Grade C");
		}
	}

}
