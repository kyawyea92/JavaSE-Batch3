package com.batch3.day3;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.print("Please input number ");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		System.out.println("Your Input Value is "+number1);
		
		System.out.print("Please input some text here -> ");
		String text = sc.next();
		System.out.println("Your Input Text is "+text);
	}

}
