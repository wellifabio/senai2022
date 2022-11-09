const Oferta = require('../dao/oferta.dao');

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

module.exports = {
    readAll,
    readView,
    read
}