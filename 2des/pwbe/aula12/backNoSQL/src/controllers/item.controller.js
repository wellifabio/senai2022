const { json } = require('express');
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
    });
};

const readAll = function (req, res) {
    Item.find({}, (err, items) => {
        if (err) return next(err);
        else res.json({ items: items }).end();
    });
}

const readId = function (req, res) {
    Item.findById(req.params.id, (err, item) => {
        if (err) {
            res.status(404).json({ erro: err }).end();
        } else {
            res.json(item).end();
        }
    });
}

const readNi = function (req, res) {
    Item.find({ ni: req.params.ni }, (err, item) => {
        if (err) {
            res.status(500).json({ erro: err }).end();
        } else {
            if (item.length > 0)
                res.json(item).end();
            else
                res.status(404).json({ erro: "Item não encontrado" }).end();
        }
    });
}

const updateId = function (req, res) {
    Item.findOneAndUpdate(
        {
            '_id': req.params.id            //Busca
        },
        {
            ni: req.body.ni,                //Atualizações
            aquisicao: req.body.aquisicao,
            denominacao: req.body.denominacao,
            valor: req.body.valor,
            img: req.body.img
        },
        {
            new: true,                       // retorne o doc atualizado
            runValidators: true              // valide antes de atualizar
        })
        .then(resp => {
            if (resp)
                res.status(200).json({ resposta: resp }).end();
            else
                res.status(404).json({ resposta: resp }).end();
        })
        .catch(err => {
            res.status(500).json({ erro: err }).end();
        })
}

const updateNi = function (req, res) {
    Item.findOneAndUpdate(
        {
            'ni': req.params.ni            //Busca
        },
        {
            aquisicao: req.body.aquisicao, //Atualizações
            denominacao: req.body.denominacao,
            valor: req.body.valor,
            img: req.body.img
        },
        {
            new: true,                       // retorne o doc atualizado
            runValidators: true              // valide antes de atualizar
        })
        .then(resp => {
            if (resp)
                res.status(200).json({ resposta: resp }).end();
            else
                res.status(404).json({ resposta: resp }).end();
        })
        .catch(err => {
            res.status(500).json({ erro: err }).end();
        })
}

const delId = function (req, res) {
    Item.findOneAndRemove({ '_id': req.params.id })
        .then(resp => {
            if (resp)
                res.status(200).json({ resposta: resp }).end();
            else
                res.status(404).json({ resposta: resp }).end();
        })
        .catch(err => {
            res.status(500).json({ erro: err }).end();
        });
}

const delNi = function (req, res) {
    Item.findOneAndRemove({ 'ni': req.params.ni })
        .then(resp => {
            if (resp)
                res.status(200).json({ resposta: resp }).end();
            else
                res.status(404).json({ resposta: resp }).end();
        })
        .catch(err => {
            res.status(500).json({ erro: err }).end();
        });
}

module.exports = {
    teste,
    create,
    readAll,
    readId,
    readNi,
    updateId,
    updateNi,
    delId,
    delNi
}