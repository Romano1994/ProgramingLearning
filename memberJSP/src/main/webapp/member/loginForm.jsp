<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="loginForm" method="post" action="login.jsp">
		<table border = "1" width="300" celpadding="5" cellspacing="0">
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" id="id" name="id" placeholder="아이디 입력" onkeydown="inputIdcheck()">
					<div id="idDiv"></div>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" id="pwd" name="pwd" placeholder="비밀번호 입력">
					<div id="pwdDiv"></div>
				</td>
			</tr>
			<tr>
				<th colspan="2">
				<input type="button" value="로그인" onclick="checkLogin()">
				<input type="button" value="회원가입" onclick="location.href='writeForm.jsp'">
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function checkLogin(){
			document.getElementById("idDiv").innerText="";
			document.getElementById("pwdDiv").innerText="";
			if(document.getElementById("id").value == ""){
				document.getElementById("idDiv").innerText="아이디를 입력하세요.";
			}else if(document.getElementById("pwd").value == ""){
				document.getElementById("pwdDiv").innerText = "비밀번호를 입력하세요";
			}else{
				document.loginForm.submit();
			}
		}
	</script>
</body>
</html>