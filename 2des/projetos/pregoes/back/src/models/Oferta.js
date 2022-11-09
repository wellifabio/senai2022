class Oferta{
    constructor(id, objeto, fornecedor, data, valor){
        this.id = id;
        this.objeto = objeto;
        this.fornecedor = fornecedor;
        this.data = data;
        this.valor = valor;
    }
}

module.exports = {
    Oferta
}