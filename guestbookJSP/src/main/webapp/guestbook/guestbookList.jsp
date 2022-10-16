<%@page import="guestbook.bean.GuestbookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="guestbook.dao.GuestbookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%! 
    // 서버와 연결해서 글 내용을 불러오기 위한 DAO객체 생성
    GuestbookDAO guestbookDAO = new GuestbookDAO();
    
    // 입력된 DTO객체를 생성해서 보관하기 위한 Arraylist 생성
    ArrayList<GuestbookDTO> list =  guestbookDAO.guestbookList();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
input {
	width: 95%;
}
</style>
</head>
<body>
	<form action="" method="post">
	
	<%-- 생성된 글의 갯수만큼 반복 --%>
	<% for(int i=0; i<list.size(); i++){%> 
		<table border="1">
			<tr>
				<th id="textBox">작성자</th>
				<td><input type="text" name="name" id="name" readonly="readonly" value=<%=list.get(i).getName() %>></td>
				<th id="textBox">작성일</th>
				<td><input type="text" name="date" id="date" readonly="readonly" value=<%= list.get(i).getLogtime() %>>
			</tr>
			<tr>
				<th id="textBox">이메일</th>
				<td><input type="text" name="email" id="email" readonly="readonly" value=<%= list.get(i).getEmail() %>></td>
			</tr>
			<tr>
				<th id="textBox">홈페이지</th>
				<td><input type="text" name="homepage" id="homepage" readonly="readonly" value=<%= list.get(i).getHomepage() %>></td>
			</tr>
			<tr>
				<th id="textBox">제목</th>
				<td><input type="text" name="subject" id="subject" readonly="readonly" value= <%= list.get(i).getSubject() %>></td>
			</tr>
			<tr>
				<td colspan="4" style='height: 250px; width: 480px;'>
					<textarea rows="15" cols="70" readonly="readonly"> <%= list.get(i).getContent() %></textarea>
				</td>
			</tr>
		</table>
		<hr>
		<%} %>
	</form>
</body>
</html>