package com.zensar.core;

public class PassByValue {
	
	public static void main(String[] args) {
		Baloon b1= new Baloon("Red");
		Baloon b2 = new Baloon("Blue");
		swap(b1, b2);
		System.out.println("B1 color - "+ b1.getColor());
		System.out.println("B2 color - "+ b2.getColor());
		doOperation(b2);
		System.out.println("B2 color - "+ b2.getColor());
		
	}
	
	private static void swap(Object o1, Object o2){
		Object temp = o1;
		o1=o2;
		o2=temp;
	}
	
	private static void doOperation(Baloon baloon){
		baloon.setColor("Red");
		baloon  = new Baloon("Green");
		baloon.setColor("Blue");
	}
}

class Baloon{
	private String color;

	public Baloon() {
		super();
	}
	
	public Baloon(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
