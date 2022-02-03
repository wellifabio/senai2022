const alerta = document.querySelector("#alerta");
const cadastrar = document.querySelector("#cadastrar");
const modal = document.querySelector(".modal");
const body = document.querySelector("body");
const menu = document.querySelector(".menu");

var map;
var meuAlerta;

function initMap() {    
    map = new google.maps.Map(document.querySelector(".map"), {
        center: { lat: -34.397, lng: 150.644 },
        zoom: 18,
    });

    map.addListener("click", (data) => {
        let coord = { lat: data.latLng.lat(), lng: data.latLng.lng() };

        //addMarker(coord, "Teste", "../assets/radar.png");
        meuAlerta = coord;
        
        showModal();
    });

    navigator.geolocation.getCurrentPosition((location) => {
        let coord = { lat: location.coords.latitude, lng: location.coords.longitude};
        
        map.setCenter(coord);

        addMarker(coord, "Minha Localizacao", "../assets/localiza.png");
    });
}

function cadastro() {
    let idUser = JSON.parse(localStorage.getItem("userdata")).id;

    let data = JSON.stringify({
        "id_user": idUser,
        "id_alerta": alerta.value,
        "coordenadas": meuAlerta.lat + "," + meuAlerta.lng,
        "ativo": true,
    });

    fetch("http://localhost:3000/localizacao", {
        method:"POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: data
    })
    
    .then(resp => { return resp.json() })
    .then(data => {
        if(data.id != undefined){ 
            let tipo = alerta.value;
            addMarker(meuAlerta, tipo, "../assets/"+ tipo +".png");
            closeModal();
        }else {
            alert("Falha ao informar alerta");
        }
    })
}

function addMarker(coord, title, image) {
    new google.maps.Marker({
        position: coord,
        map: map,
        title: title,
        icon: image
    });
}

function inicializar() {
    carregarMarcacoes();
    carregarAlertas();
}

function carregarMarcacoes() {
    let alertas = localStorage.getItem("alertas");

    fetch("http://localhost:3000/localizacao")
    .then(resp => { return resp.json() })
    .then(data => {
        data.forEach(localizacao => {
            //localizacao.coordenadas -> '-22.701625501929453,-46.701625501929453'
            let coordenadas = localizacao.coordenadas.split(',');
            let coord = { lat: Number(coordenadas[0]), lng: Number(coordenadas[1]) };

            let imagem = "../assets/" + localizacao.alertum.id + ".png";

            if(alertas !== null) {
                if(alertas.includes(localizacao.alertum.id)) addMarker(coord, localizacao.alertum.tipo, imagem);
            }else {
                addMarker(coord, localizacao.alertum.tipo, imagem);
            }
        });
    })
}

function carregarAlertas() {
    fetch("http://localhost:3000/alerta")
    .then(resp => { return resp.json() })
    .then(data => {
        data.forEach(alert => {
            let op = document.createElement("option");
            op.value = alert.id;
            op.innerHTML = alert.tipo;
            alerta.appendChild(op);
        })
    })
}

function showModal() {
    modal.style.display = "flex";
}

function closeModal() {
    modal.style.display = "none";
}

function showMenu() {
    menu.style.left = "0px";
}

function closeMenu() {
    menu.style.left = "-50vw";
}