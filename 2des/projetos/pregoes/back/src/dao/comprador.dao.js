const con = require('./connection');
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

const readAll = async () => {
    return new Promise((resolve, reject) => {
        let string = 'SELECT * FROM vw_compradores';
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(composer(result));
        })
    })
}

module.exports = {
    compradores,
    readAll
}