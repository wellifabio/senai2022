const user = document.querySelector("#user");
const psw = document.querySelector("#psw");

function login() {
    let info = {
        "username": user.value,
        "password": psw.value
    }

    fetch("https://patrimoniomongo.herokuapp.com/login", {
        "method":"POST",
        "headers": {
            "Content-Type":"application/json"
        },
        "body": JSON.stringify(info)
    })
    .then(res => {return res.json()})
    .then(data => {
        if(data.erro === undefined) {
            localStorage.setItem("info", JSON.stringify({"username":data.username, "image":data.img}));

            window.location.href = "../home/";
        }
    })
}