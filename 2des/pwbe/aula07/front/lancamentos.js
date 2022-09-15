var uriCaixa = `http://localhost:5000/livrocaixa/lancamentos`;
var lancamentos = [];
var saldo = 0;
const debitos = document.querySelector("#debitos");
const creditos = document.querySelector("#creditos");
const selectDatas = document.querySelector("#datas");
const resumo = document.querySelector("#resumo");

//Mostrar mensagens do sistema
function msg(m) {
    document.querySelector('#modais').setAttribute('style', 'display:flex');
    document.querySelector('#modalMsg').setAttribute('style', 'display:block');
    document.querySelector("#msg").innerHTML = m;
}

//Verificar se recebeu alguma mensagem através da URL
function verificarURLMsgs() {
    if (localStorage.getItem('msg') != null) {
        msg(localStorage.getItem('msg'));
        localStorage.removeItem('msg');
    }
}

//Carregar todos os dados na lista "lancamentos" para montar a página inicial
function carregarTodos() {
    fetch(uriCaixa)
        .then(res => { return res.json() })
        .then(data => {
            lancamentos = data;
            tabelaDebitos();
            tabelaCreditos();
            preencheSelect();
            verificarURLMsgs();
        })
        .catch(err => msg('Erro ao carregar dados, Erro:' + err));
    resumo.innerHTML = `<hr/>Saldo acumulado: R$ ${saldo}`;
}

//Carregar a tabela de Débitos
function tabelaDebitos() {
    lancamentos.forEach(e => {
        if (e.tipo == 'D') {
            debitos.appendChild(tabLinha(e));
            saldo -= parseFloat(e.valor);
        }
    });
}

//Carregar a tabela de Créditos
function tabelaCreditos() {
    lancamentos.forEach(e => {
        if (e.tipo == 'C') {
            creditos.appendChild(tabLinha(e));
            saldo += parseFloat(e.valor);
        }
    });
}

//Criar elemento linha <tr> na tabela e preenche com dados nas colunas <td>
function tabLinha(dados) {
    let linha = document.createElement("tr");
    let nLancamento = document.createElement("td");
    let data = document.createElement("td");
    let descricao = document.createElement("td");
    let valor = document.createElement("td");
    let tipo = document.createElement("td");
    nLancamento.innerHTML = dados.n_lancamento;
    data.innerHTML = dados.data.split('T')[0];
    descricao.innerHTML = dados.descricao;
    valor.innerHTML = dados.valor;
    tipo.innerHTML = dados.tipo == 'D' ? "Entrada" : "Saída";
    linha.appendChild(nLancamento);
    linha.appendChild(data);
    linha.appendChild(descricao);
    linha.appendChild(valor);
    linha.appendChild(tipo);
    return linha;
}

//Preecher o filtro select com todas as selectDatas lançadas
function preencheSelect() {
    selectDatas
        .innerHTML = "";
    let dts = [];
    dts.push(lancamentos[0].data.split("T")[0]);
    for (i = 1; i < lancamentos.length; i++) {
        if (lancamentos[i].data.split("T")[0] != lancamentos[i - 1].data.split("T")[0]) {
            dts.push(lancamentos[i].data.split("T")[0]);
        }
    }
    dts.forEach(e => {
        selectDatas
            .innerHTML += `<option value="${e}">${e}</option>`;
    });
}

//Filtrar as tabelas pela Data escolhida no Select
selectDatas.addEventListener("change", () => {
    saldo = 0;
    creditos.childNodes.forEach(e => {
        if (e.childNodes[1].innerHTML == selectDatas
            .value) {
            e.style.display = "table-row";
            saldo += parseFloat(e.childNodes[3].innerHTML);
        } else {
            e.style.display = "none";
        }
    });
    debitos.childNodes.forEach(e => {
        if (e.childNodes[1].innerHTML == selectDatas
            .value) {
            e.style.display = "table-row";
            saldo -= parseFloat(e.childNodes[3].innerHTML);
        } else {
            e.style.display = "none";
        }
    });
    resumo.innerHTML = `<hr/>Saldo do dia: R$ ${saldo} <button onclick='window.location.reload();'>Todos</button>`;
});

//Criar novo lançamento
function criarLancamento() {
    //Cria um objeto com os dados dos campos html <input>
    let corpo = {
        "descricao": document.querySelector("#descricao").value,
        "valor": document.querySelector("#valor").value,
        "tipo": document.querySelector("#tipo").value
    }
    //Cria outro objeto com os dados da requisição HTTP
    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' }
    };
    //Acrescenta o corpo na requisição no formato JSON
    options.body = JSON.stringify(corpo);
    //Faz efetivamente a requisição ao back-end
    fetch(uriCaixa, options)
        .then(resp => resp.status)
        .then(resp => {
            if (resp == 201) {
                localStorage.setItem('msg', 'Lançamento dadastrado com sucesso.');
                window.location.reload();
            } else {
                localStorage.setItem('msg', 'Erro ao enviar dados ao Banco de dados:' + resp);
                window.location.reload();
            }
        })
        .catch(err => alert(err));
}