package com.batch3.day11;

public class ChildOne extends ParentOne{
	String firstName = "Aye";
	String lastName = "Yin";
	public static void main(String[] args) {
		ChildOne childOne = new ChildOne();
		childOne.doRich();
		childOne.doBeauty();
		System.out.println(childOne.parentName);
		System.out.println(childOne.lastName);
		childOne.firstName = "Aye Aye";
		System.out.println(childOne.firstName);
		//childOne.goodHealth();
		System.out.println(childOne.grandParentName);
	}

}
