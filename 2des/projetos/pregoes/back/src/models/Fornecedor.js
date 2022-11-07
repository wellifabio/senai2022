const Usuario = require("./Usuario");

class Fornecedor extends Usuario{
    
    constructor(id, email, senha, doc, nome, tel){
        super(id, email, senha, doc, nome, tel);
        this.tipo = 1;
    }

    readAll(){
        return 'SELECT * FROM vw_fornecedores';
    }
}

module.exports = Fornecedor;