//Exemplo de Factory by Filipe Deschamps
//https://www.youtube.com/watch?v=arAz2Ff8s88

var result = document.getElementById("result");

//Exemplo 1 Factory
function fabricaObjeto(){
    let objeto = {}
    return objeto;
}

var objeto1 = fabricaObjeto()
var objeto2 = fabricaObjeto()

objeto1.nome = "Alicate"
objeto2.nome = "Martelo"

function showOBjetos(){
    result.innerHTML += "Objeto 1: "+objeto1.nome
    result.innerHTML += "Objeto 2: "+objeto2.nome
}

//Exemplo 2 Factory
function fabricarPessoa(nome, sobrenome){
    let pessoa = {}
    pessoa.nome = nome
    pessoa.sobrenome = sobrenome

    function nomeCompleto(){
        return `${pessoa.nome} ${pessoa.sobrenome}`
    }

    pessoa.nomeCompleto = nomeCompleto()
    return pessoa
}

var pessoaA = fabricarPessoa("Maria","Souza")
var pessoaB = fabricarPessoa("Marcos","Almeida")

function showPessoas(){
    result.innerHTML += "PessoaA: "+pessoaA.nomeCompleto
    result.innerHTML += "PessoaA: "+pessoaB.nomeCompleto
}