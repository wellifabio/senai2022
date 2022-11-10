const con = require('./connection');
const Fornecedor = require('./fornecedor.dao');

const create = (o) => {
    return new Promise((resolve, reject) => {
        let string = `INSERT INTO Ofertas(objeto, fornecedor, data, valor) VALUES (${o.objeto}, ${o.fornecedor}, curdate(), ${o.valor});`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

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

const readFornecedor = (fornecedorId) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM ofertas WHERE fornecedor = ${fornecedorId} ORDER BY data DESC;`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const readObjeto = (objetoId) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM ofertas WHERE objeto = ${objetoId} ORDER BY data DESC;`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

//Pattern Composite (Forncecedor compõe a estrutura do objeto Oferta)
const read = (id) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM ofertas WHERE oferta_id = ${id};`
        con.query(string, (err, result) => {
            if (err) reject(err)
            else if (result.length > 0) {
                Promise.resolve(Fornecedor.read(result[0].fornecedor))
                    .then(res => {
                        result[0].fornecedor = res[0];
                        resolve(result);
                    }).catch(erro => reject(erro));
            }else{
                resolve(result);
            }
        })
    });
}

const update = (o) => {
    return new Promise((resolve, reject) => {
        let string = `UPDATE Ofertas SET valor = ${o.valor} WHERE oferta_id = ${o.id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const del = (id) => {
    return new Promise((resolve, reject) => {
        let string = `DELETE FROM Ofertas WHERE oferta_id = ${id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
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