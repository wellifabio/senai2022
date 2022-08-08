var carrinho = [
    {
        "img":"https://bestchineseproducts.com/wp-content/uploads/2019/07/Nike-Walking-shoes.png",
        "nome":"Tênis Naique Air Jordão",
        "qntd":2
    },
    { 
        "img":"https://40378.cdn.simplo7.net/static/40378/sku/masculino-chinelo-adidas-maverick-1614788091350.jpg",
        "nome":"Chinelo Ardidas",
        "qntd":1
    },
    {
        "img":"https://ae01.alicdn.com/kf/HTB13IDMKh1YBuNjy1zcq6zNcXXaY/Shorts-dos-homens-bermuda-2018-ver-o-praia-shorts-homem-pumba-carta-impress-o-masculina-marca.jpg_Q90.jpg_.webp",
        "nome":"Bermuda Pumba",
        "qntd":3
    },
    { 
        "img":"https://img.elo7.com.br/product/main/243C95B/camisa-jacare-jacare.jpg",
        "nome":"Camisa LaCosta",
        "qntd":5
    }
];

var itemCarrinho = document.querySelector(".item-carrinho");

function carregar() { 
    carrinho.forEach(item => {
        let novoItem = itemCarrinho.cloneNode(true);

        novoItem.classList.remove("modelo");

        novoItem.querySelector("#img-item").src = item.img;
        novoItem.querySelector("#nome-item").innerHTML = item.nome;
        novoItem.querySelector("#qntd-item").value = item.qntd;

        document.querySelector(".carrinho").appendChild(novoItem);
    });
}

function removerItem(e) {
    e.parentNode.remove();
}
