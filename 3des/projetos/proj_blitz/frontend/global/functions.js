const menu = document.querySelector(".menu");

function showMenu() {
    menu.style.left = "0px";
}

function closeMenu() {
    menu.style.left = "-50vw";
}

function logout() {
    localStorage.clear();
    window.location.href = "../login/";
}