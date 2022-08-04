const age = parseInt(prompt("How old are you?"));
const con = isNaN(age);

if (con || age < 0 ) {
    console.log("숫자를 입력하세요");
} else if (age < 18) {
    console.log("you are too young");
}else if (age>=50) {
    console.log("you are too old");
}else {
    console.log("you can drink");
}