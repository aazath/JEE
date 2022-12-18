package com.ayana.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	static {
		System.out.println("Loading the servlet...");
	}
	
	public FirstServlet(){
		System.out.println("Servlet Instantiation...");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DeInstatiation of Servlet....");
		
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet initialization....");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// Request processing logic
		System.out.println("Providing service to the users...");
		
		//create the printwriter for sending the output for UI
		PrintWriter out = response.getWriter();
		
		//1. Set the response type
		response.setContentType("text/html");
		
		//2. setting the output
		out.println("<html><head><title>First Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>First Servlet Response</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		//3. Close the printwriter
		out.close();
		
	}

}
