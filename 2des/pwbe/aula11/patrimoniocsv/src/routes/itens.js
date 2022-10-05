const express = require('express');
const router = express.Router();

const Item = require("../controllers/ItemController");

router.post("/patrimonio/itens", Item.criarItem);
router.get("/patrimonio/itens", Item.listarItens);

module.exports = router;