<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.dao.MemberDAO"%>

<%
//데이터
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

//DB
MemberDAO memberDAO = MemberDAO.getInstance(); //싱글톤
String name = memberDAO.getLoginUserName(id, pwd);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(name != null){ %>
	<h3><%=name %>님이 로그인에 성공하셨습니다.</h3>
<%}else{ %>
	<h3>아이디 또는 비밀번호가 틀렸습니다.</h3>
<%} %>
</body>
</html>