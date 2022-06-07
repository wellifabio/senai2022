const con = require('../../connection.js');

const login = (req, res) => {
    const nome = req.body.nome;
    const senha = req.body.senha;

    const query = `SELECT id, tipo FROM usuarios WHERE nome = '${nome}' AND senha = '${senha}'`;

    con.query(query, (err, result) => {
        if(err === null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
}

module.exports = {
    login
}