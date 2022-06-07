function login() {
    var nome = document.querySelector("#nome").value;
    var senha = document.querySelector("#senha").value;

    let data = {
        nome: nome,
        senha: senha
    }

    fetch("http://localhost:3000/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(data => {
        if(data.length > 0) {
            localStorage.setItem("userdata", JSON.stringify(data[0]));
            window.location.href = "../home";
        }else {
            alert("Usuário ou senha incorretos");
        }
    })
}