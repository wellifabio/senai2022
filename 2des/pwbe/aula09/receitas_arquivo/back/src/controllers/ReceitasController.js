const Receita = require('../models/Receita');
const con = require('../dao/dbreceitas');

const cadastrarReceita = (req, res) => {
    let string = Receita.toCreate(req.body);
    con.query(string, (err, result) => {
        if (err == null) {
            res.status(201).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const listarReceitas = (req, res) => {
    let string = Receita.toReadAll();
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
}

const excluirReceita = (req, res) => {
    let string = Receita.toDelete(req.body);
    con.query(string, (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
}

module.exports = {
    listarReceitas,
    cadastrarReceita,
    excluirReceita
}