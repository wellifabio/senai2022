function listarSalgados() {
    let tipo = JSON.parse(localStorage.getItem("userdata")).tipo;
    if(tipo == 1) {
        document.querySelector("body").innerHTML = `<div class="card">
            <input type="text" id="nome" placeholder="Nome do Salgado">
            <input type="text" id="descricao" placeholder="Descrição">
            <input type="text" id="foto" placeholder="Nome da Imagem">
            <button onclick="cadastrarSalgado()">Adicionar Salgado</button>
        </div>`
    }

    fetch("http://localhost:3000/salgados")
    .then(res => res.json())
    .then(data => {
        data.forEach(salgado => {
            let card = document.createElement("div");
            card.classList.add("card");
            card.innerHTML = `
                <div class="card-body">
                    <div class="card-image">
                        <img src="../assets/${salgado.foto}">
                    </div>
                    <div class="card-content">
                        <span class="card-title">${salgado.nome}</span>
                        <p>${salgado.descricao}</p>
                    </div>
                </div
                <div class="card-action">
                    <button class="a" onclick="navigate(${salgado.id})">Comentários</button>
                </div>
            `;
            document.querySelector("body").appendChild(card);
        })
    })
}

function navigate(id) {
    localStorage.setItem("id_salgado", id);
    window.location.href = "../comentarios";
}

function cadastrarSalgado() {
    let nome = document.querySelector("#nome").value;
    let descricao = document.querySelector("#descricao").value;
    let foto = document.querySelector("#foto").value;

    let data = {
        nome: nome,
        descricao: descricao,
        foto: foto
    }

    fetch("http://localhost:3000/salgado", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(data => {
        if(data.id !== null) {
            alert("Salgado cadastrado com sucesso");
            window.location.href = "../home";
        }else {
            alert("Erro ao cadastrar salgado");
        }
    })
}