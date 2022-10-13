package member.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.bean.MemberDTO;
import member.dao.MemberDAO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		MemberDTO memberDTO = new MemberDTO();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		memberDTO.setId(id);
		memberDTO.setPwd(pwd);
		MemberDAO memberDAO = new MemberDAO();
		
		response.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = response.getWriter();
		String name = memberDAO.getLoginUserName(memberDTO);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>");
		
		if(name == null) {
			out.println("아이디 또는 비밀번호가 틀렸습니다");
		}else {
			out.println(name + "님이 로그인하셨습니다 </p>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}
	

}
