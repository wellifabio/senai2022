const vai = document.querySelector("#vai");
const vem = document.querySelector("#vem");

const socket = io("http://10.87.198.25:3000");

function enviar() {
    socket.emit("teste", {message:vai.value});   
    vem.innerHTML += "\n"+vai.value;
}

socket.on("resp", (data) => {
    vem.innerHTML = data.message;
});
