const age = parseInt(prompt("How old are you?"));
const con = isNaN(age);

if (con || age < 0 ) {
    console.log("숫자를 입력하세요");
} else if (age < 18) {
    console.log("you are too young");
}else if (100 == age) {
    console.log("wow you are so wise")
}else if (age>=50) {
    console.log("you are too old");
}else if (18 <= age && age <50) {
    console.log("you can drink");
}