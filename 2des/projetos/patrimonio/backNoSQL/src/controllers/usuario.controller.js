var Usuario = require('../models/usuario.model');

const login = (req, res) => {
    let usuario = {};
    let encontrado = 0;
    Usuario.forEach(e => {
        if (e.username == req.body.username && e.password == req.body.password) {
            encontrado = 1;
            usuario = e;
        }
    });
    if (encontrado) {
        res.json(usuario).end();
    } else {
        res.status(404).json({ erro: "Usuário não encontrado" }).end();
    }
};

module.exports = {
    login
};