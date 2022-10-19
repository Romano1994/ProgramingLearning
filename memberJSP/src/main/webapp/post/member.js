
function checkWrite(){
	document.getElementById("nameDiv").innerText = "";
	document.getElementById("idDiv").innerText = "";
	document.getElementById("pwdDiv").innerText="";
	
	if(document.getElementById("userName").value == ""){
		document.getElementById("nameDiv").innerText="이름을 입력하세요";
	
	}else if(document.getElementById("id").value == ""){
		document.getElementById("idDiv").innerText="아이디를 입력하세요";
	
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerText="비밀번호를 입력하세요";
		
	}else if(document.getElementById("pwd").value != document.getElementById("repwd").value){
		document.getElementById("pwdDiv").innerText="비밀번호가 맞지 않습니다.";
		
	}else if(document.signUpForm.id.value != document.signUpForm.check.value){
		document.getElementById("idDiv").innerText="아이디를 중복체크 하세요";
	}
}

function checkId(){
	var sId = document.getElementById("id").value;
	
	
	if(sId == "")
		//document.getElementById("idDiv").innerText = "먼저 아이디를 입력하세요";
		document.getElementById("idDiv").innerHTML = "<font color='magenta'>먼저 아이디를 입력하세요</font>";
	else{
		window.open("checkId.jsp?id="+sId, "checkId", "width=500 height=150 left=700 top=200");
		document.signUpForm.idCheck.value = "0"
	}
}
function inputIdcheck(){
	document.signUpForm.idCheck.value = "1"
	
}
