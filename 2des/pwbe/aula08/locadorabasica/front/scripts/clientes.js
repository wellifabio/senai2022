const uri = 'http://127.0.0.1:3000/locadora/clientes';
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
        let codigo = document.createElement("td");
        let nome = document.createElement("td");
        let endereco = document.createElement("td");
        let telefone = document.createElement("td");
        codigo.innerHTML = e.codigo;
        nome.innerHTML = e.nome;
        endereco.innerHTML = e.endereco;
        telefone.innerHTML = e.telefone;
        l.appendChild(codigo);
        l.appendChild(nome);
        l.appendChild(endereco);
        l.appendChild(telefone);
        tbody.appendChild(l);
    });
}

function cadastrar() {

    let body = {
        "nome": document.getElementById("nome").value,
        "endereco": document.getElementById("endereco").value,
        "telefone": document.getElementById("telefone").value
    }

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
    };
    options.body = JSON.stringify(body);
    if (body.nome.length > 0 && body.endereco.length > 0 && body.telefone.length > 0) {
        fetch(uri, options)
            .then(resp => resp.status)
            .then(resp => {
                if (resp == 201) {
                    alert("Cliente cadastrado com sucesso");
                    window.location.reload();
                } else {
                    alert("Erro ao enviar dados.");
                    window.location.reload();
                }
            })
            .catch(err => alert("Erro ao enviar dados. Erro:" + err));
    }else{
        alert("Preencha todos os campos obrigatórios");
    }
}