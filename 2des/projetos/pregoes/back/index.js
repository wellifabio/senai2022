require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');

//Importar as Rotas
const comprador = require('./src/views/comprador.routes');
const fornecedor = require('./src/views/fornecedor.routes');

//Iniciar a API
const app = express()
    .use(express.json())
    .use(cors())
    .use('/compradores', comprador)
    .use('/fornecedores', fornecedor);

app.listen(PORT, () => {
    console.log('API em execução na porta ' + PORT);
});