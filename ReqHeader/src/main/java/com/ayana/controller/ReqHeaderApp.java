package com.ayana.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqHeaderApp
 */
@WebServlet(urlPatterns = "/header", loadOnStartup = 1)
public class ReqHeaderApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet loading...");
	}
	
	public ReqHeaderApp(){
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
		// TODO Auto-generated method stub
		System.out.println("Processing the Get request...");
		System.out.println("Client IP address : "+request.getRemoteAddr());
		System.out.println("Client Host		  : "+request.getRemoteHost());
		System.out.println("Client Port		  : "+request.getRemotePort());
		System.out.println("Server Name		  : "+request.getServerName());
		System.out.println("Server Port		  : "+request.getServerPort());
		System.out.println("Servlet Path	  : "+request.getServletPath());
		
	}
	
	public void destroy() {
		System.out.println("servlet de-instantiazation...");
	}

}
