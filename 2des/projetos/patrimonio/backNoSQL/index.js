require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');

//Conectar ao MongoDB (SGBD NoSQL)
let url = 'mongodb+srv://';
let mongoDB = process.env.MONGODB_URI || url;
mongoose.connect(mongoDB, { useNewUrlParser: true });
mongoose.Promise = global.Promise;
let db = mongoose.connection;
db.on('error', console.error.bind(console, 'Erro na Ligação ao MongoDB'));

//Importar as Rotas
const itens = require('./src/routes/item.route');
const usuario = require('./src/routes/usuario.route');

//Iniciar a API
const app = express()
    .use(express.json())
    .use(cors())
    .use('/', itens)
    .use('/', usuario);

app.listen(PORT, () => {
    console.log('Servidor em execução na porta' + PORT);
});