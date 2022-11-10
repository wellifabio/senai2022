const Usuario = require("./Usuario");

//Pattern Builder (Classe utilizando Consrutor)
class Fornecedor extends Usuario{
    
    constructor(id, email, senha, doc, nome, tel){
        super(id, email, senha, doc, nome, tel);
        this.tipo = 1;
    }
}

module.exports = Fornecedor;