const express = require('express');
const mysql = require('mysql');
const app = express();

const con = mysql.createConnection({
    user : 'root',
    host : 'localhost',
    database : 'pedidos'
});

app.use(express.json());

app.get('/pedidos',(req, res)=>{
    let priNome = req.query.priNome;
    let sobrenome = req.query.sobrenome;
    let endereco = req.query.endereco;
    let string = `insert into clientes value(null,'${priNome}','${sobrenome}','${endereco}')`;
    console.log(req.query);
    con.query(string,(err,result)=>{
        if(err == null){
            res.json("Dados recebidos com sucesso e enviados para o nosso Banco de Dados");
        } else {
            res.json("Dados recebidos com sucesso, porém não conseguimos enviar para o banco de dados");
        }
    });
});

app.listen(3000,()=>{
    console.log("Respondendo na porta 3000");
});