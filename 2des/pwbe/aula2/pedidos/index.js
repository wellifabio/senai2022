const express = require('express');
const mysql = require('mysql');
const app = express();

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'pedidos'
});

const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.use(express.json());

app.post('/pedidos', (req, res) => {
    let priNome = req.body.priNome;
    let sobrenome = req.body.sobrenome;
    let endereco = req.body.endereco;
    let string = `insert into clientes value(null,'${priNome}','${sobrenome}','${endereco}')`;
    console.log(req.body);
    con.query(string, (err, result) => {
        if (err == null) {
            res.json("Dados recebidos com sucesso e enviados para o nosso Banco de Dados");
        } else {
            res.json("Dados recebidos com sucesso, porém não conseguimos enviar para o banco de dados");
        }
    });
});

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});