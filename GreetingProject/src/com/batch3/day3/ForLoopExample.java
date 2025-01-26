package com.batch3.day3;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for(int rowNumber = 1; rowNumber > 0 && rowNumber < 128;rowNumber++) {
			
			if(rowNumber == 65) {
				break;
			}
			System.out.println("Row Number "+rowNumber+" mark is "+(100-rowNumber));
			
		}
		System.out.println("Hi There!!");
	}

}
