package com.example.soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.example.soap.impl.HelloWord;


public class JAXWSClientPlain {
	public static void main(String[] args) {
		URL url= null;
		try {
			url = new URL("http://localhost:8080/WS/HelloWorld?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName qName = new QName("http://impl.soap.example.com/", "HelloWordImplPort");
		Service service = Service.create(url, qName);
		HelloWord helloWord = service.getPort(HelloWord.class);
		System.out.println(helloWord.helloWord("Punit"));
	}
}
