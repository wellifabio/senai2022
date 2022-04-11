const urlBase = "https://openacova.000webhostapp.com/sinventario/src/controll/routes/"; //"../src/controll/routes/"
const xhr = new XMLHttpRequest();
const corpo = document.getElementById("corpo");

function loadMovimentacoes() {
  fetch(urlBase + 'route.movimentacao.php')
    .then((resp) => {
      if (!resp.ok)
        throw new Error("Erro ao executar requisição: " + resp.status);
      return resp.json();
    })
    .then((data) => {
      data.forEach((val) => {
        let linha = document.createElement("tr");
        let id = document.createElement("td");
        let ni = document.createElement("td");
        let incorporacao = document.createElement("td");
        let denominacao = document.createElement("td");
        let local = document.createElement("td");
        let data = document.createElement("td");
        let tipo = document.createElement("td");
        let user = document.createElement("td");
        let botoes = document.createElement("td");
        id.innerHTML = val.id;
        ni.innerHTML = val.ni;
        incorporacao.innerHTML = val.incorporacao;
        denominacao.innerHTML = val.denominacao;
        local.innerHTML = val.local;
        data.innerHTML = val.data;
        tipo.innerHTML = val.tipo;
        user.innerHTML = val.user;
        let btEdit = document.createElement("button");
        let btDel = document.createElement("button");
        btEdit.setAttribute("onclick", "edit(this)");
        btDel.setAttribute("onclick", "del(this)");
        btEdit.innerHTML = "Edit";
        btDel.innerHTML = "Del";
        botoes.appendChild(btEdit);
        botoes.appendChild(btDel);
        linha.appendChild(id);
        linha.appendChild(ni);
        linha.appendChild(incorporacao);
        linha.appendChild(denominacao);
        linha.appendChild(local);
        linha.appendChild(data);
        linha.appendChild(tipo);
        linha.appendChild(user);
        linha.appendChild(botoes);
        corpo.appendChild(linha);
      });
    })
    .catch((err) => {
      console.error(err.message);
    });
}

function edit(e) {
  e.parentNode.parentNode.cells[4].setAttribute("contenteditable", "true");
  e.parentNode.parentNode.cells[5].setAttribute("contenteditable", "true");
  e.parentNode.parentNode.cells[6].setAttribute("contenteditable", "true");
  e.parentNode.parentNode.cells[7].setAttribute("contenteditable", "true");
  e.parentNode.parentNode.cells[8].innerHTML = "<button onclick='send(this)'>Send</button>"
}

function send(e) {
  let data = new FormData();
  data.append("action", "update");
  data.append("id", e.parentNode.parentNode.cells[0].innerHTML);
  data.append("ni", e.parentNode.parentNode.cells[1].innerHTML);
  data.append("local", e.parentNode.parentNode.cells[4].innerHTML);
  data.append("data", e.parentNode.parentNode.cells[5].innerHTML);
  data.append("tipo", e.parentNode.parentNode.cells[6].innerHTML);
  data.append("user", e.parentNode.parentNode.cells[7].innerHTML);
  xhr.addEventListener("readystatechange", function () {
    if (this.readyState === this.DONE) {
      let resp = JSON.parse(this.responseText);
      if (resp.hasOwnProperty("err")) {
        alert(resp.erro);
      } else {
        alert("Movimentação alterada com sucesso.");
      }
      window.location.reload();
    }
  });
  xhr.open("POST", urlBase + 'route.movimentacao.php');
  xhr.send(data);
}

function del(e) {
  let data = new FormData();
  data.append("action", "delete");
  data.append("id", e.parentNode.parentNode.cells[0].innerHTML);
  if (window.confirm("Confirma Exclusão da movimentação id = " + e.parentNode.parentNode.cells[0].innerHTML + " ?")) {
    xhr.addEventListener("readystatechange", function () {
      if (this.readyState === this.DONE) {
        let resp = JSON.parse(this.responseText);
        if (resp.hasOwnProperty("err")) {
          alert(resp.erro);
        }
        window.location.reload();
      }
    });
    xhr.open("POST", urlBase + 'route.movimentacao.php');
    xhr.send(data);
  }
}

function exportar() {
  if (corpo.getElementsByTagName("tr").length > 0) {
    let a = document.createElement("a");
    a.href = "data:," + tbodyToCSV(corpo);
    a.download = "movimentacoes.csv";
    a.click();
  } else {
    alert("Não há dados na tabela para serem salvos.");
  }
}

//Função que percorre o corpo da tabela e converte o resultado em CSV
function tbodyToCSV(tbody) {
  let csv = "";
  let linhas = tbody.getElementsByTagName("tr");
  if (linhas.length > 0) {
    for (let lin = 0; lin < linhas.length; lin++) {
      if (linhas[lin].style["cssText"] !== "display: none;") {
        let colunas = linhas[lin].getElementsByTagName("td");
        for (let col = 0; col < colunas.length - 1; col++) {
          csv += colunas[col].textContent + ";";
        }
        csv += "\r\n";
      }
    }
  }
  return csv;
}

//Função utilizando o jQuery para filtrar a tabela
//http://www.linhadecodigo.com.br/artigo/3511/criando-um-filtro-automatico-nas-colunas-de-uma-tabela-html.aspx
$(function () {
  $("#tabela input").keyup(function () {
    var index = $(this).parent().index();
    var nth = "#tabela td:nth-child(" + (index + 1).toString() + ")";
    var valor = $(this).val().toUpperCase();
    $("#tabela tbody tr").show();
    $(nth).each(function () {
      if ($(this).text().toUpperCase().indexOf(valor) < 0) {
        $(this).parent().hide();
      }
    });
  });

  $("#tabela input").blur(function () {
    $(this).val("");
  });
});
