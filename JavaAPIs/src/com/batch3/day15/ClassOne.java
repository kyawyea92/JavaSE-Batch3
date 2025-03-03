package com.batch3.day15;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ClassOne implements InterfaceOne, InterfaceTwo {

	@Override
	public int doSomethingA(int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void deafaultInterfaceMethod() {
		System.out.println("This is default from ClassOne");
		InterfaceTwo.super.deafaultInterfaceMethod();
		InterfaceTwo.staticInterfaceMethod();
	}

	public static void main(String[] args) {
		ClassOne one = new ClassOne();
		one.deafaultInterfaceMethod();
		InterfaceOne.staticInterfaceMethod();
		InterfaceTwo.staticInterfaceMethod();
		
		// Record Examples
		var crane = new Crane(10,"Testing");
		System.out.println(crane);
		System.out.println(crane.numberEggs());
		System.out.println(crane.name());
		
		var crane2 = new Crane(12, 10, "Something");
		System.out.println(crane2);
		
		var crane3 = new Crane("A", "B");
		System.out.println(crane3);
		System.out.println(Crane.doSomethingA(10));
		
		System.out.println(Crane.result);
		
		if(crane instanceof Crane(int number,String value)) {
			System.out.println(number);
		}
		
		var couple = new Couple(new Bear("BearOne", List.of("List One")), new Bear("BearTwo", List.of("List Two")));
		System.out.println(couple.b().favoriteThings());
		

		if(couple instanceof Couple(Bear(String name, List<String> favoriteThings), Bear b)) {
			
		}
		
		Deque<Integer> deque = new LinkedList<>();
		deque.offer(10);
		deque.offer(4);
		deque.offer(1);
		System.out.println(deque);
		deque.addFirst(6);
		System.out.println(deque);
		deque.addLast(2);
		System.out.println(deque.offerFirst(8));
		System.out.println(deque);
		deque.offerLast(99);
		System.out.println(deque);
		System.out.println(deque.peekFirst());
		System.out.println(deque);
		System.out.println(deque.peekLast());
		System.out.println(deque);
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque);
		System.out.println(deque.poll());
		System.out.println(deque);
		System.out.println("----Pop----");
		System.out.println(deque.pop());
		System.out.println(deque);
		
	}

}
