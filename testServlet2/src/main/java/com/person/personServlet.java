package com.person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personServlet")
public class personServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String color = request.getParameter("color");
//		String hobby = request.getParameter("hobby");
		String[] hobby = request.getParameterValues("hobby");
		String[] subject = request.getParameterValues("subject");
//		String subject = request.getParameter("subject");
		
		response.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>"
				+ "<style type=\"text/css\">"
				+ "body{ color : "
				+ color
				+ ";}"
				+ "</style>"
				+ "</head>");
		out.println("<body>");
		out.println("<ul>"
				+ "<li> 이름 : " + name + "</li>"
				+ "<li> 성별 : " + gender +"</li>"
				+ "<li> 색깔 : " + color + "</li>"
				+ "<li> 취미 : ");
		for(int i=0; i<hobby.length; i++) {
			out.println(hobby[i] + "  ");
		}
		out.print("</li>"
				+ "<li> 과목 : ");
		for(int i=0; i<subject.length; i++) {
			out.println(subject[i] + "  ");
		}
		out.println("</li>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
