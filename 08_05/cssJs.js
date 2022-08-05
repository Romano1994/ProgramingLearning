const pull1 = document.querySelector("div.idk h1");

function handlePullclick() {
    const clickedClass = "clicked";
    pull1.classList.toggle(clickedClass);
}


pull1.addEventListener("click", handlePullclick);
