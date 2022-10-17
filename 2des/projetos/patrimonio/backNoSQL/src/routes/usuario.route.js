const express = require('express');
const router = express.Router();

const usuarioController = require('../controllers/usuario.controller');

router.post('/login', usuarioController.login);

module.exports = router;