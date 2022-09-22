const Receita = require('../models/Receita');
const con = require('../dao/dbreceitas');
const multer = require('multer');
const upload = multer().single('foto')
const fs = require('fs');

const cadastrarReceita = async (req, res) => {
    upload(req, res, function (err) {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            let string = Receita.toCreate(req.body, req.file);
            con.query(string, (err, result) => {
                if (err == null) {
                    //res.status(201).json(dados).end();
                    res.redirect('http://127.0.0.1:5500/front/receitas.html');
                } else {
                    res.status(500).json(err).end();
                }
            });
        }
    });
}

const listarReceitas = (req, res) => {
    let string = Receita.toReadAll();
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(Receita.toAscii(result)).end();
        }
    });
}

const excluirReceita = (req, res) => {
    let string = Receita.toDel(req.body);
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