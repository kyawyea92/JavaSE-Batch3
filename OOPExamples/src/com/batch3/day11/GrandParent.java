package com.batch3.day11;

public class GrandParent implements Eatable,SleepAction{
	String grandParentName = "U Maung";
	final String lastName  = "Shi";
	 void doRich() {
		System.out.println("I'm not rich");
	}
	
	public void doBeauty() {
		System.out.println("Yep, Parent aren't handsome.");
	}
	
	private void goodHealth() {
		System.out.println("Yep, Our generation has good health!");
	}

	@Override
	public void eat() {
		System.out.println("I eat noodel");
		
	}
	public void favouriteCurries() {
		
	}
	@Override
	public void doSleep() {
		System.out.println("I sleep early night");
	}
}
