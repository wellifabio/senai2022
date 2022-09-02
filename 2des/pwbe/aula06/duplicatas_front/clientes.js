var uriClientes = `http://localhost:3000/duplicatas/clientes`;
var clientes = [];
const allCli = document.querySelector("#allCli");
const modais = document.querySelector("#modais");
const modalTels = document.querySelector("#modalTels");
const telefones = document.querySelector("#telefones");

function loadCli() {
    fetch(uriClientes)
        .then(res => { return res.json() })
        .then(data => {
            clientes = data;
            preencheTabela();
        });
}

function preencheTabela() {
    let indice = 0;
    clientes.forEach(e => {
        let linha = document.createElement("tr");
        let cod = document.createElement("td");
        let nome = document.createElement("td");
        let endereco = document.createElement("td");
        let bairro = document.createElement("td");
        let cidade = document.createElement("td");
        let uf = document.createElement("td");
        let tels = document.createElement("td");
        cod.innerHTML = e.cod_cli;
        nome.innerHTML = e.nome;
        endereco.innerHTML = e.endereco;
        bairro.innerHTML = e.bairro;
        cidade.innerHTML = e.cidade;
        uf.innerHTML = e.uf;
        tels.innerHTML = `<img src='./assets/fone.png' width='40px' class='tels' onclick='mostraTels(${indice})'/>`
        linha.appendChild(cod);
        linha.appendChild(nome);
        linha.appendChild(endereco);
        linha.appendChild(bairro);
        linha.appendChild(cidade);
        linha.appendChild(uf);
        linha.appendChild(tels);
        allCli.appendChild(linha);
        indice++;
    });
}

function mostraTels(indice) {
    modais.setAttribute("style","display:flex;");
    modalTels.setAttribute("style","display:flex;");
    telefones.innerHTML = "";
    clientes[indice].telefones.forEach(e=>{
        let linha = document.createElement("tr");
        let tipo = document.createElement("td");
        let numero = document.createElement("td");
        tipo.innerHTML = e.tipo;
        numero.innerHTML = e.numero;
        linha.appendChild(tipo);
        linha.appendChild(numero);
        telefones.appendChild(linha);
    });
}