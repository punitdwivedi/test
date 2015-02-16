package com.zensar.core;

public class Test {
	public static void main(String[] args) {
		OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
		innerStaticClass.printStatic();
	}
}
