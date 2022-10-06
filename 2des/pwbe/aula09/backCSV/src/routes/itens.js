const express = require('express');
const router = express.Router();

const Item = require("../controllers/ItemController");
Item.carregar();
router.post("/patrimonio/itens", Item.criarItem);
router.get("/patrimonio/itens", Item.listarItens);
router.put("/patrimonio/itens", Item.alterarItem);
router.delete("/patrimonio/itens/:ni", Item.excluirItem);

module.exports = router;