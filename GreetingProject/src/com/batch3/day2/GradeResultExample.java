package com.batch3.day2;

public class GradeResultExample {

	public static void main(String[] args) {
		//Grade A , B ,C,D,E
		// 81->100  = GradeA
		// 61->80 = GradeB
		// 41 -> 60 = GradeC
		// 21 -> 40 = GradeD
		// 0 -> 20 = GradeE
		// please check again!
		/*
		int mark1 = 40;
		int mark2 = 40;
		System.out.println(mark1 == mark2);
		
		System.out.println(mark1 != mark2);
		
		System.out.println(mark1 > mark2);
		System.out.println(mark1 >= mark2);
		
		System.out.println(mark1 <= mark2);
		*/
		
		// && true true = true
		// & true false = false
		// & false false = false
		
		// || true true = true
		// || true false = true
		// || false false = false
		
		// ! true ->false
		// ! false -> true
		int engMark = 8;
		
		if(engMark > 80 && engMark <= 100) {
			System.out.println("Grade A");
		}else if(engMark > 60 && engMark <= 80) {
			System.out.println("Grade B");
		}else if(engMark > 40 && engMark <= 60) {
			System.out.println("Grade C");
		}else if(engMark > 20 && engMark <= 40) {
			System.out.println("Grade D");
		}else if(engMark >= 0 && engMark <= 20 ) {
			System.out.println("Grade E");
		}else {
			System.out.println("Something wrong!!!");
		}
		
		int physicMark = 90;
		
		if(!(physicMark > 80) ) {
			System.out.println("PhysicMark is grater than 80");
		}
	}

}
