const loginInput = document.querySelector("#login-form input");
const loginForm = document.querySelector("#login-form");
const greeting = document.querySelector("#greeting");
const HIDDEN_CLASSNAME = "hidden";
const USERNAME_KEY = "username";

function onLoginSubmit(event){
    event.preventDefault();
    const userName = loginInput.value;
    localStorage.setItem(USERNAME_KEY,userName);
    loginForm.classList.add(HIDDEN_CLASSNAME);
    paintGreetings(userName);
    console.log(userName);
}
function paintGreetings(username){
    greeting.innerTEXT = `Hello ${username}`;
    greeting.classList.remove(HIDDEN_CLASSNAME);
} 

const savedUserName = localStorage.getItem(USERNAME_KEY);
if(savedUserName === null){
    loginForm.classList.remove(HIDDEN_CLASSNAME);
    loginForm.addEventListener("submit",onLoginSubmit);
} else {
    paintGreetings(savedUserName);
}