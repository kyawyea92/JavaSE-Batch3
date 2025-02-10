package com.batch3.day11;

public class ParentOne extends GrandParent{
	String parentName = "U Ba";
	public void doRich() {
		System.out.println("I'm not rich");
	}
	
	public void doBeauty() {
		System.out.println("Yep, Parent aren't handsome.");
	}
	
	public static void main(String[] args) {
		ParentOne parentOne = new ParentOne();
		//parentOne.goodHealth();
	}
}
