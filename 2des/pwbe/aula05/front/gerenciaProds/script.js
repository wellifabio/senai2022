const listaProdutos = document.querySelector("#lista-produtos")
const linhamodelo = document.querySelector(".linhamodelo");
const modalExcluir = document.querySelector(".excluir");
const modalEditar = document.querySelector(".editar");

const inputCodigo = document.querySelector("#codigo");
const inputNome = document.querySelector("#nome");
const inputQuantidade = document.querySelector("#quantidade");
const inputValor = document.querySelector("#valor");

fetch("http://localhost:3000/produtos")
.then(res => { return res.json() })
.then(produtos => {
    produtos.forEach(produto => {
        let linha = linhamodelo.cloneNode(true);
        linha.classList.remove("model");

        let colunas = linha.querySelectorAll("td");
        colunas[0].innerHTML = produto.cod;
        colunas[1].innerHTML = produto.nome;
        colunas[2].innerHTML = produto.qntd;
        colunas[3].innerHTML = "R$ " + produto.preco;

        linha.querySelector("#exclui").addEventListener("click", () => {
            modalExcluir.classList.remove("model");
            modalExcluir.querySelector("#cod").innerHTML = produto.cod;
        })

        linha.querySelector("#edita").addEventListener("click", () => {
            modalEditar.classList.remove("model"); 
            inputCodigo.value = produto.cod;
            inputNome.value = produto.nome;
            inputQuantidade.value = produto.qntd;
            inputValor.value = produto.preco;
        })

        listaProdutos.appendChild(linha);
    });
});

function fecharModalExcluir() {
    modalExcluir.classList.add("model");
}

function fecharModalEditar() {
    modalEditar.classList.add("model");
}