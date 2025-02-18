package com.batch3.day12;

public interface InterfaceA {
	
	public static final int thisYear = 2025;
	void doSomethingA(); //abstract method
	
	default void doDeafultAction() { //default method
		System.out.println("Do Default Action");
		doStaticAction();
	}
	
	private static void doStaticAction() { //static method
		System.out.println("InterfaceA: Do Static Action");
	}
	
}
