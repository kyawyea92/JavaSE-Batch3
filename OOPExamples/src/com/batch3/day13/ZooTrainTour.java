package com.batch3.day13;

public interface ZooTrainTour {
	void methodA();
	
	default void methodB() {
		methodA();
	}
	
	private void methodC() {
		methodB();
	}
	private static void methodE() {
		System.out.println("Method E");
	}
	static void methodD() {
		//methodA(); COMPILE ERROR
		//methodB(); COMPILE ERROR
		//methodC(); COMPILE ERROR
		methodE();
		
	}
}
