var inpPlaca = document.querySelector("#placa");
var retorno = document.querySelector("#retorno");

var inpCpf = document.querySelector("#cpf");
var retornoCpf = document.querySelector("#retornoCpf");

function ex1() {
    if(validarPlaca(inpPlaca.value)) {
        retorno.innerHTML = "Placa Válida";
    }else {
        retorno.innerHTML = "Placa Inválida";
    }
}

function ex2() {
    if(validarCpf(inpCpf.value)) {
        retornoCpf.innerHTML = "CPF Válido";
    }else {
        retornoCpf.innerHTML = "CPF Inválido";
    }
}

function validarPlaca(placa) {
    if(placa.length == 7) {
        let modeloAntigo = /^[a-zA-Z]{3}[0-9]{4}$/;
        let modeloNovo = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;
        let modeloMoto = /^[a-zA-Z]{3}[0-9]{2}[a-zA-Z]{1}[0-9]{1}$/;
        
        if(modeloAntigo.test(placa) || modeloNovo.test(placa) || modeloMoto.test(placa)) return true;
    }

    return false;
}


function validarCpf(cpf) {
    if(cpf.length != 11) return false;

    if(cpf == "11111111111"|| 
        cpf == "22222222222" ||
        cpf == "33333333333" ||
        cpf == "44444444444" ||
        cpf == "55555555555" ||
        cpf == "66666666666" ||
        cpf == "77777777777" ||
        cpf == "88888888888" ||
        cpf == "99999999999" ||
        cpf == "00000000000" 
     ) return false;

    let d1 = 0, d2 = 0;
    for(let i = 0; i <= 8; i++) {
        d1 += cpf[i] * (i+1);
        d2 += cpf[i] * i;
    }

    d1 %= 11;
    console.log(d1);
    if(d1 == 10) d1 = 0;
    if(d1 != cpf[9]) return false;

    d2 += d1 * 9;
    d2 %= 11;
    if(d2 == 10) d2 = 0;
    if(d2 != cpf[10]) return false;

    return true;
}

geraCelular('19', 5);

function geraCelular(ddd, qtd) {
    let numeros = new Array();

    for(let i = 0; i < qtd; i++)
        numeros.push(ddd + '-9' + (Math.floor(Math.random()*9999-1000)+1000) + "-" + (Math.floor(Math.random()*9999-1000)+1000));

    console.log(numeros);
}