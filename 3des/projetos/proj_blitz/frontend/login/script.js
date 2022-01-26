const email = document.querySelector("#email");
const senha = document.querySelector("#senha");

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
        console.log(data);
    })
}