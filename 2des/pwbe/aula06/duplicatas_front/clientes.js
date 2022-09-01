var uriClientes = `http://localhost:3000/duplicatas/clientes`;
const allCli = document.querySelector("#allCli");
const modais = document.querySelector("#modais");

function loadCli() {
    fetch(uriClientes)
        .then(res => { return res.json() })
        .then(data => {
            data.forEach(e => {
                let linha = document.createElement("tr");
                let cod = document.createElement("td");
                let nome = document.createElement("td");
                let endereco = document.createElement("td");
                let bairro = document.createElement("td");
                let cidade = document.createElement("td");
                let uf = document.createElement("td");
                let tels = document.createElement("td");
                cod.innerHTML = e.cod_cli;
                nome.innerHTML = e.nome;
                endereco.innerHTML = e.endereco;
                bairro.innerHTML = e.bairro;
                cidade.innerHTML = e.cidade;
                uf.innerHTML = e.uf;
                tels.innerHTML = `<img src='./assets/fone.png' width='40px' class='tels' onclick='mostraTels(${e.cod_cli})'/>`
                linha.appendChild(cod);
                linha.appendChild(nome);
                linha.appendChild(endereco);
                linha.appendChild(bairro);
                linha.appendChild(cidade);
                linha.appendChild(uf);
                linha.appendChild(tels);
                allCli.appendChild(linha);
                let modal = document.createElement("div");
                let table = document.createElement("table");
                let tbody = document.createElement("tbody");
                modal.setAttribute("class", "modalTels");
                modal.setAttribute("style", "display:none;");
                modal.setAttribute("id", "tmodal"+e.cod_cli);
                table.innerHTML = "<thead><tr><td>Tipo</td><td>Número</td></tr></thead>"
                table.appendChild(tbody);
                modal.appendChild(table);
                modais.appendChild(modal);
                e.telefones.forEach(e1 => {
                    let linhaModal = document.createElement("tr");
                    let tipo = document.createElement("td");
                    let numero = document.createElement("td");
                    tipo.innerHTML = e1.tipo;
                    numero.innerHTML = e1.numero;
                    linhaModal.appendChild(tipo);
                    linhaModal.appendChild(numero);
                    tbody.appendChild(linhaModal);
                });
            });
        });
}

function mostraTels(id){
    let mod = document.querySelector(`#tmodal${id}`);
    mod.setAttribute("style", "display:flex;");
}