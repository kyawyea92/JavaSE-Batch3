package com.batch3.day11;

public class ParentOne extends GrandParent implements Eatable,SleepAction{
	String parentName = "U Ba";
	
	void doRich() {
		System.out.println("I'm rich");
	}
	
	
	public void doBeauty() {
		System.out.println("Yep, Parent aren't handsome.");
	}
	
	public static void main(String[] args) {
		ParentOne parentOne = new ParentOne();
		parentOne.doSleep();
		parentOne.doRich();
	}

	@Override
	public void eat() {
		System.out.println("I eat rice ");
	}


	@Override
	public void doSleep() {
		System.out.println("I sleep late night");
	}
	
}
