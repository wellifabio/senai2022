//DOM
const placa = document.querySelector("#placa");
const cpf = document.querySelector("#cpf");
const ddd = document.querySelector("#ddd");
const qtdTel = document.querySelector("#qtdTel");
const qtdCpf = document.querySelector("#qtdCpf");

const btPlaca = document.querySelector("#btPlaca");
const btCpf = document.querySelector("#btCpf");
const btTels = document.querySelector("#btTels");
const btCpfs = document.querySelector("#btCpfs");

const placaRes = document.querySelector("#placaRes");
const cpfRes = document.querySelector("#cpfRes");
const telefones = document.querySelector("#telefones");
const cpfs = document.querySelector("#cpfs");

btPlaca.addEventListener("click",()=>{ 
    if(placa.value.length > 0){
        if(validaPlaca(placa.value)){
            placaRes.innerHTML = "Placa Válida";
        }else{
            placaRes.innerHTML = "Placa Inválida";
        }
    }else{
        placaRes.innerHTML = "Digite uma placa";
    }
});

btCpf.addEventListener("click",()=>{ 
    if(cpf.value.length > 0){
        if(validaCPF(cpf.value)){
            cpfRes.innerHTML = "CPF Válido";
        }else{
            cpfRes.innerHTML = "CPF Inválido";
        }
    }else{
        cpfRes.innerHTML = "Digite um CPF";
    }
});

btTels.addEventListener("click",()=>{ 
    for(i = 0; i < parseInt(qtdTel.value); i++){
        console.log(novoTelefone(ddd.value));
    }
});

function validaPlaca(placa) {
    let padrao1 = /^[a-z]{3}[-]{1}[0-9]{4}$/i;
    let padrao2 = /^[a-z]{3}[-]{1}[0-9]{1}[a-z]{1}[0-9]{2}$/i;
    let padrao3 = /^[a-z]{3}[-]{1}[0-9]{2}[a-z]{1}[0-9]{1}$/i;
    return padrao1.test(placa) || padrao2.test(placa) || padrao3.test(placa);
}

function calculaDigito(cpf) {
    let cpfSemDigito = cpf.substring(0, 9);
    let digito = "";
    let peso = 10, soma = 0, d1 = 0, d2 = 0;
    for (i = 0; i < 9; i++) {
        soma += parseInt(cpfSemDigito.charAt(i) + "") * (peso - i);
    }
    d1 = soma % 11;
    if (d1 < 2)
        d1 = 0;
    else
        d1 = 11 - d1;
    soma = 0;
    cpfSemDigito += d1;
    peso = 11;
    for (i = 0; i < 10; i++) {
        soma += parseInt(cpfSemDigito.charAt(i) + "") * (peso - i);
    }
    d2 = soma % 11;
    if (d2 < 2)
        d2 = 0;
    else
        d2 = 11 - d2;
    digito += d1;
    digito += d2;
    return digito;
}

function validaCPF(cpf) {
    cpf = cpf.replaceAll(".", "");
    cpf = cpf.replaceAll("-", "");
    let digito = cpf.substring(9, 11);

    if (cpf != "11111111111"
        && cpf != "22222222222"
        && cpf != "33333333333"
        && cpf != "44444444444"
        && cpf != "55555555555"
        && cpf != "66666666666"
        && cpf != "77777777777"
        && cpf != "88888888888"
        && cpf != "99999999999"
        && cpf != "00000000000"
        && digito === calculaDigito(cpf)
    ) {
        return true;
    } else {
        return false;
    }
}

function novoDecimal(){
    return Math.floor(Math.random()*10);
}

function novoTelefone(ddd){
    let telefone = ddd + "-";
    for(i = 0; i < 9; i++){
        telefone += novoDecimal();
        if(i == 4)
            telefone += "-";
    }
    return telefone;
}

function novoCPF(){
    let cpf = "";
    for(i = 0; i < 9; i++){
        cpf += novoDecimal();
        if(i == 2) cpf += ".";
        if(i == 5) cpf += ".";
        if(i == 8) cpf += "-";
    }
    let limpo = cpf.replaceAll(".", "");
    limpo = cpf.replaceAll("-", "");
    let digito = calculaDigito(limpo); 
    return cpf + digito;
}