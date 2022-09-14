const con = require('../dao/dblocadora');

const listarClientes = (req, res) => {
    let string = "select * from clientes order by codigo desc";
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
}

const criarCliente = (req, res) => {
    let nome = req.body.nome;
    let endereco = req.body.endereco;
    let telefone = req.body.telefone;
    let string = `insert into clientes values (default,'${nome}','${endereco}','${telefone}')`;
    con.query(string, (err, result) => {
        if (err == null) {
            res.status(201).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

module.exports = {
    listarClientes,
    criarCliente
}