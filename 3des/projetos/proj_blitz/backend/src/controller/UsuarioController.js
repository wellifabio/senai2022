const Usuario = require('../model/Usuario');

const create = (req, res) => {
    const data = req.body;

    const ret = Usuario.create(data);

    res.json(ret);
}

const read = (req, res) => {
    const ret = Usuario.findAll();

    res.json(ret);
}

module.exports = {
    create,
    read,
}