package com.batch3.day12;

public class ClassC implements InterfaceB{

	public static void main(String[] args) {
		//InterfaceA interfaceA = new InterfaceA();
		
		ClassC classC = new ClassC();
		classC.doSomethingA();
		classC.doSomethingB();
		classC.doDeafultAction();
		doStaticAction();
		//InterfaceA.doStaticAction();
		System.out.println("This year is "+ classC.thisYear);
		System.out.println("This year is "+ InterfaceA.thisYear);
	}

	@Override
	public void doSomethingA() {
		System.out.println("This is from DoSomethingA interfaceA");
	}

	@Override
	public void doSomethingB() {
		System.out.println("This is from DoSomethingB interfaceB");
		
	}
	static void doStaticAction() { //static method
		System.out.println("ClassC: Do Static Action");
	}
	
	//overloading
	void moneyChangertoUSD(String mmk) {
		
	}
	int moneyChangertoUSD(int amount) {
		return 0;
	}
	int moneyChangertoUSD(long amount) {
		return 0;
	}
	void moneyChangertoUSD(String jpn,String mmk) {
		
	}
	void moneyChangertoUSD(String jpn,String mmk,String baht) {
		
	}
}
