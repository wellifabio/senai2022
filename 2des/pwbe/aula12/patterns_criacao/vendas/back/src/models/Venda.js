//Modelo Básico
class Venda {

    readAll() {
        return "SELECT * FROM vendas ORDER BY data DESC";
    }

    del(id) {
        return `DELETE FROM vendas WHERE id = ${id}`;
    }
}

//Pattern Builder
class VendaBuild {
    constructor(body) {
        this.id = body.id;
        this.produto = body.produto;
        this.quantidade = body.quantidade;
        this.preco = body.preco;
    }

    create() {
        return `INSERT INTO vendas VALUES (default,'${this.produto}',${this.quantidade},${this.preco},curdate())`;
    }
}

//Pattern Prototype
const vendas = [
    {
        produto: "Parafuso",
        quantidade: 10,
        preco: 1.5
    },
    {
        produto: "Prego",
        quantidade: 10,
        preco: 1.1
    },
    {
        produto: "Porca",
        quantidade: 10,
        preco: 1.2
    }
]

module.exports = {
    VendaBuild,
    Venda,
    vendas
}