const express = require('express');
const router = express.Router();

const Item = require("../controllers/ItemController");

router.post("/patrimonio/itens", Item.criarItem);
router.get("/patrimonio/itens", Item.listarItens);
router.get("/patrimonio/itens/:ni", Item.listarItem);
router.put("/patrimonio/itens", Item.alterarItem);
router.delete("/patrimonio/itens/:ni", Item.excluirItem);

module.exports = router;