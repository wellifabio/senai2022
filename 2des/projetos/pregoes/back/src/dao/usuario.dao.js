const con = require('./connection');
const Documento = require('../models/Documento');
const Telefone = require('../models/Telefone');
const Comprador = require('../models/Comprador');
const Fornecedor = require('../models/Fornecedor');

const compradores = (lista) => {
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

const fornecedores = (lista) => {
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

const update = (data) => {
    return new Promise((resolve, reject) => {
        let string = `UPDATE usuarios SET email = '${data.email}', senha = '${data.senha}', tipo_documento = '${data.documento.tipo}',` +
            `numero_documento = '${data.documento.numero}', nome = '${data.nome}'` +
            `WHERE usuario_id = ${data.id}`;
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const del = (id) => {
    return new Promise((resolve, reject) => {
        let string = `DELETE FROM usuarios WHERE usuario_id = ${id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const createTel = (id, data) => {
    return new Promise((resolve, reject) => {
        let string = `INSERT INTO telefones (usuario, tipo, numero) VALUES (${id},'${data.tipo}','${data.numero}');`;
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const updateTel = (id, data) => {
    return new Promise((resolve, reject) => {
        let string = `UPDATE telefones SET tipo = '${data.tipo}', numero = '${data.numero}') WHERE usuario = ${id};`;
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const delTel = (id) => {
    return new Promise((resolve, reject) => {
        let string = `DELETE FROM telefones WHERE usuario = ${id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

module.exports = {
    compradores,
    fornecedores,
    update,
    del,
    createTel,
    updateTel,
    delTel
}