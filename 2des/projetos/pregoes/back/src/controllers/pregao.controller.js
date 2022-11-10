const Pregao = require('../dao/pregao.dao');

const create = (req, res) => {
    Promise.resolve(Pregao.create(req.body))
        .then(result => {
            res.status(201).json(result).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const readAll = (req, res) => {
    Promise.resolve(Pregao.readAll())
        .then(result => res.json(result).end())
        .catch(err => res.status(500).json(err).end());
}

const readAtivos = (req, res) => {
    Promise.resolve(Pregao.readAtivos())
        .then(result => res.json(result).end())
        .catch(err => res.status(500).json(err).end());
}

const read = (req, res) => {
    Promise.resolve(Pregao.read(req.params.id))
        .then(result => {
            if (result.length > 0)
                res.json(result).end();
            else
                res.status(404).end();
        })
        .catch(err => res.status(500).json(err).end());
}

const update = (req, res) => {
    Promise.resolve(Pregao.update(req.body))
        .then(result => {
            if (result.affectedRows != 0)
                res.json(result).end()
            else
                res.status(404).json(result).end()
        })
        .catch(err => res.status(500).json(err).end());
}

const del = (req, res) => {
    Promise.resolve(Pregao.del(req.params.id))
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
    readAtivos,
    read,
    update,
    del
}