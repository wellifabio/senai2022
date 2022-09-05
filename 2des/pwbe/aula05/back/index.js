const Express = require('express');
const cors = require('cors');
const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
});

const app = Express();
app.use(Express.json());
app.use(cors());

app.get("/produtos", (req, res) => {
    let query = "SELECT * FROM produtos";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
});

//http://localhost:3000/produtos/MO5214
//req.params.cod
app.get("/produtos/:cod", (req,res) => {
    let query = `SELECT * FROM produtos WHERE cod = '${req.params.cod}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
});

app.post("/produtos", (req, res) => {
    /*
        req.query => http://localhost:3000/produtos?cod=ab1234&nome=teste
        req.params => /produtos/:cod/:nome => http://localhost:3000/produtos/abc1234/teste
    */

    let query = `INSERT INTO produtos VALUES (DEFAULT, '${req.body.cod}', '${req.body.nome}', ${req.body.qntd}, ${req.body.preco})`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
});

app.listen(3000, () => {
    console.log("App ON");
});