const Oferta = require('../dao/oferta.dao');

const create = (req, res) => {
    Promise.resolve(Oferta.create(req.body))
        .then(result => {
            res.status(201).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const readAll = (req, res) => {
    Promise.resolve(Oferta.readAll())
        .then(result => res.json(result).end())
        .catch(err => res.status(500).json(err).end());
}

const readView = (req, res) => {
    Promise.resolve(Oferta.readView())
        .then(result => res.json(result).end())
        .catch(err => res.status(500).json(err).end());
}

const readFornecedor = (req, res) => {
    Promise.resolve(Oferta.readFornecedor(req.params.id))
        .then(result => {
            if (result.length > 0)
                res.json(result).end();
            else
                res.status(404).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const readObjeto = (req, res) => {
    Promise.resolve(Oferta.readObjeto(req.params.id))
        .then(result => {
            if (result.length > 0)
                res.json(result).end();
            else
                res.status(404).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const read = (req, res) => {
    Promise.resolve(Oferta.read(req.params.id))
        .then(result => {
            if (result.length > 0)
                res.json(result).end();
            else
                res.status(404).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const update = (req, res) => {
    Promise.resolve(Oferta.update(req.body))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end()
            else
                res.status(404).json(result).end()
        })
        .catch(err => res.status(500).json(err).end());
}

const del = (req, res) => {
    Promise.resolve(Oferta.del(req.params.id))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end()
            else
                res.status(404).json(result).end()
        })
        .catch(err => res.status(500).json(err).end());
}

module.exports = {
    create,
    readAll,
    readView,
    readFornecedor,
    readObjeto,
    read,
    update,
    del
}