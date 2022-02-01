const Localizacao = require('../model/Localizacao');
const Usuario = require('../model/Usuario');
const Alerta = require('../model/Alerta');

const create = async (req, res) => {
    const data = req.body;

    const ret = await Localizacao.create(data);

    res.json(ret);
}

const read = async (req, res) => {
    let filtro = {};
    
    let id = req.params.id;

    let id_user = req.query.id_user;

    if(id != undefined) filtro = { where : { id: id } }

    filtro.attributes = {
        exclude: ['id_user', 'id_alerta']
    }

    filtro.include = [
        { model: Usuario, attributes: { exclude: ['senha'] } },
        { model: Alerta }
    ];

    if(id_user !== undefined) {
        filtro.include[0].where = { id: id_user}
    }

    const ret = await Localizacao.findAll(filtro);

    res.json(ret);
}

const update = async (req, res) => {
    const id = req.params.id;

    const data = req.body;

    let ret = await Localizacao.update(data, {
        where : { id: id}
    });

    ret = await Localizacao.findAll({ 
        where : {id: id}
    })

    res.json(ret);
}

const remove = async (req, res) => {
    const id = req.params.id;

    const ret = await Localizacao.destroy({
        where: {id: id}
    })
    
    if(ret == 1) {
        res.json({id: id});
    }else {
        res.status(400).send();
    }
}

module.exports = {
    create,
    read,
    update,
    remove,
}