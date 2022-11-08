const con = require('../dao/connection');
const Fornecedor = require('../models/Fornecedor');
const Documento = require('../models/Documento');
const Telefone = require('../models/Telefone');

const composer = (lista) => {
    let fornecedores = [];
    let lastId = 0;
    lista.forEach(e => {
        if (lastId != e.usuario_id) {
            lastId = e.usuario_id;
            fornecedores.push(new Fornecedor(e.usuario_id, e.email, e.senha, new Documento(e.tipo_documento, e.numero_documento), e.nome, new Telefone(e.telefone, e.numero)));
        } else {
            fornecedores[fornecedores.length - 1].addTelefone(new Telefone(e.telefone, e.numero));
        }
    })
    return fornecedores;
}

const listar = (req, res) => {
    let fornecedor = new Fornecedor();
    con.query(fornecedor.readAll(), (err, result) => {
        if (err == null) {
            res.json(composer(result)).end();
        }
    })
}

module.exports = {
    listar
}