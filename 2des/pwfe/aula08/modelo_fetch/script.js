fetch("http://localhost:3000/clientes")
.then((response) => {
    return response.json();
})
.then((data) => {
    data.forEach(cliente => {
        let title = document.createElement("h1");
        title.innerHTML = cliente.pri_nome;
        document.querySelector("body").appendChild(title);
    })
})
