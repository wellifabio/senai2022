const con = require('./connection');
const Oferta = require('./oferta.dao');

const create = (o) => {
    return new Promise((resolve, reject) => {
        let string = `INSERT INTO Objetos(pregao, nome, descricao, quantidade, orcamento_unitario) VALUES` +
            `(${o.pregao}, '${o.nome}', '${o.descricao}', ${o.quantidade}, ${o.orcamento});`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const readAll = () => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM Objetos ORDER BY pregao DESC;`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const readPregao = (pregao) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM Objetos WHERE pregao = ${pregao};`
        con.query(string, (err, result) => {
            if (err) reject(err)
            else if (result.length > 0) {
                for (i = 0; i < result.length; i++) {
                    Promise.resolve(Oferta.readObjeto(result[i].objeto_id))
                        .then(res => {
                            result[i].ofertas = res;
                        }).catch(erro => reject(erro));
                        resolve(result);
                }
            } else {
                resolve(result);
            }
        })
    });
}


const read = (id) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM Objetos WHERE objeto_id = ${id};`
        con.query(string, (err, result) => {
            if (err) reject(err)
            else if (result.length > 0) {
                Promise.resolve(Oferta.readObjeto(result[0].objeto_id))
                    .then(res => {
                        result[0].ofertas = res;
                        resolve(result);
                    }).catch(erro => reject(erro));
            } else {
                resolve(result);
            }
        })
    });
}

const update = (o) => {
    return new Promise((resolve, reject) => {
        let string = `UPDATE Objetos SET nome = '${o.nome}', descricao = '${o.descricao}',` +
            ` quantidade = ${o.quantidade}, orcamento_unitario = ${o.orcamento} WHERE objeto_id = ${o.id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const del = (id) => {
    return new Promise((resolve, reject) => {
        let string = `DELETE FROM Objetos WHERE objeto_id = ${id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

module.exports = {
    create,
    readAll,
    read,
    readPregao,
    update,
    del
}