const model = require('../models/Venda');

//Pattern singleton (Único método de acesso ao Banco de dados)
const con = require('../dao/connection');

//Pattern factory (Fabrica o objeto Venda com ou sem dados)
function fabrica(obj) {
    if (obj == undefined)
        return new model.Venda();
    else
        return new model.VendaBuild(obj);
}

//Pattern prototype (Faz uma consulta ao banco de dados, caso não possua registro, cadastra 3 protótipos)
const prototype = (req, res) => {
    let venda = fabrica();
    con.query(venda.readAll(), (err, result) => {
        if (err == null) {
            if (result.length == 0) {
                model.vendas.forEach(e => {
                    let v = fabrica(e);
                    con.query(v.create());
                });
                res.json({ registros: model.vendas.length, vendas: model.vendas }).end();
            } else
                res.json({ status: "Online", registros: result.length }).end();
        } else {
            res.status(500).json({ err: err }).end();
        }
    });
}

//CRUD
const cadastrar = (req, res) => {
    let venda = fabrica(req.body);
    con.query(venda.create(), (err, result) => {
        if (err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const listar = (req, res) => {
    let venda = fabrica();
    con.query(venda.readAll(), (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
}

const excluir = (req, res) => {
    let venda = fabrica();
    con.query(venda.del(req.params.id), (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
}

module.exports = {
    prototype,
    cadastrar,
    listar,
    excluir
}