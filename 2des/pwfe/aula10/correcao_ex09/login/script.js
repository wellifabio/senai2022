var email = document.querySelector("#email");
var psw = document.querySelector("#psw");

function login() {
    let encontrei = false;

    fetch("https://jsonplaceholder.typicode.com/users")
    .then(res => { return res.json(); })
    .then(usuarios => {
        usuarios.forEach(usuario => {
            if((email.value == usuario.email) && (psw.value == usuario.username)) {
                encontrei = true;
                
                let infoUser = {
                    "id":usuario.id,
                    "nome":usuario.name
                };

                window.localStorage.setItem("infoUser", JSON.stringify(infoUser));

                window.location.href = "../home/index.html";
            }
        });
        if(encontrei == false) alert("Usuario ou Senha Invalidos");
    })
}