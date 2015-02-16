package com.zensar.core;

import java.util.Comparator;
import java.util.List;

public class OuterClass {
	public void print(){
		System.out.println("Print Outer Class");
	}
	public static class InnerStaticClass{
		public void printStatic(){
			System.out.println("Inner static class method");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.print();
		OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
		innerStaticClass.printStatic();
	}
	
}
