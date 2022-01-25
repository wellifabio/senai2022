const urlBase = "https://openacova.000webhostapp.com/sinventario/src/controll/routes/"; //"../src/controll/routes/"
const xhr = new XMLHttpRequest();
const col = document.getElementById("col");
const frame = document.getElementById("frame");
const modal1 = document.getElementById("modal1");
const modal2 = document.getElementById("modal2");
const modal3 = document.getElementById("modal3");

function addLocal(){
  modal1.setAttribute("style","display:block");
}

function addItem(){
  modal2.setAttribute("style","display:block");
}

function conferencia(){
  modal3.setAttribute("style","display:block");
}

function adicionarLocal(){
  let nome = document.getElementById("nome");
  let descricao = document.getElementById("descricao");
  if(nome.value !== '' && descricao.value !== ''){
    let data = new FormData();
    data.append("action", "create");
    data.append("nome", nome.value);
    data.append("descricao", descricao.value);
    xhr.addEventListener("readystatechange", function () {
      if (this.readyState === this.DONE) {
        let resp = JSON.parse(this.responseText);
        if (resp.hasOwnProperty("err")) {
          alert(resp.erro);
        } else {
          modal1.setAttribute("style","display:none");
          nome.value = '';
          descricao.value = '';
          frame.setAttribute("src","./locais.html");
        }
      }
    });
    xhr.open("POST", urlBase + 'route.local.php');
    xhr.send(data);
  }else{
    alert("Favor preecher os campos obrigatórios.");
  }
}

function adicionarItem(){
  let ni = document.getElementById("ni");
  let denominacao = document.getElementById("denominacao");
  let valaquis = document.getElementById("valaquis");
  if(ni.value !== '' && denominacao.value !== '' && valaquis.value !== ''){
    let data = new FormData();
    data.append("action", "create");
    data.append("ni", ni.value);
    data.append("denominacao", denominacao.value);
    data.append("valaquis", valaquis.value);
    xhr.addEventListener("readystatechange", function () {
      if (this.readyState === this.DONE) {
        let resp = JSON.parse(this.responseText);
        if (resp.hasOwnProperty("err")) {
          alert(resp.erro);
        } else {
          modal2.setAttribute("style","display:none");
          ni.value = '';
          denominacao.value = '';
          valaquis.value = '';
          frame.setAttribute("src","./itens.html");
        }
      }
    });
    xhr.open("POST", urlBase + 'route.item.php');
    xhr.send(data);
  }else{
    alert("Favor preecher os campos obrigatórios.");
  }
}

function adicionarMovimentacao(){
  let local = document.getElementById("f1");
  let ni = document.getElementById("f2");
  let user = document.getElementById("f3");
  if(ni.value !== '' && local.value !== ''){
    let data = new FormData();
    data.append("action", "create");
    data.append("ni", ni.value);
    data.append("local", local.value);
    data.append("user", user.value);
    data.append("tipo", "checado");
    xhr.addEventListener("readystatechange", function () {
      if (this.readyState === this.DONE) {
        let resp = JSON.parse(this.responseText);
        if (resp.hasOwnProperty("err")) {
          alert(resp.erro);
        } else {
          modal3.setAttribute("style","display:none");
          ni.value = '';
          local.value = '';
          frame.setAttribute("src","./movimentacoes.html");
        }
      }
    });
    xhr.open("POST", urlBase + 'route.movimentacao.php');
    xhr.send(data);
  }else{
    alert("Favor preecher os campos obrigatórios.");
  }
}

function loadLocais(filtro) {
  col.innerHTML = '';
  fetch(urlBase + 'route.local.php?nome='+filtro)
    .then((resp) => {
      if (!resp.ok)
        throw new Error("Erro ao executar requisição: " + resp.status);
      return resp.json();
    })
    .then((data) => {
      data.forEach((val) => {
        let bt = document.createElement("button");
        bt.innerHTML = val.nome;
        bt.setAttribute("onclick", "selectLocal(this)");
        col.appendChild(bt);
      });
    })
    .catch((err) => {
      console.error(err.message);
    });
}

function loadItens(filtro) {
  col.innerHTML = '';
  fetch(urlBase + 'route.item.php?ni='+filtro)
    .then((resp) => {
      if (!resp.ok)
        throw new Error("Erro ao executar requisição: " + resp.status);
      return resp.json();
    })
    .then((data) => {
      data.forEach((val) => {
        let bt = document.createElement("button");
        bt.innerHTML = val.ni;
        bt.setAttribute("onclick", "selectItem(this)");
        col.appendChild(bt);
      });
    })
    .catch((err) => {
      console.error(err.message);
    });
}

function selectLocal(e){
  let f1 = document.getElementById("f1");
  f1.value = e.innerHTML;
  col.innerHTML = '';
}

function selectItem(e){
  let f2 = document.getElementById("f2");
  f2.value = e.innerHTML;
  col.innerHTML = '';
}