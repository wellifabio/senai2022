const Fornecedor = require('../dao/fornecedor.dao');

const create = (req, res) => {
    Promise.resolve(Fornecedor.create(req.body))
        .then(result => {
            res.status(201).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const readAll = (req, res) => {
    Promise.resolve(Fornecedor.readAll())
        .then(result => res.json(result).end())
        .catch(err => res.status(500).json(err).end());
}

const read = (req, res) => {
    Promise.resolve(Fornecedor.read(req.params.id))
        .then(result => {
            if (result.length > 0)
                res.json(result).end();
            else
                res.status(404).end();
        })
        .catch(err => res.status(500).json(err).end());
}

module.exports = {
    create,
    readAll,
    read
}