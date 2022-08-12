const id = prompt("아이디를 입력해주세요")
const password = prompt("비밀번호를 입력하세요");
if(id === "fhaksh" && password === "1111"){
    alert("로그인 됩니다" + id+"님 반갑습니다");
}else if(id != "fhaksh" && password === "1111"){
    alert("아이디가 일치하지 않습니다");
}else if(id === "fhaksh" && password != "1111"){
    alert("비밀번호가 일치하지 않습니다");

}
