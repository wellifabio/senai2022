class Vendas {

    constructor(bd) {
        if (bd != undefined) this.bd = bd;
    }

    listarMySql() {
        return "SELECT * FROM vendas";
    }

    listarMongo() {
        return "list(vendas)";
    }

    listar() {
        return this.bd == undefined ? this.listarMySql() : this.listarMongo();
    }
}

var v = new Vendas();
console.log(v.listar());

v = new Vendas("mongo");
console.log(v.listar());