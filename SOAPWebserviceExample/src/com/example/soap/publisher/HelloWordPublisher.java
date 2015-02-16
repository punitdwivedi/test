package com.example.soap.publisher;

import javax.xml.ws.Endpoint;

import com.example.soap.impl.HelloWordImpl;

public class HelloWordPublisher {

		public static void main(String[] args) {
			Endpoint.publish("http://localhost:8080/WS/HelloWorld", new HelloWordImpl());
		}
}
