const express = require('express');
const router = express.Router();

const Item = require("../controllers/ItemController");

router.get("/patrimonio/itens", Item.listarItens);
router.get("/patrimonio/itens/:ni", Item.listarItem);
router.post("/patrimonio/itens", Item.criarItens);
router.delete("/patrimonio/itens", Item.excluirItens);

module.exports = router;