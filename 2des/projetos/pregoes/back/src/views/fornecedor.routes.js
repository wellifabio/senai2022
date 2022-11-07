const express = require('express');
const router = express.Router();

const Fornecedor = require('../controllers/fornecedor.controller');

router.get("/read", Fornecedor.listar);

module.exports = router;