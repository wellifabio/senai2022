var funcionarios = [
	{
		"funcionario":"Sancho Cedraz",
		"cargo":{
			"nome":"Analista",
			"nível":2
		},
		"autorizado":true
	},		
	{
		"funcionario":"Ionara Pederneiras",
		"cargo":{
			"nome":"Técnico",
			"nível":2
		},
		"autorizado":true
	},
	{
		"funcionario":"Filipe Castanho",
		"cargo":{
			"nome":"Desenvolvedor",
			"nível":1
		},
		"autorizado":false
	},
	{
		"funcionario":"Lívia Bicalho",
		"cargo":{
			"nome":"Analista",
			"nível":3
		},
		"autorizado":true
	},
	{
		"funcionario":"Mauro Varanda",
		"cargo":{
			"nome":"Desenvolvedor",
			"nível":3
		},
		"autorizado":false
	},	
	{
		"funcionario":"Sandro Rosário",
		"cargo":{
			"nome":"Técnico",
			"nível":3
		},
		"autorizado":true
	}
];

function carregar() {
    funcionarios.forEach(funcionario => {
        let novoItem = document.querySelector(".item-list").cloneNode(true);

        novoItem.classList.remove("modelo");

        novoItem.querySelector("#nome-func").innerHTML = funcionario.funcionario;
        novoItem.querySelector("#nome-cargo").innerHTML = funcionario.cargo.nome;
        novoItem.querySelector("#nivel-cargo").innerHTML = funcionario.cargo.nível;

        let cargo = funcionario.cargo.nome;
        let nvl = funcionario.cargo.nível;
        let permissao = "Leitor";

        if((cargo == "Desenvolvedor" || cargo == "Analista") && nvl >= 3) permissao = "Admin";

        novoItem.querySelector("#nivel-permissao").innerHTML = permissao;
        novoItem.querySelector("#autorizado").checked = funcionario.autorizado;

        let btRemove = document.createElement("button");
        btRemove.innerHTML = "Remover";
        btRemove.addEventListener("click",  e => {
            e.target.parentNode.remove();
        });

        if(nvl >= 3) {
            btRemove.disabled = true;
        }
        
        novoItem.appendChild(btRemove);

        document.querySelector(".list").appendChild(novoItem);
    })
}