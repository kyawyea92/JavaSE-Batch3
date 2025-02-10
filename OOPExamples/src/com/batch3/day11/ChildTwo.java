package com.batch3.day11;

public class ChildTwo extends ParentOne{//IS-a relationship
	String myName = "Zaw Zaw";
	public static void main(String[] args) {
		ChildTwo childTwo = new ChildTwo();
		childTwo.doRich();
		childTwo.doBeauty();
		System.out.println(childTwo.parentName);
		System.out.println(childTwo.lastName);
		System.out.println(childTwo.myName);
		childTwo.chessChampion();
		//Has-a relationship
		ParentOne parentOne = new ParentOne();
		parentOne.doBeauty();
	}
	
	public void chessChampion() {
		System.out.println("Yes, I'm the Champion at 2020.");
	}
}
