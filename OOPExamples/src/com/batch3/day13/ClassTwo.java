package com.batch3.day13;

public class ClassTwo extends ClassOne {
	public static void main(String[] args) {
		
		int a =5;
		int b = 0;
		
		if(b!=0) {
			int c = a/b;
			System.out.println(c);
		}
		/*ClassOne classOne = new ClassOne();
		classOne.doSomethingA();*/
		ClassTwo classTwo = new ClassTwo();
		classTwo.doSomethingA();
		classTwo.doAction();
		System.out.println(WeekDays.FRIDAY.getShortName());
		WeekDays.SATURDAY.methodA();
		
		SealedClassExample4 example4 = new SealedClassExample4();
		String result =  classTwo.patternMatching(example4);
		System.out.println(result);
	}
	
	@Override
	public void doSomethingA() {
		System.out.println("ClassTwo: DoSomethingA");
	}

	@Override
	void doActionOne() {
		// TODO Auto-generated method stub
		
	}
	
	public String patternMatching(SealedClassExample example) {
		return switch(example) {
			case SealedClassExample4 example4 -> "This is example 4";
			case SealedClassExample2 example2 -> "This is example 2";
			default -> throw new IllegalArgumentException("Unexpected value: " + example);
		};
	}
}
