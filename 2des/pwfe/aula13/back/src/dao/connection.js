const mysql = require("mysql");

const con = mysql.createConnection({
    host: 'localhost',
    database: 'chamados',
    user: "root"
});

module.exports = con;