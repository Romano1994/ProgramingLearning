package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init() {
		System.out.println("init() 메소드");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("doGet() 메소드");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello Servlet <br>");
		out.println("안녕하세요 서블릿 <br>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy() {
		System.out.println("destroy() 메소드");
	}
	


}
