const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();
app.use(express.json());
app.use(cors());

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'livrocaixa'
});

app.get('/livrocaixa/lancamentos', (req, res) => {
    let string = "select * from lancamentos order by data";
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(result);
        }
    });
});

app.post('/livrocaixa/lancamentos', (req, res) => {
    let descricao = req.body.descricao;
    let valor = req.body.valor;
    let tipo = req.body.tipo;
    let string = `insert into lancamentos values (default,curdate(),'${descricao}',${valor},'${tipo}')`;
    con.query(string, (err, result) => {
        if (err == null) {
            res.status(201).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.listen(5000, () => {
    console.log("Respondendo na porta 5000");
});