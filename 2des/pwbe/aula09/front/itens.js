const uri = 'http://localhost:3000/patrimonio/itens/';
const corpo = document.querySelector("#corpo");
const cadastro = document.querySelector("#cadastro");
const alteracao = document.querySelector("#alteracao");
const modalAlteracao = document.querySelector("#modalAlteracao");
var itens = [];

const carregar = () => {
    const options = { method: 'GET' };
    fetch(uri, options)
        .then(res => res.json())
        .then(res => {
            itens = res;
            preencherTela();
        })
        .catch(err => console.error(err));
}

const preencherTela = () => {
    itens.forEach(e => {
        let card = document.querySelector(".card").cloneNode(true);
        card.classList.remove('modal');
        card.querySelector("#ni").innerHTML += e.ni;
        card.querySelector("#aquisicao").innerHTML += e.aquisicao.slice(0, 10);
        card.querySelector("#denominacao").innerHTML += e.denominacao;
        card.querySelector("#valor").innerHTML += e.valor.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
        card.querySelector("#img").src = '../docs/assets/' + e.img;
        card.querySelector("#del").setAttribute('onclick', `del(${e.ni})`);
        card.querySelector("#alterar").setAttribute('onclick', `alterar(${e.ni})`);
        corpo.appendChild(card);
    });
}

const indice = (ni) => {
    let indice = -1;
    for (i = 0; i < itens.length; i++) {
        if (itens[i].ni == ni)
            indice = i;
    }
    return indice;
}

const alterar = (ni) => {
    let i = indice(ni);
    modalAlteracao.setAttribute('style', 'display:flex;');
    alteracao.ni.value = ni;
    alteracao.aquisicao.value = itens[i].aquisicao;;
    alteracao.denominacao.value = itens[i].denominacao;
    alteracao.valor.value = itens[i].valor;
    alteracao.img.value = itens[i].img;
}

cadastro.addEventListener('submit', function (e) {

    e.preventDefault();

    const dados = {};

    dados.ni = parseInt(cadastro.ni.value);
    dados.aquisicao = cadastro.aquisicao.value;
    dados.denominacao = cadastro.denominacao.value;
    dados.valor = parseFloat(cadastro.valor.value);
    dados.img = cadastro.img.value;

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
    };
    options.body = JSON.stringify(dados);

    fetch(uri, options)
        .then(resp => resp.status)
        .then(resp => {
            if (resp == 201)
                window.location.reload()
            else
                alert("Item já está cadastrado.");
        })
        .catch(err => console.error(err));
});

alteracao.addEventListener('submit', function (e) {

    e.preventDefault();

    const dados = {};

    dados.ni = parseInt(alteracao.ni.value);
    dados.aquisicao = alteracao.aquisicao.value;
    dados.denominacao = alteracao.denominacao.value;
    dados.valor = parseFloat(alteracao.valor.value);
    dados.img = alteracao.img.value;

    const options = {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
    };
    options.body = JSON.stringify(dados);

    fetch(uri, options)
        .then(resp => resp.status)
        .then(resp => {
            if (resp == 200)
                window.location.reload()
            else
                alert("Erro ao cadastrar.");
        })
        .catch(err => console.error(err));
});

const del = (ni) => {
    const options = {
        method: 'DELETE'
    };
    if (confirm("Confirma a exclusão do item " + ni)) {
        fetch(uri + ni, options)
            .then(res => res.status)
            .then(res => {
                if (res == 204)
                    window.location.reload();
            })
            .catch(err => console.error(err));
    }
}