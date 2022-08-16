// fetch("https://jsonplaceholder.typicode.com/todos")
// .then((res) => {
//     return res.json();
// })
// .then((data) => {
//     data.forEach(todo => {
//         let novoItem = document.querySelector(".item-lista").cloneNode(true);

//         novoItem.classList.remove("model");

//         novoItem.querySelector("#user-id").append(todo.userId);
//         novoItem.querySelector("#title").append(todo.title);
//         novoItem.querySelector("#finalizado").checked = todo.completed;

//         document.querySelector(".lista").appendChild(novoItem);
//     });
// });

function pesquisa() {
    document.querySelector(".lista").innerHTML = "";
    let inpBusca = document.querySelector("#busca").value;
    //fetch("https://jsonplaceholder.typicode.com/todos/" + inpBusca)
    console.log("https://jsonplaceholder.typicode.com/todos?userId=" + inpBusca);
    fetch("https://jsonplaceholder.typicode.com/todos?userId=" + inpBusca)
        .then((res) => {
            return res.json();
        })
        .then((data) => {
            //if (inpBusca == "") {
                data.forEach(todo => {
                    criarElemento(todo.userId, todo.title, todo.completed);
                });

                if(data.length == 0) document.querySelector(".lista").append("Usuário não encontrado");
            // } else {
            //     criarElemento(data.userId, data.title, data.completed);
            // }
        });
}

function criarElemento(id, title, completed) {
    let div = document.createElement("div");
    div.classList.add("item-lista");
    let pUserid = document.createElement("p");
    let pTitle = document.createElement("p");
    let pFinalizado = document.createElement("p");
    let finalizado = document.createElement("input");
    finalizado.type = "checkbox";
    finalizado.checked = completed;

    pUserid.innerHTML = id;
    pTitle.innerHTML = title;
    pFinalizado.appendChild(finalizado);

    div.appendChild(pUserid);
    div.appendChild(pTitle);
    div.appendChild(pFinalizado);

    document.querySelector(".lista").appendChild(div);
}