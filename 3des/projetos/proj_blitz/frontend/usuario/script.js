const visualizacao = document.querySelector('.visualizacao');
const tbody = document.querySelector("tbody");

function load() {
    carregarAlertas();
    carregarMeusAlertas();
}

function carregarMeusAlertas() {
    let idUser = JSON.parse(localStorage.getItem('userdata')).id;

    fetch("http://localhost:3000/localizacao?id_user="+idUser)
    .then(resp => { return resp.json(); })
    .then(data => {
        data.forEach(local => {
            let tr = document.createElement('tr');

            let tdId = document.createElement('td');
            let tdCoord = document.createElement('td');
            let tdTipo = document.createElement('td');

            tdId.innerHTML = local.id;
            tdCoord.innerHTML = local.coordenadas;
            tdCoord.style.maxWidth = "200px";
            tdCoord.style.wordBreak = "break-word";
            tdTipo.innerHTML = local.alertum.tipo;

            tr.appendChild(tdId);
            tr.appendChild(tdCoord);
            tr.appendChild(tdTipo);

            tbody.appendChild(tr);
        })
    })
}

function carregarAlertas() {
    fetch("http://localhost:3000/alerta")
    .then(resp => { return resp.json(); })
    .then(data => {
        data.forEach(alerta => {
            let label = document.createElement("label");
            let checkbox = document.createElement("input");

            label.innerHTML = alerta.tipo;
            label.for = alerta.id;

            checkbox.type = "checkbox";
            checkbox.name = alerta.id;
            checkbox.checked = true;

            visualizacao.appendChild(checkbox);
            visualizacao.appendChild(label);
        })
    })
}