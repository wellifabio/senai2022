const Alerta = require('../model/Alerta');

const create = async (req, res) => {
    const data = req.body;

    const ret = await Alerta.create(data);

    res.json(ret);
}

const read = async (req, res) => {
    const id = req.params.id;

    let filtro = {};

    if(id !== undefined) filtro = {where: {id: id}};

    const ret = await Alerta.findAll(filtro);

    //const ret = await Alerta.findAll((req.params.id) ? {where: {id: req.params.id}} : {});

    res.json(ret);
}

const update = async (req, res) => {
    const id = req.params.id;

    const data = req.body;

    let ret = await Alerta.update(data, {where:{id: id}});

    ret = await Alerta.findAll({where: {id: id}});

    res.json(ret);
}

const remove = async (req, res) => {
    const id = req.params.id;

    const ret = await Alerta.destroy({where: {id: id}});

    if(ret == 1) {
        res.json({id: id})
    }else {
        res.status(400).send();
    }

    //(ret == 1) ? res.json({id: id}) : res.status(400).send();
    //res.json({id: (ret == 1) ? id : 0});
}

module.exports = {
    create,
    read,
    update,
    remove,
}