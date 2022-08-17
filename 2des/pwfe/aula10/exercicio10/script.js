var btCadastrar = document.querySelector("#cadastrar");
var inpCep = document.querySelector("#cep");
var inpSenha = document.querySelector("#senha");
var inpCsenha = document.querySelector("#csenha");

btCadastrar.addEventListener("click", () => {
    let infoUser = {};
    if(inpSenha.value == inpCsenha.value) {
        document.querySelectorAll("input").forEach(inp => {
            infoUser[inp.id] = inp.value;
        });
        delete infoUser.csenha;
        console.log(infoUser);
    }else {
        alert("Senhas não conferem")
    }
});

inpCep.addEventListener("keyup", act => {
    let val = act.target.value;

    if(val.length == 8) {
        fetch(`https://viacep.com.br/ws/${val}/json/`)
        .then(res => {return res.json()})
        .then(data => {
            document.querySelector("#logradouro").value = data.logradouro;
            document.querySelector("#bairro").value = data.bairro;
            document.querySelector("#cidade").value = data.localidade;
            document.querySelector("#estado").value = data.uf;
        })
    }
})
