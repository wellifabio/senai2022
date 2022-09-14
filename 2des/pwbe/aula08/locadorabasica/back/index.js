const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();
app.use(cors());
app.use(express.json());

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'locadora'
});

//Dados para a tela de Clientes
app.get('/locadora/clientes',(req,res)=>{
    let string = "select * from clientes";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result).end();
        }
    });
});

//Criar novo cliente
app.post('/locadora/clientes',(req,res)=>{
    let nome = req.body.nome;
    let endereco = req.body.endereco;
    let telefone = req.body.telefone;
    let string = `insert into clientes values(null,'${nome}','${endereco}','${telefone}')`;
    con.query(string,(err,result)=>{
        if(err == null){
            res.status(201).end();
        }else{
            res.status(400).end();
        }
    });
});

//Dados para a tela de devolucoes
app.get('/locadora/devolucoes',(req,res)=>{
    let string = "select * from vw_devolucoes";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result).end();
        }
    });
});

//Altera o campo data da devolução para efetivar a devolução de um filme
app.put('/locadora/devolucoes',(req,res)=>{
    let id = req.body.id;
    let string = `update locacoes set data_devolucao = curdate() where id = ${id}`;
    con.query(string,(err,result)=>{
        if(err == null){
            if(result.affectedRows == 1)
                res.status(202).end();
            else
                res.status(404).end();
        }else{
            res.status(400).end();
        }
    });
});



app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});