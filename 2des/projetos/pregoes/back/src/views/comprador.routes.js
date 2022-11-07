const express = require('express');
const router = express.Router();

const Comprador = require('../controllers/comprador.controller');

router.get("/read", Comprador.listar);

module.exports = router;