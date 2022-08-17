const usuario = JSON.parse(window.localStorage.getItem("infoUser"));

var nomeUsuario = document.querySelector("#nome");
var listaPost = document.querySelector(".posts");
var itemPost = document.querySelector(".post");

nomeUsuario.innerHTML = usuario.nome;

fetch("https://jsonplaceholder.typicode.com/posts?userId="+usuario.id)
.then(res => { return res.json() })
.then(posts => {
    posts.forEach(post => {
        let novoPost = itemPost.cloneNode(true);
        novoPost.classList.remove("model");

        novoPost.querySelector("#title").innerHTML = post.title;
        novoPost.querySelector("#body").innerHTML = post.body;

        novoPost.querySelector("button").addEventListener("click", () => {
            window.location.href = "http://127.0.0.1:5500/correcao_ex09/comentarios/index.html?postId=" + post.id;
        })

        listaPost.appendChild(novoPost);
    })
})
