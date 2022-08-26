const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'onibus'
});

app.get('/onibus/motoristas',(req,res)=>{
    let string = "select * from vw_motoristas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/onibus/linhas',(req,res)=>{
    let string = "select * from linhas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/onibus/horarios',(req,res)=>{
    let string = "select * from horarios";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/onibus/motlinhas',(req,res)=>{
    let string = "select * from mot_linhas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});