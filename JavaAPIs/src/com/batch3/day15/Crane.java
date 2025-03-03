package com.batch3.day15;

import java.util.List;

public final record Crane(int numberEggs,String name) {
	/*
	public Crane {
		numberEggs = 10;
		name = "Egg";
	}
	*/
	static int result = 10;
	
	public Crane(int count, int numberEggs,String name) {
		this(count,name);
	}

	public Crane(String firstName, String lastName) {
	      this(result, firstName + " " + lastName);
	   }

	public static int doSomethingA(int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	record Bears(int value) {
		
	}
}
record Bear(String name, List<String> favoriteThings) {}
record Couple(Bear a, Bear b) {}