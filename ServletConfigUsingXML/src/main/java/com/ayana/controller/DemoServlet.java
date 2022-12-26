package com.ayana.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("Test Servlet loading...");
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        System.out.println("Demo Servlet instantiation..");
    }
    
    public void init(){
    	System.out.println("Demo Servlet initialization..");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
