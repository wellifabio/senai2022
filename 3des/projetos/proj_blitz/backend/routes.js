const express = require('express');

const route = express.Router();

const UsuarioController = require('./src/controller/UsuarioController');

route.post('/usuario', UsuarioController.create);
route.get('/usuario', UsuarioController.read);

module.exports = route;