const socket = io("http://172.0.0.1:3000");
const envia = document.querySelector("#envia");
const recebe = document.querySelector("#recebe");
var nick = null;
var cor = -1;
const cores = {
    0: "vermelho",
    1: "verde",
    2: "azul",
    3: "amarelo",
    4: "preto"
}

function enviar() {
    let msg = {
        nick: nick,
        msg: envia.value,
        cor: cor
    }
    socket.emit("sala01", msg);
    baloes(msg);
}

socket.on("resp", (data) => {
    baloes(data.msg);
});

const baloes = (msg) => {
    let balao = document.createElement("div");
    let quem = document.createElement("label");
    let oque = document.createElement("div");
    quem.innerHTML = msg.nick;
    oque.innerHTML = msg.msg;
    oque.classList.add(cores[msg.cor]);
    balao.classList.add('balao');
    balao.appendChild(quem);
    balao.appendChild(oque);
    recebe.appendChild(balao);
}

const nickname = () => {
    nick = prompt("Digite um nickname/apelido");
    cor = parseInt(Math.random() * 5);
    document.querySelector("#nick").innerHTML = nick;
}