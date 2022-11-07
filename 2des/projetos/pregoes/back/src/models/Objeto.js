class Objeto {

    ofertas = [];
    
    constructor(id, nome, descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    addOferta(oferta){
        ofertas.push(oferta);
    }
}

module.exports = {
    Objeto
}