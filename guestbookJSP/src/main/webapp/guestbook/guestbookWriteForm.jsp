<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#tableHead{
	width : 150px;
}
#name{
	width : 300px;
}
#email{
	width : 350px;
}
#homepage{
	width : 400px;
	
}
#subject{
	width : 500px;
}
#content{
	width : 480px;
	height : 200px;

} 
div {
	color : red;
}
</style>
</head>
<body>
<h3>글쓰기</h3>
<form name="guestWriteFrom" action="http://localhost:8080/guestbookJSP/guestbook/guestbookWrite.jsp" method="post"> 
	<table border="1" width="600px">
		<tbody>
			<tr>
				<th id="tableHead">작성자</th>
				<td>
					<input type="text" name="name" id="name" maxlength='30' placeholder="작성자 입력">
				</td>
			</tr>
			<tr>
				<th id="tableHead">이메일</th>
				<td>
					<input type="text" name="email" id="email" maxlength='30' placeholder="이메일 입력">
				</td>
			</tr>
			<tr>
				<th id="tableHead">홈페이지</th>
				<td><input type="text" name="homepage" id="homepage" maxlength='35' value="http://"></td>
			</tr>
			<tr>
				<th id="tableHead">제목</th>
				<td>
					<input type="text" name="subject" id="subject" maxlength='500' placeholder="제목 입력">
					<div id="subjectDiv"></div>
				</td>
			</tr>
			<tr>
				<th id="tableHead">내용</th>
				<td>
					<textarea rows="10" cols="50" name="content" id="content" placeholder="내용 입력" ></textarea>
					<div id="contentDiv"></div>
				</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
			
				<td colspan="2" align="center">
					<input type="button" onclick="checkGuestbookWrite()" value="글작성">
					<input type="reset" value="다시작성">
					<input type="button" value="글목록" onclick="location.href='http://localhost:8080/guestbookJSP/guestbook/guestbookList.jsp'">
				</td>
			</tr>
		</tfoot>
	</table>
</form>
<script type="text/javascript">
	//글 제목과 글 내용에 대한 유효성 검사
	function checkGuestbookWrite(){
		document.getElementById("subjectDiv").innerText="";
		document.getElementById("contentDiv").innerText="";
		
		if(document.getElementById("subject").value == ""){
			document.getElementById("subjectDiv").innerText="제목을 입력하세요.";
		}else if(document.getElementById("content").value == ""){
			document.getElementById("contentDiv").innerText="내용을 입력하세요.";
		}else{
			document.guestWriteFrom.submit();
		}
	}
</script>
</body>
</html>