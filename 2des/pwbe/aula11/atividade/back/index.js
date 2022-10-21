require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');

let corsOptions = {
    origin: [ 'http://localhost:5500', 'http://localhost:3000', 'http://127.0.0.1:5500' ]
};

const usuarios = require('./src/routes/usuario.route');

const app = express()
    .use(express.json())
    .use(cors(corsOptions))
    .use('/usuarios/', usuarios);

app.listen(PORT, () => {
    console.log('Servidor em execução na porta ' + PORT);
});