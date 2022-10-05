const Item = require('../models/ItemDAO');

const criarItem = (req, res) => {
    res.json('Construção').end();
}

const listarItens = (req, res) => {
    Promise.resolve(Item.abrir())
        .then(arquivo => {
            console.log(arquivo);
            res.json(arquivo).end();
        })
        .catch(err => {
            res.status(500).send(err);
        });
}

const alterarItem = (req, res) => {
    res.json('Construção').end();
}

const excluirItem = (req, res) => {
    res.json('Construção').end();
}

module.exports = {
    criarItem,
    listarItens,
    alterarItem,
    excluirItem
}