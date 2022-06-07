let user = JSON.parse(localStorage.getItem("userdata"));

function listarComentarios() {
    
    let tipo = user.tipo;
    
    fetch("http://localhost:3000/avaliacoes/" + localStorage.getItem("id_salgado"))
    .then(res => res.json())
    .then(data => {
        data.forEach(avaliacao => {
            console.log(avaliacao)
            let div = document.createElement("div");
            div.classList.add("card");
            div.innerHTML = `
                <p class="card-text">${avaliacao.avaliacao}</p>
                <p class="card-text">${avaliacao.nota}</p>
            `;
            document.querySelector("body").appendChild(div);
        })
        if(data.length == 0) {
            let div = document.createElement("div");
            div.classList.add("card");
            div.innerHTML = `
                <p class="card-text">Nenhum comentário</p>
            `;
            document.querySelector("body").appendChild(div);
        }
        if(tipo == 2) {
            document.querySelector("body").innerHTML += `<div class="card">
                <input type="text" id="avaliacao" placeholder="Avaliação">
                <input type="number" id="nota" min="0" max="5" placeholder="Nota">
                <button onclick="cadastrarAvaliacao()">Adicionar Comentario</button>
            </div>`;            
        }
    })
}

function cadastrarAvaliacao() {
    let id_user = user.id;
    let nota = document.querySelector("#nota");
    let avaliacao = document.querySelector("#avaliacao");

    let pub = {
        id_user: id_user,
        id_salgado: Number(localStorage.getItem("id_salgado")),
        nota: Number(nota.value),
        avaliacao: avaliacao.value,
    }

    fetch("http://localhost:3000/avaliacao", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(pub)
    })
    .then(res => res.json())
    .then(ret => {
        window.location.href = "../comentarios";
    });
}