const express = require('express');
const router = express.Router();

const Fornecedor = require('../controllers/fornecedor.controller');
const { fornecedorJWT } = require('./middleware');

router.post("/create", Fornecedor.create);
router.get("/read", Fornecedor.readAll);
router.get("/read/:id", fornecedorJWT, Fornecedor.read);

module.exports = router;