const table = document.querySelector("tbody");

fetch("http://localhost:3000/relatorioVendas")
.then(res => { return res.json() })
.then(data => {
    console.log(data);
    data.forEach(venda => {
        let linha = document.querySelector(".linha").cloneNode(true);
        linha.classList.remove("model");
        let colunas = linha.querySelectorAll("td");
        colunas[0].innerHTML = venda.matricula;
        colunas[1].innerHTML = venda.nome_funcionario;
        colunas[2].innerHTML = venda.nome_produto;
        colunas[3].innerHTML = venda.total_quantidade;
        let total = Number(venda.total_quantidade) * Number(venda.preco);
        colunas[4].innerHTML = total.toLocaleString('pt-BR', {style: 'currency', currency:'BRL'});
        table.appendChild(linha);
    })
})