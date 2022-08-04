const age = parseInt(prompt("How old are you?"));
const con = isNaN(age);

if (con) {
    console.log("숫자를 입력하세요")
} else {
    console.log("숫자입니다")
}