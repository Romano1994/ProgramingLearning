const loginInput = document.querySelector("#login-form input");
const loginButton = document.querySelector("#login-form button");

function buttonclick(){
    const username = loginInput.value;
    console.log("username")
}
loginButton.addEventListener("click",buttonclick);