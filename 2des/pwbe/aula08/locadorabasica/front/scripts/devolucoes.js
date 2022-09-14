const uri = 'http://127.0.0.1:3000/locadora/devolucoes';
const tbody = document.querySelector("#tbody");
var data = [];


function carregar() {
    const options = { method: 'GET' };

    fetch(uri, options)
        .then(resp => resp.json())
        .then(resp => {
            data = resp;
            preecherTabela();
        })
        .catch(err => console.error(err));
}

function preecherTabela() {
    data.forEach(e => {
        let l = document.createElement("tr");
        let nome = document.createElement("td");
        let telefone = document.createElement("td");
        let filme = document.createElement("td");
        let dataLocacao = document.createElement("td");
        let multa = document.createElement("td");
        let botao = document.createElement("td");
        nome.innerHTML = e.nome;
        telefone.innerHTML = e.telefone;
        filme.innerHTML = e.filme;
        dataLocacao.innerHTML = e.data_locacao.split("T")[0];
        multa.innerHTML = calcMulta(e.data_locacao);
        botao.innerHTML = `<img onclick="devolver(${e.id})"src="../assets/return.svg"/>`;
        l.appendChild(nome);
        l.appendChild(telefone);
        l.appendChild(filme);
        l.appendChild(dataLocacao);
        l.appendChild(multa);
        l.appendChild(botao);
        tbody.appendChild(l);
    });
}

function calcMulta(data) {
    const datediff = new Date() - new Date(data.split("T")[0]);
    let dias = parseInt(datediff / (1000 * 60 * 60 * 24)) - 1;
    if (dias > 3)
        return ((dias - 3) * 1.35).toFixed(2);
    else
        return 0;
}

function devolver(id) {
    let ok = confirm("Confirma a devolução deste filme?");
    if(ok){
        let body = {
            "id": id
        }
        const options = {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' }
        };
        options.body = JSON.stringify(body);
        fetch(uri, options)
            .then(resp => resp.status)
            .then(resp => {
                if(resp = 202)
                    window.location.reload();
            })
            .catch(err => console.error(err));
    }
}