package com.ayana.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqHeaderApp
 */
@WebServlet(urlPatterns = "/response", loadOnStartup = 1)
public class BrowserResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet loading...");
	}
	
	public BrowserResponseApp(){
		System.out.println("servlet instantiazation...");
	}
	
	public void init()
	{
		System.out.println("servlet initialization....");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request processing for Get Request Method...");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Get Request Details</title></head>");
		out.println("<body>");
		out.println("<H1 align='center'>Request Header Information</h1>");	
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");
		while(headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println("<tr><td>"+ headerName +"</td><td>"+ headerValue +"</td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
	
	public void destroy() {
		System.out.println("servlet de-instantiazation...");
	}

}
