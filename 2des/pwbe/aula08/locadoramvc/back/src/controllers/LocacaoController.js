const con = require('../dao/dblocadora');

const listarLocacoesAtivas = (req, res) => {
    let string = "select * from vw_devolucoes";
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
}

const registrarDevolucao = (req, res) => {
    let id = req.body.id;
    let string = `update locacoes set data_devolucao=curdate() where id = ${id}`;
    con.query(string, (err, result) => {
        if (err == null) {
            if (result.affectedRows != 0) {
                res.status(201).end();
            } else {
                res.status(404).end();
            }
        } else {
            res.status(400).end();
        }
    });
}

module.exports = {
    listarLocacoesAtivas,
    registrarDevolucao
}