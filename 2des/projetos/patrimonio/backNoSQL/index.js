require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');

//Conectar ao MongoDB (SGBD NoSQL)
let url = 'mongodb+srv://<user>:<senha>@cluster0.6tafxlw.mongodb.net/?retryWrites=true&w=majority';
let mongoDB = process.env.MONGODB_URI || url;
mongoose.connect(mongoDB,{useNewUrlParser: true });
mongoose.Promise = global.Promise;
let db = mongoose.connection;
db.on('error', console.error.bind(console, 'Erro na Ligação ao MongoDB'));

//Importar as Rotas
const itens = require('./src/routes/item.route');

//Iniciar a API
const app = express();
app.use(express.json());
app.use(cors());
app.use('/', itens);

app.listen(PORT, () => {
    console.log('Servidor em execução na porta' + PORT);
});