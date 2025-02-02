package com.batch3.day6;

/**
 * 	name
 *  age
 *  address
 *  phoneNumber -
 *  gender - local variable - M^F
 *  rollNumber - local variable - 2st333
 *  addNewStudent - instance method
 *  deleteStudent - static method
 *  updateStudent
 */
public class StudentRegistrationExample {
    String name = "Aung Aung"; //instance variable
    int age;     //instance variable
    static String address; //static variable
    static String phoneNumber; //static variable
    
    public StudentRegistrationExample() {//no-agrs constructor
    	this('F',"3rd999");
    	System.out.println("This is No-args constructor");
    }
    
    public StudentRegistrationExample(char gender,String rollNumber) { // two -args constructor
    	System.out.println("-------start: Two Args constructor -------");
    	
    	System.out.println("const: My name is "+name);
		System.out.println("const: My age is "+age);
		System.out.println("const: My address is "+address);
		System.out.println("const: My PhoneNumber is "+phoneNumber);
		System.out.println("const: My Gender is "+gender);
		System.out.println("const: My RollNumber is "+rollNumber);
		System.out.println("-------end: Two Args constructor -------");
    }
    
	public static void main(String[] args) {
		//local variable
		char gender = 'M'; //local variable
		//Object initialize
		StudentRegistrationExample stdRegistration  = new StudentRegistrationExample();
		
		System.out.println("main: My name is "+stdRegistration.name);
		System.out.println("main: My age is "+stdRegistration.age);
		
		System.out.println("main: My address is "+address);
		System.out.println("main: My PhoneNumber is "+phoneNumber);
		
		String rollNumber = "1st32";//local variable
		stdRegistration.addNewStudent('F');
		stdRegistration.updateStudent(gender,null);
		//deleteStudent(gender,rollNumber);
		new StudentRegistrationExample(gender, rollNumber);
		
	}
	
	public void addNewStudent(char gender) { //instance method
		String name = "Zaw Zaw";//local variable
		System.out.println("add: My name is "+name);
		System.out.println("add: Instance variable name is "+this.name);
		System.out.println("add: My age is "+age);
		System.out.println("add: My address is "+address);
		System.out.println("add: My PhoneNumber is "+phoneNumber);
		System.out.println("add: My Gender is "+gender);
	}
	
	public void updateStudent(char gender,String rollNumber) { //instance method
		System.out.println("update: My name is "+name);
		System.out.println("update: My age is "+age);
		System.out.println("update: My address is "+address);
		System.out.println("update: My PhoneNumber is "+phoneNumber);
		System.out.println("update: My Gender is "+gender);
		System.out.println("update: My RollNumber is "+rollNumber);
	}
	/*
	public static void deleteStudent(char gender,String rollNumber) { //static method
		StudentRegistrationExample stdRegistration  = new StudentRegistrationExample();
		System.out.println("delete: My name is "+stdRegistration.name);
		System.out.println("delete: My age is "+stdRegistration.age);
		System.out.println("delete: My address is "+address);
		System.out.println("delete: My PhoneNumber is "+phoneNumber);
		System.out.println("delete: My Gender is "+gender);
		System.out.println("delete: My RollNumber is "+rollNumber);
	}
	*/
	
}
