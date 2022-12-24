package com.ayana.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/reqs")
public class ReqTypes extends HttpServlet{
	
	static {
		System.out.println("Servlet loading...");
	}
	
	public ReqTypes() {
		System.out.println("servlet instantiation..");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		System.out.println("Request type is Get");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		System.out.println("Request type is Post");		
	}

}
