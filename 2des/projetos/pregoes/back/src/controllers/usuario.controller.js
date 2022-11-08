const Usuario = require('../dao/usuario.dao');

const update = (req, res) => {
    Promise.resolve(Usuario.update(req.body))
        .then(result => {
            if (result.affectedRows != 0)
                return res.json(result).end()
            else
                return res.status(404).json(result).end()
        })
        .catch(err => res.status(500).json(err).end());
}

const del = (req, res) => {
    Promise.resolve(Usuario.del(req.params.id))
        .then(result => {
            if (result.affectedRows != 0)
                return res.json(result).end()
            else
                return res.status(404).json(result).end()
        })
        .catch(err => res.status(500).json(err).end());
}

module.exports = {
    update,
    del
}