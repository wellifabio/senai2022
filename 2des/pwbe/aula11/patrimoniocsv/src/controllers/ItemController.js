const ItemDAO = require('../models/ItemDAO');
const Item = require('../models/Itens');

const carregar = () => {
    Promise.resolve(ItemDAO.abrir())
        .then(arquivo => {
            Item.toListObj(arquivo);
        }).catch(err => {
            console.error(err);
        });
}

const gravar = () => {
    Promise.resolve(ItemDAO.salvar(Item.toCSV())).catch(err => {
        console.error(err);
    });
}

const criarItem = (req, res) => {
    Item.itens.push(req.body);
    res.status(201).json(req.body).end();
    gravar();
}

const listarItens = (req, res) => {
    res.json(Item.itens).end();
}

module.exports = {
    carregar,
    criarItem,
    listarItens
}