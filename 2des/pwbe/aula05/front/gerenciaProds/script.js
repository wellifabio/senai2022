const listaProdutos = document.querySelector("#lista-produtos")
const linhamodelo = document.querySelector(".linhamodelo");
const modalExcluir = document.querySelector(".excluir");
const modalEditar = document.querySelector(".editar");

const inputCodigo = document.querySelector("#codigo");
const inputNome = document.querySelector("#nome");
const inputQuantidade = document.querySelector("#quantidade");
const inputValor = document.querySelector("#valor");

const btCadedit = document.querySelector("#cadedit");

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
            btCadedit.innerHTML = "Editar";
            btCadedit.onclick = () => { editarProduto() }
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

function abrirModalCadastro() {
    btCadedit.innerHTML = "Cadastrar";
    btCadedit.onclick = () => { cadastrarProduto(); }
    inputCodigo.value = "";
    inputNome.value = "";
    inputQuantidade.value = "";
    inputValor.value = "";
    modalEditar.classList.remove("model");
}

function editarProduto() {
    let produto = {
        "cod":inputCodigo.value,
        "nome":inputNome.value,
        "qntd":inputQuantidade.value,
        "preco":inputValor.value,
    }

    fetch("http://localhost:3000/produto", {
        "method":"PUT",
        "headers": {
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(produto)
    })
    .then(res => { return res.json() })
    .then(resp => {
        if(resp.cod !== undefined) {
            alert("Produto Alterado com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao salvar alterações !");
        }
    })
}

function excluirProduto() {
    let data = {
        "cod":document.querySelector("#cod").innerHTML
    }

    fetch("http://localhost:3000/produto", {
        "method":"DELETE",
        "headers":{
            "Content-Type": "application/json"
        },
        "body":JSON.stringify(data)
    })
    .then(res => { return res.json() })
    .then(resp => {
        if(resp.cod !== undefined) {
            alert("Produto Excluido Com Sucesso!");
            window.location.reload();
        }else {
            alert("Falha ao excluir produto !");
        }
    });
}

function cadastrarProduto() {
    let produto = {
        "cod": inputCodigo.value,
        "nome": inputNome.value,
        "qntd": inputQuantidade.value,
        "preco": inputValor.value
    };

    fetch("http://localhost:3000/produtos", {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify(produto)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.cod !== undefined){
            alert("Produto Cadastrado Com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao cadastrar produto");
        }
     })
}