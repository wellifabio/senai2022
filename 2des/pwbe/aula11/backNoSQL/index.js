const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');

//Importar as Rotas
const router = require('./src/routes/patrimonio.route');

//Conectar ao BD NoSQL
let url = 'mongodb+srv://patrimoniouser:D2vvuPl2ZHqOTnVb@cluster0.6tafxlw.mongodb.net/?retryWrites=true&w=majority';
let mongoDB = process.env.MONGODB_URI || url;
mongoose.connect(mongoDB);
mongoose.Promise = global.Promise;
let db = mongoose.connection;
db.on('error', console.error.bind(console, 'Erro na Ligação ao MongoDB'));

//Iniciar a API
const app = express();
app.use('/patrimonio', router);
app.use(express.json());
app.use(cors());

app.listen(3000, () => {
    console.log('Servidor em execução na porta' + 3000);
});