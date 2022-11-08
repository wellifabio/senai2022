const express = require('express');
const router = express.Router();

const Fornecedor = require('../controllers/fornecedor.controller');

router.post("/create", Fornecedor.create);
router.get("/read", Fornecedor.readAll);
router.get("/read/:id", Fornecedor.read);

module.exports = router;