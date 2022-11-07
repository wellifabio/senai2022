const con = require('./pregao.dao');
const Comprador = require('../models/Comprador');
const Documento = require('../models/Documento');
const Telefone = require('../models/Telefone');
const compradores = [];

const composer = (lista) => {
    let lastId = 0;
    lista.forEach(e => {
        if (lastId != e.usuario_id) {
            lastId = e.usuario_id;
            compradores.push(new Comprador(e.usuario_id, e.email, e.senha, new Documento(e.tipo_documento, e.numero_documento), e.nome, new Telefone(e.telefone, e.numero)));
        } else {
            compradores[compradores.length - 1].addTelefone(new Telefone(e.telefone, e.numero));
        }
    })
    return compradores;
}

const listar = (req, res) => {
    let comprador = new Comprador();
    con.query(comprador.readAll(), (err, result) => {
        if (err == null) {
            res.json(composer(result)).end();
        }
    })
}

module.exports = {
    compradores,
    listar
}