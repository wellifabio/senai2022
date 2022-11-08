const con = require('./connection');
const Comprador = require('../models/Comprador');
const Documento = require('../models/Documento');
const Telefone = require('../models/Telefone');

const composer = (lista) => {
    let compradores = [];
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

const readAll = () => {
    let string = 'SELECT * FROM vw_compradores';
    con.query(string, (err, result) => {
        if (err == null) {
            return composer(result);
        } else {
            return { erro: err };
        }
    })
}

module.exports = {
    readAll
}