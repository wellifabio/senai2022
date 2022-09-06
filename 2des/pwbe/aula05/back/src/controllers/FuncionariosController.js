const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
});

function listarFuncionarios(req, res) {
    let query = "SELECT * FROM funcionarios";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
};

function listaFuncionario(req, res) {
    let query = `SELECT * FROM funcionarios WHERE matricula = '${req.params.matricula}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
};

function cadastrarFuncionario(req, res) {
    let query = `INSERT INTO funcionarios VALUES (DEFAULT, '${req.body.matricula}', '${req.body.nome}', '${req.body.cargo}', ${req.body.salario}, '${req.body.cpf}')`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function excluirFuncionario(req, res) {
    let query = `DELETE FROM funcionarios WHERE matricula = '${req.body.matricula}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function editarFuncionario(req, res){
    let query = `UPDATE funcionarios SET matricula = '${req.body.matricula}', nome = '${req.body.nome}', cargo = '${req.body.cargo}', salario = ${req.body.salario}, cpf = '${req.body.cpf}' WHERE matricula = '${req.body.matricula}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

module.exports = {
    listarFuncionarios,
    listaFuncionario,
    cadastrarFuncionario,
    excluirFuncionario,
    editarFuncionario
}