const Comprador = require('../dao/comprador.dao');

const readAll = (req, res) => {
    Promise.resolve(Comprador.readAll())
        .then(result => res.json(result).end())
        .catch(err => res.status(500).json(err).end());
}

const read = (req, res) => {
    Promise.resolve(Comprador.read(req.params.id))
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
    read
}