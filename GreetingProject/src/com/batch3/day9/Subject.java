package com.batch3.day9;

public class Subject {
	//subject : Myanmar,English,Math
	//pass mark : every subject greater than equal 50
	// subject varaible
	// check mark >= 50;
	// myanmar mark  50 - pass  condition 
	// eng mark  60 - pass condition
	// math mark 40 - fail condition
	//Array
	
	static int checkPoint = 50;
	public static void main(String[] args) {
		
	
		String[] subjects = new String[3];
		subjects[0] = "Myanmar";
		subjects[1] = "English";
		subjects[2] = "Math";
		
		System.out.println(subjects[0]);
		System.out.println(subjects[1]);
		System.out.println(subjects[2]);
		
		for(int index = 0; index < 3; index++) {
			System.out.println("Subject : "+subjects[index]);
		}
		
		/*
		 * another example format
		 */
		String[] sub = {"Myanmar","English","Math","Physics","Bio"};
		//System.out.println(sub.length);
		for(int index = 0; index < sub.length ; index++) {
			System.out.println("example2: Subject - "+sub[index]);
		}
		
		/*
		 * two -dimensional array
		 */
		
		int[][] tD2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int out = 0; out<4; out++) {
			for(int inner = 0; inner<4; inner++) {
				System.out.print(tD2[out][inner]+"\t");
			}
			System.out.println();
		}
		
		/*
		 * 
		 * two-Dime
		 */
		
		int[][] twoDim = new int[4][4];
		twoDim[0][0] = 1;
		twoDim[0][1] = 2;
		twoDim[0][2] = 3;
		twoDim[0][3] = 4;
		twoDim[1][0] = 5;
		twoDim[1][1] = 6;
		
		for(int out = 0; out<4; out++) {
			for(int inner = 0; inner<4; inner++) {
				System.out.print(twoDim[out][inner]+"\t");
			}
			System.out.println();
		}
		
		
		/*
		 * marks example
		 */
		double[] marks = new double[3];
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 40;
		
		for(int index = 0; index <3; index++) {
			//System.out.println("Marks : "+marks[index]);
			if(marks[index] >= checkPoint) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
			
		}
		
		
		
	}
}
