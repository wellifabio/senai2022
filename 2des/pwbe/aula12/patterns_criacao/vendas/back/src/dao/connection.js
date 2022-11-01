const mysql = require("mysql");

//Singleton (Ponto único de conexão com BD)
const con = mysql.createConnection({
    host: 'localhost',
    database: 'vendas',
    user: 'root'
});

module.exports = con;