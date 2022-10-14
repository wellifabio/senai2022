require('dotenv').config(); //Habilita variáveis de Ambiente
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');

const Departamento = require('./src/routes/departamento.route');
const Produto = require('./src/routes/produto.route');
const Solicitacao = require('./src/routes/solicitacao.route');

//Iniciar a API
const app = express()
    .use(express.json())
    .use(cors())
    .use('/departamento',Departamento)
    .use('/produto',Produto)
    .use('/solicitacao',Solicitacao);

app.listen(PORT, () => {
    console.log('Servidor em execução na porta ' + PORT);
});