const Comprador = require('../dao/comprador.dao');

const readAll = (req, res) => {
    let data = Comprador.readAll();
    res.json(data).end();
}

module.exports = {
    readAll
}