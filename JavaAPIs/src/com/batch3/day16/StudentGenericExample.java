package com.batch3.day16;

public class StudentGenericExample<T,R> {
	private T name;
	private T age;
	private T address;
	public R getName() {
		return (R) name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public R getAge() {
		return (R) age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	public R getAddress() {
		return (R) address;
	}
	public void setAddress(T address) {
		this.address = address;
	}
}
