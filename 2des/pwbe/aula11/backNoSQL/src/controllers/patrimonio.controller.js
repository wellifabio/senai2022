var Patrimonio = require('../models/patrimonio.model');

const teste = (req, res) => {
    res.json('Olá! Teste ao Controller').end();
};


const create = (req, res) => {
    let patrimonio = new Patrimonio(
        {
            ni: req.body.ni,
            aquisicao: req.body.aquisicao,
            denominacao: req.body.denominacao,
            valor: req.body.valor,
            img: req.body.img
        }
    );
    
    patrimonio.save(function (err) {
        if (err) {
            return next(err);
        }
        res.json('Item de patrimonio criado com sucesso').end();
    })
};

module.exports = {
    teste,
    create
}