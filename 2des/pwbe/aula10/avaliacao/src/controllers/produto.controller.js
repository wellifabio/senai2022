const Produto = require('../models/produto.model');
const con = require('../dao/solicitacoes.dao');

const create = (req, res) => {
    con.query(Produto.create(req.body), (err, result) => {
        if (err == null)
            res.status(201).end();
        else
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
    });
}

const readAll = (req, res) => {
    con.query(Produto.readAll(), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

const readName = (req, res) => {
    con.query(Produto.readNome(req.query), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

module.exports = {
    create,
    readAll,
    readName
}