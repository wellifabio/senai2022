const Comprador = require('../dao/comprador.dao');

const readAll = (req, res) => {
    Promise.resolve(Comprador.readAll())
        .then(result => res.json(result).end());

}

module.exports = {
    readAll
}