const con = require('./connection');
const Objeto = require('./objeto.dao');

const create = (o) => {
    return new Promise((resolve, reject) => {
        let string = `INSERT INTO Pregoes(comprador, data_abertura, data_encerramento) VALUES`+
        `(${o.comprador}, '${o.dataAbertura}', '${o.dataEncarramento}');`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const readAll = () => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM Pregoes ORDER BY data_encerramento DESC;`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

//Pattern Composite (Objeto compõe a estrutura do objeto Pregão)
const read = (id) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM Pregoes WHERE pregao_id = ${id};`
        con.query(string, (err, result) => {
            if (err) reject(err)
            else if (result.length > 0) {
                Promise.resolve(Objeto.readPregao(id))
                    .then(resul => {
                        result[0].objetos = resul;
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
        let string = `UPDATE Pregoes SET comprador = ${o.comprador}, data_abertura = '${o.dataAbertura}',`+
        ` data_encerramento = '${o.dataEncerramento}' WHERE pregao_id = ${o.id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

const del = (id) => {
    return new Promise((resolve, reject) => {
        let string = `DELETE FROM Pregoes WHERE pregao_id = ${id};`
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(result);
        })
    });
}

module.exports = {
    create,
    readAll,
    read,
    update,
    del
}