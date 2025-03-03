package com.batch3.day15;

public interface InterfaceTwo {
	public abstract int doSomethingA(int num1);
	default void deafaultInterfaceMethod() {
		System.out.println("This is default from interfaceTwo");
	}
	static void staticInterfaceMethod() {
		System.out.println("This is static method from interfaceTwo");
	}
}
