package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.soap.HelloWord;

@WebServlet(name="wsClientServlet", urlPatterns="/HelloClient")
public class WSClientServlet extends HttpServlet{
	
	
	private HelloWord helloWord;
	
	private static final String CONTENT_TYPE = "text/html;charset=UTF-8";

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		CharSequence greetingText= "";
		out.println(greetingText);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
}
