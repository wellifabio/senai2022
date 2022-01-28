const email = document.querySelector("#email");
const senha = document.querySelector("#senha");
const camera = document.querySelector("#camera");
const foto = document.querySelector("#foto");
const login = document.querySelector("#login");
const cadastro = document.querySelector("a");

var imagem = "";

camera.addEventListener("click", () => {
    foto.click();
});

foto.addEventListener("change", (e) => {
    let file = e.target.files[0];

    let reader = new FileReader();

    reader.onload = (data) => {
        //console.log(data.target.result);
        imagem = data.target.result;
    }

    reader.readAsDataURL(file);
})

function conectar() {
    let data = JSON.stringify({
        email: email.value,
        senha: md5(senha.value),
    });
    
    fetch("http://localhost:3000/login", {
        "method": 'POST',
        "headers": {
            "Content-Type": "application/json"
        },
        "body": data
    })
    .then(resp => { return resp.json() })
    .then(data => {
        if(data.length > 0) {
            localStorage.setItem("userdata", JSON.stringify(data[0]));
            window.location.href = '../home';
        }else {
            alert("Usuario ou Senha invalidos");
        }
    })
}

function registrar() {
    let data = JSON.stringify({
        email: email.value,
        senha: md5(senha.value),
        foto: imagem,
    })

    fetch("http://localhost:3000/usuario", {
        "method": "POST",
        "headers": {
            "Content-Type":"application/json"
        },
        "body": data
    })
    .then(resp => { return resp.json() })
    .then(data => {
        console.log(data);
    })
}

function cadastrar() {
    login.innerHTML = "Cadastrar";
    login.onclick = registrar;
    cadastro.hidden = true;
    camera.hidden = false;
}