package com.batch3.day3;

import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		System.out.print("Please input between 1 to 100 : ");
		Scanner sc = new Scanner(System.in);
		int rowNumber = sc.nextInt();
		do {
			System.out.println("Row Number "+rowNumber+" mark is "+(100-rowNumber));
			rowNumber++;
		}while(rowNumber > 0 && rowNumber <= 100);
	}

}
