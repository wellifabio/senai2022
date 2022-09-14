const uri = 'http://localhost:4000/locadora/clientes';
const tcorpo = document.querySelector("#tcorpo");
var dados = []

function carregar() {
    const options = { method: 'GET' };
    fetch(uri, options)
        .then(resp => resp.json())
        .then(resp => {
            dados = resp;
            preencheTabela();
        })
        .catch(err => console.error(err));
}

function preencheTabela() {
    dados.forEach(cli => {
        let linha = document.createElement('tr');
        let cod = document.createElement('td');
        let nome = document.createElement('td');
        let endereco = document.createElement('td');
        let telefone = document.createElement('td');
        cod.innerHTML = cli.codigo;
        nome.innerHTML = cli.nome;
        endereco.innerHTML = cli.endereco;
        telefone.innerHTML = cli.telefone;
        linha.appendChild(cod);
        linha.appendChild(nome);
        linha.appendChild(endereco);
        linha.appendChild(telefone);
        tcorpo.appendChild(linha);
    });
}

function cadastrarCliente() {
    //Cria um objeto com os dados dos campos html <input>
    let corpo = {
        "nome": document.querySelector("#nome").value,
        "endereco": document.querySelector("#endereco").value,
        "telefone": document.querySelector("#telefone").value
    }
    //Cria outro objeto com os dados da requisição HTTP
    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' }
    };
    //Acrescenta o corpo na requisição no formato JSON
    options.body = JSON.stringify(corpo);
    //Faz efetivamente a requisição ao back-end
    if (corpo.nome.length > 0 && corpo.endereco.length > 0 && corpo.telefone.length > 0) {
        fetch(uri, options)
            .then(resp => resp.status)
            .then(resp => {
                if (resp == 201) {
                    window.location.reload();
                } else {
                    alerta('Erro ao enviar dados ao Banco de dados:' + resp);
                    window.location.reload();
                }
            })
            .catch(err => alerta(err));
    } else {
        alerta('Preencha os campos obrigatórios');
    }
}

function alerta(a) {
    document.querySelector('#modal2').setAttribute('style', 'display:flex;');
    document.querySelector('#alerta').setAttribute('style', 'display:flex;');
    document.querySelector('#msg').innerHTML = a;
}