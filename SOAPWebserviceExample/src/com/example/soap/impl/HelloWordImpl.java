package com.example.soap.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.WebService;

import com.example.soap.HelloWord;

@WebService(endpointInterface="com.example.soap.HelloWord")
public class HelloWordImpl implements HelloWord{

	@Override
	public String helloWord(String name) {
		return "Hello " +name;
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("Post Construct is called...");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Predestroy is called...");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("HelloWordImpl: finalize is called");
	};

}
