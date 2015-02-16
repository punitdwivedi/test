package com.example.soap.client;

import com.example.soap.impl.HelloWord;
import com.example.soap.impl.HelloWordImplService;

public class JAXWSClient {
	public static void main(String[] args) {
		HelloWordImplService helloWordImplService = new HelloWordImplService();
		HelloWord helloWord = helloWordImplService.getHelloWordImplPort();
		String greetingText = helloWord.helloWord("Punit");
		System.out.println(greetingText);
	}
}
