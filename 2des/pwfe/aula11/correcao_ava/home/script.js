const username = document.querySelector("#username");
const imguser = document.querySelector("#perfil");

var userinfo = JSON.parse(localStorage.getItem("info"));

username.innerHTML = userinfo.username;
imguser.src = "../assets/" + userinfo.image;