const uri = 'http://localhost:4000/locadora/locacoes';
const tcorpo = document.querySelector("#tcorpo");
var dados = []
var id = -1;

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
        let cliente = document.createElement('td');
        let telefone = document.createElement('td');
        let filme = document.createElement('td');
        let data = document.createElement('td');
        let multa = document.createElement('td');
        let devolve = document.createElement('td');
        cliente.innerHTML = cli.nome;
        telefone.innerHTML = cli.telefone;
        filme.innerHTML = cli.filme;
        data.innerHTML = cli.data_locacao.split("T")[0];
        multa.innerHTML = calculaMulta(cli.data_locacao);
        devolve.innerHTML = `<img onclick='confirma(${cli.id})' src='../assets/return.svg'/>`;
        linha.appendChild(cliente);
        linha.appendChild(telefone);
        linha.appendChild(filme);
        linha.appendChild(data);
        linha.appendChild(multa);
        linha.appendChild(devolve);
        tcorpo.appendChild(linha);
    });
}

function calculaMulta(data) {
    const datediff = new Date() - new Date(data.split("T")[0]);
    let dias = parseInt(datediff / (1000 * 60 * 60 * 24)) - 1;
    if (dias > 3)
        return ((dias - 3) * 1.35).toFixed(2);
    else
        return 0;
}

function devolve() {
    //JSON com os dados do corpo da requisição
    let corpo = {
        "id": id
    }
    //Outro objeto com os dados da requisição HTTP
    const options = {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' }
    };
    //Acrescenta o corpo na requisição no formato JSON
    options.body = JSON.stringify(corpo);
    //Faz efetivamente a requisição ao back-end
    fetch(uri, options)
        .then(resp => resp.status)
        .then(resp => {
            if (resp == 201) {
                window.location.reload();
            } else {
                alert('Erro ao enviar dados ao Banco de dados:' + resp);
                window.location.reload();
            }
        })
        .catch(err => alert(err));
}

function confirma(qual) {
    id = qual;
    document.querySelector('#modal1').setAttribute('style', 'display:flex;');
    document.querySelector('#confirma').setAttribute('style', 'display:flex;');
    document.querySelector('#msg').innerHTML = "Confirma a devolução do filme referente a locação nº "+qual+"?";
}