const con = require('../../connection.js');

const listar = (req, res) => {
    const query = "SELECT * FROM comentarios WHERE id_salgado = " + req.params.id_salgado;

    con.query(query, (err, result) => {
        if(err === null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
}

const cadastrar = (req, res) => {
    const id_user = req.body.id_user;
    const id_salgado = req.body.id_salgado;
    const nota = req.body.nota;
    const avaliacao = req.body.avaliacao;

    const query = `INSERT INTO comentarios VALUES (DEFAULT, ${id_user}, ${id_salgado}, ${nota}, '${avaliacao}')`;

    con.query(query, (err, result) => {
        if(err === null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
}

module.exports = {
    listar,
    cadastrar,
}