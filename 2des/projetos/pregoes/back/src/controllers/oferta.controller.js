const con = require('./pregao.dao');
const Oferta = require('../models/Oferta');
const ofertas = [];

const listar = (req, res) => {
    let comprador = new Comprador();
    con.query(comprador.readAll(), (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    })
}

module.exports = {
    ofertas,
    listar
}
