const username = document.querySelector("#username");
const userimg = document.querySelector("#perfil");

const itemlista = document.querySelector(".item-lista");
const lista = document.querySelector(".lista");

var userinfo = JSON.parse(localStorage.getItem("info"))

username.innerHTML = userinfo.username;
userimg.src = "../assets/" + userinfo.image;

fetch("https://patrimoniomongo.herokuapp.com/read/")
.then(resp => {return resp.json()})
.then(patrimonio => {
    patrimonio.items.forEach(data => {
        let item = itemlista.cloneNode(true);

        item.classList.remove("model");

        item.querySelector("img").src = "../assets/" + data.img;
        item.querySelector("#id").innerHTML = data._id;
        item.querySelector("#ni").innerHTML = data.ni;

        let date = new Date(data.aquisicao)

        item.querySelector("#aquisicao").innerHTML = date.toLocaleString('pt-BR', { timeZone: 'UTC' }).split(" ")[0];

        item.querySelector("#nome").innerHTML = data.denominacao;
        
        item.querySelector("#valor").innerHTML = data.valor.toLocaleString('pt-BR', {style: 'currency', currency:'BRL'});

        item.querySelector("span").addEventListener("click", () => { remover(data._id, item); })

        lista.appendChild(item);
    })
})

function remover(id, item) {
    fetch("https://patrimoniomongo.herokuapp.com/del/id/" + id, {
        "method":"DELETE"
    })
    .then(resp => { return resp.json()})
    .then(data => {
        item.remove();
    });
}

function modalCad () {
    document.querySelector(".mc").classList.toggle("model");
}

function modalSucesso() {
    document.querySelector(".ms").classList.toggle("model");
}

function cadastrar() {
    let data = {};

    document.querySelectorAll(".modal-body > input").forEach(inp => {
        data[inp.className] = (inp.className === "ni" || inp.className === "valor") ? Number(inp.value) : inp.value;
    });

    fetch("https://patrimoniomongo.herokuapp.com/create", {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify(data)
    })
    .then(resp => { return resp.status; })
    .then(data => {
        if(data === 201) {
            modalCad();
            modalSucesso();
            setTimeout(() => { modalSucesso() }, 2000);
        }
    })
}