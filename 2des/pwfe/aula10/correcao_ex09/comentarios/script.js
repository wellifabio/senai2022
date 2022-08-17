var url = new URL(window.location.href);
var params = new URLSearchParams(url.search);

console.log(params.get("postId"));

var listaComentarios = document.querySelector(".comentarios");
var itemComentario = document.querySelector(".comentario");

fetch("https://jsonplaceholder.typicode.com/comments?postId="+params.get("postId"))
.then(res => { return res.json() })
.then(comentarios => {
    comentarios.forEach(comentario => {
        let novoComentario = itemComentario.cloneNode(true);

        novoComentario.classList.remove("model");

        novoComentario.querySelector("#email").innerHTML = comentario.email;
        novoComentario.querySelector("#body").innerHTML = comentario.body;

        listaComentarios.appendChild(novoComentario);
    })
});