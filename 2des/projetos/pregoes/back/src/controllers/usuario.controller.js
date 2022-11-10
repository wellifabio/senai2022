const Usuario = require('../dao/usuario.dao');
const { geraJWT } = require('../views/middleware');

const login = (req, res) => {
    Promise.resolve(Usuario.login(req.body))
        .then(result => {
            if (result.length != 0) {
                res.json(geraJWT(result[0])).end();
            } else
                res.status(404).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const update = (req, res) => {
    Promise.resolve(Usuario.update(req.body))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end();
            else
                res.status(404).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const del = (req, res) => {
    Promise.resolve(Usuario.del(req.params.id))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end();
            else
                res.status(404).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const createTel = (req, res) => {
    Promise.resolve(Usuario.createTel(req.body))
        .then(result => {
            res.status(201).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const updateTel = (req, res) => {
    Promise.resolve(Usuario.updateTel(req.body))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end();
            else
                res.status(404).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const delTel = (req, res) => {
    Promise.resolve(Usuario.delTel(req.params.id, req.body.numero))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end();
            else
                res.status(404).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

module.exports = {
    login,
    update,
    del,
    createTel,
    updateTel,
    delTel
}