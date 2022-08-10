var op1 = "", op2 = "";
function gera(info) {
    let vet = info.split(";");
    op1+=vet[0];
    op2+=vet[1];

    console.log(op1, op2);
}