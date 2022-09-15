const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
});

function cadastrarVenda(req, res) {
    let vendas = req.body.vendas;
    let cadastrados = true;

    vendas.forEach(venda => {
        let query = `INSERT INTO vendas VALUES (DEFAULT, ${venda.id_func}, ${venda.id_prod}, ${venda.qntd}, DEFAULT)`;
        conDB.query(query, (err, result) => {
            if(err != undefined) {
                cadastrados = false;
            }
        })
    });

    if(cadastrados) {
        res.status(201).json({cod:1}).end();
    } else {
        res.status(400).send({cod:2}).end();
    }
}

function relatorioVendas(req, res) {
    let query = "SELECT * FROM relatorio_vendas";

    conDB.query(query, (err, result) => {
        if(err == undefined) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
}

module.exports = {
    cadastrarVenda,
    relatorioVendas
}