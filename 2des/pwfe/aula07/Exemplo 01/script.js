var info = "";
var teste = "";

document.querySelector("#teste").addEventListener("keyup", (act) => {
    //info += act.key;
    //teste += "*"
    //act.target.value = teste;
})

function navegar() {
    let val = document.querySelector("#teste").value;

    let teste = new Array();

    teste.push(1);
    teste.push(2);
    teste.push(3);

    let arrFunc = new Array();

    let func = {
        "nome":val,
        "premios":teste,
        "cargo":{
            "nome":"Gerente"
        }
    }

    arrFunc.push(func);

    arrFunc[0].premios.forEach(premio => {
        console.log(premio)
    })
}