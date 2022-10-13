const uri = 'http://localhost:5000/receitas';
const uriFile = 'http://localhost:5000/arquivos';
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
        foto.setAttribute('src', `../repositorio/${e.foto}`);
        card.appendChild(id);
        card.appendChild(tipo);
        card.appendChild(nome);
        card.appendChild(ingredientes);
        card.appendChild(modoPreparo);
        card.appendChild(foto);
        receitas.appendChild(card);
    });
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

function cadastrarReceita() {
    const arquivo = document.querySelector("#foto");
    //Monta o corpo da requisição
    const body = {
        "tipo": document.querySelector("#tipo").value,
        "nome": document.querySelector("#nome").value,
        "ingredientes": document.querySelector("#ingredientes").value,
        "modoPreparo": document.querySelector("#modo_preparo").value
    }
    if (arquivo.files.length > 0) {
        body.foto = arquivo.files[0].name;
        enviarArquivo(arquivo);
    } else {
        body.foto = 'default.png';
    }
    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' }
    };
    options.body = JSON.stringify(body);
    //Envia os dados do formulário para o back-end
    fetch(uri, options)
        .then(resp => resp.status)
        .then(resp => {
            if (resp == 201) {
                alert("Receita cadastrada com sucesso");
                window.location.reload();
            } else {
                alert("Erro ao cadastrar receita, Código HTTP:" + resp);
            }
        })
        .catch(err => {
            alert("Erro ao enviar dados, Erro:" + err);
        });
}

function enviarArquivo(arq) {
    const data = new FormData();
    data.append("img", arq.files[0]);
    const options = {
        method: 'POST'
    };
    options.body = data;
    fetch('http://localhost:5000/arquivos', options)
        .then(resp => resp.status)
        .then(resp => {
            if (resp != 200)
                alert("Imagem ao enviar imagem, Código HTTP:" + resp);
        })
        .catch(err => console.error(err));
}