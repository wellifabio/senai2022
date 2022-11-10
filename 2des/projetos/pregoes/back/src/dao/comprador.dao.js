const con = require('./connection');
const Usuario = require('./usuario.dao');

//Pattern Composite (Telefone compõe a estrutura do Objeto)
const create = (data) => {
    return new Promise((resolve, reject) => {
        let string = `INSERT INTO usuarios (email, senha, tipo_documento, numero_documento, nome, tipo) VALUES` +
            `('${data.email}','${data.senha}','${data.documento.tipo}','${data.documento.numero}','${data.nome}',0);`
        con.query(string, (err, result) => {
            if (err)
                reject(err)
            else {
                if (data.telefones != undefined)
                    data.telefones.forEach(e => {
                        e.id = result.insertId;
                        Promise.resolve(Usuario.createTel(e))
                            .then(result.changedRows++);
                    });
                resolve(result);
            }
        })
    });
}

const readAll = () => {
    return new Promise((resolve, reject) => {
        let string = 'SELECT * FROM vw_compradores';
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(Usuario.compradores(result));
        })
    })
}

const read = (id) => {
    return new Promise((resolve, reject) => {
        let string = `SELECT * FROM vw_compradores WHERE usuario_id = ${id}`;
        con.query(string, (err, result) => {
            err ? reject(err) : resolve(Usuario.compradores(result));
        })
    })
}

module.exports = {
    create,
    readAll,
    read
}