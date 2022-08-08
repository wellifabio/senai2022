var inpNome = document.querySelector("#nome");
var inpCargo = document.querySelector("#cargo");
var inpSalario = document.querySelector("#salario");

var tbody = document.querySelector("#table-body");

function cadastrar() {
    let cadastrado = false;
    let linhas = tbody.getElementsByTagName("tr");
    for(let i = 0; i < linhas.length; i++) {
        let nomeCadastrado = linhas[i].getElementsByTagName("td")[0].innerHTML.toUpperCase();
        if(nomeCadastrado === inpNome.value.toUpperCase()) cadastrado = true;
    }

    if(cadastrado) {
        alert("Funcionário já Cadastrado");
    }else {
        let tr = document.createElement("tr");
    
        let tdNome = document.createElement("td");
        tdNome.innerHTML = inpNome.value;
    
        let tdCargo = document.createElement("td");
        tdCargo.innerHTML = inpCargo.value;
    
        let tdSalario = document.createElement("td");
        tdSalario.innerHTML = inpSalario.value;
    
        tr.appendChild(tdNome);
        tr.appendChild(tdCargo);
        tr.appendChild(tdSalario);
    
        tbody.appendChild(tr);
    }
}