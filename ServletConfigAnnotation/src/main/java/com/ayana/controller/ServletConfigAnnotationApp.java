package com.ayana.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigAnnotationApp
 */
@WebServlet(
		urlPatterns = { "/test" }, 
		initParams = { 
				@WebInitParam(name = "jdbcUrl", value = "jdbc:mysql:///enterprisejava"), 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "password", value = "")
		})
public class ServletConfigAnnotationApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static {
		System.out.println("Servlet loading...");
	}

    public void init(){
    	System.out.println("Servlet initialization..");
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigAnnotationApp() {
    	System.out.println("Servlet instantiation..");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request processing...");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title></title></head>");
		out.println("<body align='center'>");
		out.println("<center/>");
		out.println("<table border='1'>");
		
		ServletConfig config = getServletConfig();
		Enumeration<String> parameterNames = config.getInitParameterNames();
		
		out.println("<tr><th>Parameter Name </th><th> Parameter Value </th></tr>");
		while(parameterNames.hasMoreElements()) {
			String parameterName = parameterNames.nextElement();
			String parameterValue = config.getInitParameter(parameterName);
			
			out.println("<tr><td>" + parameterName +"</td><td>" + parameterValue + "</td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();

}

    

}
