require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');

//Importar as Rotas
const usuario = require('./src/views/usuario.routes');
const comprador = require('./src/views/comprador.routes');
const fornecedor = require('./src/views/fornecedor.routes');
const oferta = require('./src/views/oferta.routes');
const objeto = require('./src/views/objeto.routes');
const pregao = require('./src/views/pregao.routes');

//Iniciar a API
const app = express()
    .use(express.json())
    .use(cors())
    .use('/usuarios', usuario)
    .use('/compradores', comprador)
    .use('/fornecedores', fornecedor)
    .use('/ofertas', oferta)
    .use('/objetos', objeto)
    .use('/pregoes', pregao);

app.listen(PORT, () => {
    console.log('API em execução na porta ' + PORT);
});