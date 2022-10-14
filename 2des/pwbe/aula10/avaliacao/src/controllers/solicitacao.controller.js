const Solicitacao = require('../models/solicitacao.model');
const con = require('../dao/solicitacoes.dao');

const create = (req, res) => {
    con.query(Solicitacao.create(req.body), (err, result) => {
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
    con.query(Solicitacao.readAll(), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

const readProdByMes = (req, res) => {
    con.query(Solicitacao.readProdutos(req.params.mes), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

const readTotSolFum = (req, res) => {
    con.query(Solicitacao.readTotSolFum(), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

module.exports = {
    create,
    readAll,
    readProdByMes,
    readTotSolFum
}