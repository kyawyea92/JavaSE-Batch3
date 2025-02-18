package com.batch3.day13;

public class ExampleOne extends AbstractTwo implements ZooTrainTour {

	public static void main(String[] args) {
		AbstractOne one = new ExampleOne();
		ZooTrainTour tour = new ExampleOne();
		tour.methodA();
		tour.methodB();
		ZooTrainTour.methodD();
	}

	@Override
	void doSomethingTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		System.out.println("Mehtod A");
	}
}
