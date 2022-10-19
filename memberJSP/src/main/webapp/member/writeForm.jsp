<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입</h2>
		<form name="signUpForm" method="post" action="write.jsp">
			<table border="1" width="600"celpadding="3"cellspacing="0">
				<tr>
					<th><label for="userName">이름</label></th>
					<td>
						<input type="text" name="name" id="userName" placeholder="이름 입력">
						<div id="nameDiv"></div>
					</td>
				</tr>
				<tr>
					<th><label>아이디</label></th>
					<td>
						<input type="text" name="id" id="id" placeholder="아이디 입력" onkeydown="inputIdcheck()">
						<input type="button" value="중복체크" onclick="checkId()">
						<input type="text" id="check" name="check">
						<div id="idDiv"></div>
					</td>
				</tr>
				<tr>
					<th><label>비밀번호</label></th>
					<td>
						<input type="password" id="pwd" name="pwd">
						<div id="pwdDiv"></div>
					</td>
				</tr>
				<tr>
					<th><label>재확인</label></th>
					<td>
						<input type="password" id="repwd" name="repwd">
						<div id=rePwdDiv></div>
					</td>
				</tr>
				<tr>
					<th><label for="user_gender">성별</label></th>
					<td>
						<input type="radio" name="gender" id="gender_m" value="0" checked/>
						<label for="gender_m">남자</label>			
						<input type="radio" name="gender" id="gender_f" value="1" />
						<label for="gender_f">여자</label>	
					</td>		
				</tr>
			<tr>
				<th><label for="email1">이메일</label></th>
				<td>
					<input type="text" name="email1" id="email1"> 
					@
					<input type="text" id="email2" name="email2" style="width: 120px;"> 
					<select name="email3" onchange="change()">
						<option value="">직접입력</option>
						<option value="naver.com">naver.com</option>
						<option value="gmail.com">gmail.com</option>
						<option value="nate.com">nate.com</option>
					</select></td>
			</tr>
			<tr>
				<th><label for="tel1">휴대폰</label></th>
				<td>
					<select name="tel1" id="tel1">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
 					</select>
 					-
 					<input type="tel" name="tel2" id="tel2" style="width:50px;">
 					-
 					<input type="tel" name="tel3" id="tel3" style="width:50px;">
					</td>
				</tr>
				<tr>
					<th><label for="zipcode">주소</label></th>
					<td>
						<input type="text" id="zipcode" name="zipcode" readonly/>
						<input type="button" value="우편번호 검색" onclick="checkPost()"><br>
						<input type="text" name="addr1" id="addr1" style="width:400px;" placeholder="주소" readonly/><br>
						<input type="text" name="addr2" id="addr2" style="width:400px;" placeholder="상세주소">
					</td>
				</tr>
				<tr>
					<th colspan="2" >
						<button type="button" onclick="checkWrite()">회원가입</button>
						<button type ="reset">다시작성</button>
					</th>
				</tr>	
			</table>
		</form>
		<script type="text/javascript" src="../post/member.js"></script>
		<!-- 우편번호 -->
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script src="../post/post.js"></script>
</body>
</html>