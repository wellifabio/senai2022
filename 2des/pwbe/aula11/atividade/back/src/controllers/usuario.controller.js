const Usuario = require('../models/usuario.model');
const con = require('../dao/usuario.dao');

const create = async (req, res) => {
    let string = Usuario.create(req.body);
    con.query(string, (err, result) => {
        if (err == null) {
            res.status(201).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const readAll = (req, res) => {
    let string = Usuario.readAll();
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(Usuario.blobToAscii(result)).end();
        }
    });
}

const readLogin = (req, res) => {
    let string = Usuario.read(req.params.login);
    con.query(string, (err, result) => {
        if (err == null) {
            if (result.length > 0)
                res.json(Usuario.blobToAscii(result)).end();
            else
                res.status(404).end();
        }
    });
}

const update = (req, res) => {
    let string = Usuario.update(req.body);
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

const del = (req, res) => {
    let string = Usuario.del(req.params.login);
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
    create,
    readAll,
    readLogin,
    update,
    del
}