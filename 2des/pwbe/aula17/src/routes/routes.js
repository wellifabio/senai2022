const express = require('express');
const router = express.Router();

const Middleware = require('../middleware/middleware');

const Usuario = require("../controllers/usuario");

router.post('/login', Usuario.login);
router.delete('/delete/:id', Middleware.validaAcesso ,Usuario.remover);

module.exports = router