package com.batch3.day13;

public abstract class ClassOne implements InterfaceOne{
	
	abstract void doActionOne();
	
	public void doSomethingA() {
		System.out.println("ClassOne: DoSomethingA");
	}

	@Override
	public void doAction() {
		System.out.println("ClassOne: doAction");
	}

}
