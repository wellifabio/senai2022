//Pattern Builder (Classe utilizando Consrutor)
class Usuario {

    id = 0;
    email = null;
    senha = null;
    documento = null;
    nome = null;
    telefones = [];

    constructor(id, email, senha, doc, nome, tel) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.documento = doc;
        this.nome = nome;
        if (tel != undefined)
            this.telefones.push(tel);
    }

    addTelefone(tel) {
        this.telefones.push(tel);
    }
}

module.exports =  Usuario;