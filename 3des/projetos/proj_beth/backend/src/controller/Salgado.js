const con = require('../../connection.js');

const listar = (req, res) => {
    const query = "SELECT * FROM salgados";

    con.query(query, (err, result) => {
        if(err === null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
}

const cadastrar = (req, res) => {
    const nome = req.body.nome;
    const descricao = req.body.descricao;
    const foto = req.body.foto;

    const query = `INSERT INTO salgados VALUES (DEFAULT, '${nome}', '${descricao}', '${foto}')`;

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