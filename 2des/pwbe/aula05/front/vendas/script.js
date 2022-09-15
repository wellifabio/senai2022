const table = document.querySelector("tbody");
const codProd = document.querySelector("#codigo");
const nomeProd = document.querySelector("#nome");
const precoProd = document.querySelector("#preco");
const idProd = document.querySelector("#idProd");
const matriculaFunc = document.querySelector("#matricula");
const nomeFunc = document.querySelector("#nomefunc");
const idFunc = document.querySelector("#idFunc");
const qntd = document.querySelector("#qntd");
const totalValue = document.querySelector("#total");
var total = 0;
var venda = new Array();

function buscaFunc(e) {
    fetch("http://localhost:3000/funcionario/" + e.value)
    .then(res => { return res.json() })
    .then(data => {
        idFunc.value = data[0].id;
        nomeFunc.value = data[0].nome;
    })
}

function buscaProd(e) {
    fetch("http://localhost:3000/produto/" + e.value)
    .then(res => { return res.json() })
    .then(data => {
        console.log(data);
        nomeProd.value = data[0].nome;
        precoProd.value = data[0].preco;
        idProd.value = data[0].id;
    })
}

function lancarProduto() {
    let linha = document.querySelector(".linha").cloneNode(true);
    linha.classList.remove("model");
    let colunas = linha.querySelectorAll("td");
    colunas[0].innerHTML = codProd.value;
    colunas[1].innerHTML = nomeProd.value;
    colunas[2].innerHTML = matriculaFunc.value;
    colunas[3].innerHTML = qntd.value;
    let subTotal = Number(precoProd.value) * Number(qntd.value);
    total += subTotal;
    colunas[4].innerHTML = subTotal.toLocaleString('pt-BR', {style: 'currency', currency:'BRL'});
    table.appendChild(linha);
    totalValue.innerHTML = total.toLocaleString('pt-BR', {style: 'currency', currency:'BRL'});

    venda.push({
        "id_prod": idProd.value,
        "id_func": idFunc.value,
        "qntd": qntd.value,
    });
}

function lancarVenda() {
    fetch("http://localhost:3000/venda", {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify({"vendas":venda})
    })
    .then(res => { return res.json() })
    .then(data => {
        if(data.cod == 1) {
            alert("Venda Registrada Com Sucesso !");
        }else {
            alert("Falha ao finalizar a venda");
        }
    });
}