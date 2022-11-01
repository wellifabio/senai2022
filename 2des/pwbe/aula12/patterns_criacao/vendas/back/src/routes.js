const express = require('express');
const router = express.Router();

const Venda = require("./controllers/VendaController");

router.get("/", Venda.prototype);
router.get("/read", Venda.listar);
router.post("/create", Venda.cadastrar);
router.delete("/del/:id", Venda.excluir);

module.exports = router;