package com.batch3.day13;

public class Student extends Subject{
	public String name;//MG Mg
	
	public Student() {
		this("Mg Mg");
		System.out.println(this.name + " - This is default const from Student class");
		
	}
	
	public Student(String name) {
		super();
		System.out.println("This is one-args cons from Student class");
		this.name = name;
	}
	
	
	public void addStudnet(String firstName, String lastName) {
		String name = "";
		this.name = firstName+" "+lastName;
		this.printName();
	}
	
	public void printName() {
		System.out.println(name);
	}
	@Override
	public void myanmarSubject() {
		super.myanmarSubject();
		//System.out.println("This is Myanmar Subject from Student class");
	}
	
	public static void getSubject() {
		System.out.println("Subject class static method");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.addStudnet("Kyaw", "Lwin");
		student.myanmarSubject();
		getSubject();
		
	}
}
