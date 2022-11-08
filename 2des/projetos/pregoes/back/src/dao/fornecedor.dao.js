const con = require('./connection');
const Usuario = require('./usuario.dao');

const create = (data) => {
    return new Promise((resolve, reject) => {
        let string = `INSERT INTO usuarios (email, senha, tipo_documento, numero_documento, nome, tipo) VALUES` +
            `('${data.email}','${data.senha}','${data.documento.tipo}','${data.documento.numero}','${data.nome}',1);`
        con.query(string, (err, result) => {
            if (err)
                reject(err)
            else {
                if (data.telefones != undefined)
                    data.telefones.forEach(e => {
                        Promise.resolve(Usuario.createTel(result.insertId, e))
                            .then(result.changedRows++);
                    });
                resolve(result);
            }
        })
    });
}

const readAll = () => {
    return new Promise((resolve, reject) => {
        let string = 'SELECT * FROM vw_fornecedores';
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(Usuario.fornecedores(result));
        })
    })
}

const read = (id) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM vw_fornecedores WHERE usuario_id = ${id}`;
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(Usuario.fornecedores(result));
        })
    })
}

module.exports = {
    create,
    readAll,
    read
}