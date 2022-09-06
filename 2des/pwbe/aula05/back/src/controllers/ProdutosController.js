const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
});

function listarProdutos(req, res) {
    let query = "SELECT * FROM produtos";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
};

function listaProduto(req, res) {
    let query = `SELECT * FROM produtos WHERE cod = '${req.params.cod}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
};

function cadastrarProduto(req, res) {
    let query = `INSERT INTO produtos VALUES (DEFAULT, '${req.body.cod}', '${req.body.nome}', ${req.body.qntd}, ${req.body.preco})`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function excluirProduto(req, res) {
    let query = `DELETE FROM produtos WHERE cod = '${req.body.cod}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function editarProduto(req, res){
    let query = `UPDATE produtos SET cod = '${req.body.cod}', nome = '${req.body.nome}', qntd = ${req.body.qntd}, preco = ${req.body.preco} WHERE cod = '${req.body.cod}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

module.exports = {
    listarProdutos,
    listaProduto,
    cadastrarProduto,
    excluirProduto,
    editarProduto
}