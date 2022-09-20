const express = require('express');
const router = express.Router();

const Receita = require("./controllers/ReceitasController");

router.get("/receitas", Receita.listarReceitas);
router.post("/receitas", Receita.criarReceita);

module.exports = router;