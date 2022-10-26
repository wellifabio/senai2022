const socket = io("http://localhost:3000");
const envia = document.querySelector("#envia");
const recebe = document.querySelector("#recebe");

function enviar() {
    let nick = document.querySelector("#nick").value;
    socket.emit("sala01", { nick: nick, msg: envia.value });
    baloes({ nick: nick, msg: envia.value });
}

socket.on("resp", (data) => {
    baloes(data.msg);
});

const baloes = (msg) => {
    let balao = document.createElement("div");
    balao.classList.add(msg.nick);
    balao.innerHTML = msg.msg;
    recebe.appendChild(balao);
}