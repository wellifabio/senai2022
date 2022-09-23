const uri = 'http://localhost:4500/receitas';
const receitas = document.querySelector("#receitas");
var dados = [];

function carregar() {
    const options = { method: 'GET' };
    fetch(uri, options)
        .then(resp => resp.json())
        .then(resp => {
            dados = resp;
            montarCards();
        })
        .catch(err => alert("Erro ao carregar dados do BD:" + err));
}

function montarCards() {
    dados.forEach(e => {
        let card = document.createElement("div");
        let id = document.createElement("div");
        let tipo = document.createElement("div");
        let nome = document.createElement("div");
        let ingredientes = document.createElement("div");
        let modoPreparo = document.createElement("div");
        let foto = document.createElement("img");
        card.setAttribute('class', 'card');
        id.innerHTML = `<h4>Id: ${e.id}</h4> <button onclick='excluirReceita(${e.id})'>-</button>`;
        tipo.innerHTML = `<b>Tipo:</b> ${e.tipo}`;
        nome.innerHTML = `<b>Nome:</b> ${e.nome}`;
        ingredientes.innerHTML = `<b>Ingredientes:</b> ${e.ingredientes}`;
        modoPreparo.innerHTML = `<b>Modo de Preparo:</b> ${e.modo_preparo}`;
        foto.setAttribute('src', montaImg(e.foto));
        card.appendChild(id);
        card.appendChild(tipo);
        card.appendChild(nome);
        card.appendChild(ingredientes);
        card.appendChild(modoPreparo);
        card.appendChild(foto);
        receitas.appendChild(card);
    });
}

function montaImg(img) {
    if (img != null) {
        return `data:image/png;base64,${img}`;
    } else
        return `./default.png`;
}

function excluirReceita(id) {
    if (confirm("Confirma a exclusão da receita id: " + id)) {
        const body = {
            "id": id
        }
        const options = {
            method: 'DELETE',
            headers: { 'Content-Type': 'application/json' },
        };
        options.body = JSON.stringify(body);
        fetch(uri, options)
            .then(resp => resp.status)
            .then(resp => {
                if (resp == 200) {
                    window.location.reload();
                }
            })
            .catch(err => alert("Erro ao enviar dados, Erro:" + err));
    }
}