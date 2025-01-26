package com.batch3.day3;

import java.util.Scanner;

public class WhileLoopExmaple {
	public static void main(String[] args) {
		System.out.print("Please input number between 1 to 100 :");
		Scanner sc = new Scanner(System.in);
		long rowNumber = sc.nextInt();
		while(rowNumber>= 0 && rowNumber <= 100) {
			System.out.println("Row Number "+rowNumber+" mark is "+(100-rowNumber));
			// last line increasement or dec
			rowNumber++;
		}
	}	
}
