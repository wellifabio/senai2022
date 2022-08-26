const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'duplicatas'
});

app.get('/duplicatas/clientes',(req,res)=>{
    let string = "select * from vw_clientes";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/duplicatas/duplicatas',(req,res)=>{
    let string = "select * from duplicatas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/duplicatas/duplicatasaberto',(req,res)=>{
    let string = "select * from vw_duplicatas_aberto";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/duplicatas/duplicataspagas',(req,res)=>{
    let string = "select * from vw_duplicatas_pagas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});