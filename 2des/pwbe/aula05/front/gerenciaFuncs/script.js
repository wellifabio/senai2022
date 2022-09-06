const listaProdutos = document.querySelector("#lista-produtos")
const linhamodelo = document.querySelector(".linhamodelo");
const modalExcluir = document.querySelector(".excluir");
const modalEditar = document.querySelector(".editar");

const inputMatricula = document.querySelector("#imatricula");
const inputNome = document.querySelector("#nome");
const inputCargo = document.querySelector("#cargo");
const inputSalario = document.querySelector("#salario");
const inputCpf = document.querySelector("#cpf");

const btCadedit = document.querySelector("#cadedit");

fetch("http://localhost:3000/funcionarios")
.then(res => { return res.json() })
.then(funcionarios => {
    funcionarios.forEach(funcionario => {
        let linha = linhamodelo.cloneNode(true);
        linha.classList.remove("model");

        let colunas = linha.querySelectorAll("td");
        colunas[0].innerHTML = funcionario.matricula;
        colunas[1].innerHTML = funcionario.nome;
        colunas[2].innerHTML = funcionario.cargo;
        colunas[3].innerHTML = "R$ " + funcionario.salario;
        colunas[4].innerHTML = funcionario.cpf;

        linha.querySelector("#exclui").addEventListener("click", () => {
            modalExcluir.classList.remove("model");
            modalExcluir.querySelector("#matricula").innerHTML = funcionario.matricula;
        });

        linha.querySelector("#edita").addEventListener("click", () => {
            modalEditar.classList.remove("model"); 
            btCadedit.innerHTML = "Editar";
            btCadedit.onclick = () => { editarFuncionario() }
            inputMatricula.value = funcionario.matricula;
            inputNome.value = funcionario.nome;
            inputCargo.value = funcionario.cargo;
            inputSalario.value = funcionario.salario;
            inputCpf.value = funcionario.cpf;
        });

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
    btCadedit.onclick = () => { cadastrarFuncionario(); }
    inputMatricula.value = "";
    inputNome.value = "";
    inputCargo.value = "";
    inputSalario.value = "";
    inputCpf.value = "";
    modalEditar.classList.remove("model");
}

function editarFuncionario() {
    let funcionario = {
        "matricula":inputMatricula.value,
        "nome":inputNome.value,
        "cargo":inputCargo.value,
        "salario":inputSalario.value,
        "cpf":inputCpf.value,
    }

    fetch("http://localhost:3000/funcionario", {
        "method":"PUT",
        "headers": {
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(funcionario)
    })
    .then(res => { return res.json() })
    .then(resp => {
        console.log(resp)
        if(resp.matricula !== undefined) {
            alert("Funcionário Alterado com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao salvar alterações !");
        }
    })
}

function excluirFuncionario() {
    let data = {
        "matricula":document.querySelector("#matricula").innerHTML
    }

    fetch("http://localhost:3000/funcionario", {
        "method":"DELETE",
        "headers":{
            "Content-Type": "application/json"
        },
        "body":JSON.stringify(data)
    })
    .then(res => { return res.json() })
    .then(resp => {
        if(resp.matricula !== undefined) {
            alert("Funcionário Excluido Com Sucesso!");
            window.location.reload();
        }else {
            alert("Falha ao excluir funcionário !");
        }
    });
}

function cadastrarFuncionario() {
    let funcionario = {
        "matricula":inputMatricula.value,
        "nome":inputNome.value,
        "cargo":inputCargo.value,
        "salario":inputSalario.value,
        "cpf":inputCpf.value,
    };

    fetch("http://localhost:3000/funcionarios", {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify(funcionario)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.matricula !== undefined){
            alert("Funcionário Cadastrado Com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao cadastrar funcionário");
        }
     })
}