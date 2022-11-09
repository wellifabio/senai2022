const con = require('./connection');
const Oferta = require('../models/Oferta');
const Fornecedor = require('./fornecedor.dao');

const readAll = () => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM Ofertas ORDER BY data DESC;`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const readView = () => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM vw_ofertas ORDER BY data DESC;`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const read = (id) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM ofertas WHERE oferta_id = ${id};`
        con.query(string, (err, result) => {
            if (err) reject(err)
            else {
                Promise.resolve(Fornecedor.read(result[0].fornecedor))
                    .then(res => {
                        result[0].fornecedor = res[0];
                        resolve(result);
                    }).catch(erro => reject(erro));  
            }
        })
    });
}

module.exports = {
    readAll,
    readView,
    read
}