<%@page import="java.io.PrintWriter"%>
<%@page import="guestbook.dao.GuestbookDAO"%>
<%@page import="guestbook.bean.GuestbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	#alert{
		margin-top: 30px;
		margin-left: 30px;	
		width: 200px;
	}
	#alertButton{
		margin-top: 10px;
		margin-bottom: 10px;
	}
</style>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	
	// 입력된 정보를 변수에 저장
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String homepage = request.getParameter("homepage");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");

	// 저장된 변수를 DTO로 전달, 저장
	GuestbookDTO guestbookDTO = new GuestbookDTO();
	guestbookDTO.setName(name);
	guestbookDTO.setEmail(email);
	guestbookDTO.setHomepage(homepage);
	guestbookDTO.setSubject(subject);
	guestbookDTO.setContent(content);
	
	// 서버에 저장하기 위한 DAO 객체 생성
	GuestbookDAO guestbookDAO = GuestbookDAO.getInstance();
	
	// DTO 객체를 서버에 저장하고 성공 여부를 int 형태로 제공
	int su = guestbookDAO.guestbookWrite(guestbookDTO);
	%>
	<table id="alert" border="1">
		<tr>
			<td align="center">
				<!-- 글 작성 성공 여부 -->
				<%
				if (su == 1) {
					out.println("작성하신 글을 저장했습니다");
				} else {
					out.println("작성에 실패하였습니다");
				}
				%>
			</td>
		</tr>
		<tr>
			<!-- 글목록 이동 버튼 -->
			<td align="center">
				<input type="button" id="alertButton" value="글목록"
				onclick="location.href='http://localhost:8080/guestbookJSP/guestbook/guestbookList.jsp'">
			</td>
		</tr>
	</table>


</body>
</html>