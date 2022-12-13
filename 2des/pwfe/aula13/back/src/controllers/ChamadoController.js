const model = require('../models/Chamado');

const con = require('../dao/connection');

//CRUD
const cadastrar = (req, res) => {
    let chamado = new model.Chamado();
    con.query(chamado.create(req.body), (err, result) => {
        if (err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const listar = (req, res) => {
    let chamado = new model.Chamado();
    con.query(chamado.readAll(), (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
}


const alterar = (req, res) => {
    let chamado = new model.Chamado();
    con.query(chamado.update(req.body), (err, result) => {
        if (err == null) {
            if (result.affectedRows > 0)
                res.status(202).end();
            else
                res.status(404).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const excluir = (req, res) => {
    let chamado = new model.Chamado();
    con.query(chamado.del(req.params.id), (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(202).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
}

module.exports = {
    cadastrar,
    listar,
    alterar,
    excluir
}