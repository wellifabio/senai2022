const express = require('express');

const routes = express.Router();

const Avaliacao = require('./src/controller/Avaliacao');
const Salgado = require('./src/controller/Salgado');
const Usuario = require('./src/controller/Usuario');

routes.get('/avaliacoes/:id_salgado', Avaliacao.listar);
routes.post('/avaliacao', Avaliacao.cadastrar);

routes.get('/salgados', Salgado.listar);
routes.post('/salgado', Salgado.cadastrar);

routes.post('/login', Usuario.login);

module.exports = routes;