package com.day4;

abstract class Person{
	protected int id;
	protected String name;
	protected String email;
	
	public Person(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	//polymophic method
	public abstract void printDetails();
	
}