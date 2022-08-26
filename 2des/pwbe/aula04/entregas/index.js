const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'entregas'
});

app.get('/entregas/clientes',(req,res)=>{
    let string = "select * from vw_clientes";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/entregas/entregadores',(req,res)=>{
    let string = "select * from entregadores";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/entregas/pedidos',(req,res)=>{
    let string = "select * from pedidos";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/entregas/itens',(req,res)=>{
    let string = "select * from itens";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/entregas/produtos',(req,res)=>{
    let string = "select * from produtos";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});