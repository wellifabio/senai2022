const uri = 'http://localhost:5000/receitas';
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
        .catch(err => console.error(err));
}

function montarCards(){
    dados.forEach(e=>{
        let card = document.createElement("div");
        let id = document.createElement("label");
        let tipo = document.createElement("label");
        let nome = document.createElement("label");
        let ingredientes = document.createElement("label");
        let modoPreparo = document.createElement("label");
        let foto = document.createElement("img");
        card.setAttribute('class','card');
        id.innerHTML = e.id;
        tipo.innerHTML = e.tipo;
        nome.innerHTML = e.nome;
        ingredientes.innerHTML = e.ingredientes;
        modoPreparo.innerHTML = e.modo_preparo;
        foto.setAttribute('src',`../imgs/${e.foto}`);
        id.innerHTML = e.id;
        card.appendChild(id);
        card.appendChild(tipo);
        card.appendChild(nome);
        card.appendChild(ingredientes);
        card.appendChild(modoPreparo);
        card.appendChild(foto);
        receitas.appendChild(card);
    });
}