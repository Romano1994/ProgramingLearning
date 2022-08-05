const pull = document.querySelector(".idk h1");

function handlePullclick() {
    console.log("pullClick")
}
function handleMouseenter() {
    pull.innerText = "Mouse is here"
}
function handleMouseleave(){
    pull.innerText = "Mouse is gone"
}
function handleWindeoResize() {
    document.body.style.backgroundColor = "tomato";
}
function handleWindowCopy(){
    alert("copier!")
}
function handleOffline(){
    alert("No wifi")
}
function handleOnline(){
    alert("Yes wifi")
}

// pull.onclick = handlePullclick; 
// pull.onmouseenter = handleMouseenter;
// pull.onmouseleave = handleMouseleave;
pull.addEventListener("click", handlePullclick);
pull.addEventListener("mouseenter", handleMouseenter);
pull.addEventListener("mouseleave", handleMouseleave);

window.addEventListener("resize", handleWindeoResize);
window.addEventListener("copy", handleWindowCopy);
window.addEventListener("offline", handleOffline);
window.addEventListener("online", handleOnline);