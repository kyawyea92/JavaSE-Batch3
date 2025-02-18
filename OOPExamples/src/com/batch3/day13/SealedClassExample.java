package com.batch3.day13;

//import com.batch3.day12.SealedClassExample5;

public  sealed class SealedClassExample permits SealedClassExample2,SealedClassExample4{//SealedClassExample5 Compile Error

	//public abstract void doSomethingA();

}

 sealed class SealedClassExample2 extends SealedClassExample permits  SealedClassExample3{

	//@Override
	public void doSomethingA() {
		// TODO Auto-generated method stub
		
	}

}
 
non-sealed class SealedClassExample3 extends SealedClassExample2{
	@Override
	public void doSomethingA() {
		// TODO Auto-generated method stub
		
	}

 }