package com.zensar.core;

public class User{
	
	public User(){
		super();
	}	
	public User(int salary, String name) {
	super();
	this.salary = salary;
	this.name = name;
}
	private  int salary;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}