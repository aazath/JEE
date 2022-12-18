package com.ayana.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = "/third")
public class ThirdServlet extends GenericServlet{
	
	static {
		System.out.println("Servlet Loading....");
	}
	
	public ThirdServlet() {
		System.out.println("Servlet Instantiation....");
	}
	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
					//Request-Processing-logic
					System.out.println("providing the service for the users");
	
					// 1. Set the response type to HTML
						response.setContentType("text/html");
	
					// 2. Use PrintWriter object  to send the response
						PrintWriter out = response.getWriter();
						out.println("<html><head><title>Output</title></head>");
						out.println("<body>");
						out.println("<h1>Using the Generic Servlet...</h1>");
						out.println("</body>");
						out.println("</html>");
	
					// 3. Close the PrintWriter
						out.close();
		
	}

}
