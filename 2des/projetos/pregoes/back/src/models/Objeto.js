class Objeto {

    ofertas = [];
    
    constructor(id, pregao, nome, descricao, quantidade, orcamento) {
        this.id = id;
        this.pregao = pregao;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.orcamento = orcamento;
    }

    addOferta(oferta){
        ofertas.push(oferta);
    }
}

module.exports = {
    Objeto
}