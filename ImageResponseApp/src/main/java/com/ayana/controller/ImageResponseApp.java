package com.ayana.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImageResponseApp
 */
@WebServlet("/image")
public class ImageResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageResponseApp() {
       System.out.println("Servlet instantiation...");
    }
    
    public void init() {
    	System.out.println("servlet initialization..");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/png");
		
		ServletOutputStream os = response.getOutputStream();
		String path = getServletContext().getRealPath("profile.png");
		System.out.println(path);
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = new byte[(int)(file.length())];
		fis.read(b);//reading and storing the image data into the byte array
		
		os.write(b);//writing the data as response from the byte array
		os.flush();
		
		fis.close();
		os.close();
	}

}
