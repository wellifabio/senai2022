const con = require('mysql2');

const connection = con.createConnection({
    host: process.env.HOST,
    user: process.env.USER,
    database: process.env.DATABASE
});

module.exports = connection