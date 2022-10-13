var Item = require('../models/item.model');

const teste = function (req, res) {
    res.json("Api respondendo.").end();
};

const create = (req, res) => {
    let item = new Item(
        {
            ni: req.body.ni,
            aquisicao: req.body.aquisicao,
            denominacao: req.body.denominacao,
            valor: req.body.valor,
            img: req.body.img
        }
    );
    item.save(function (err) {
        if (err) {
            return next(err);
        } else {
            res.json('Item de patrimonio criado com sucesso').end();
        }
    })
};

const read = function (req, res) {
    Item.findById(req.params.id, function (err, item) {
        if (err) return next(err);
        res.json(item).end();
    })
};

const readAll = function (req, res) {
    Item.list(function (err, items) {
        if (err) return next(err);
        res.json(items).end();
    });
}

module.exports = {
    teste,
    create,
    read,
    readAll
}