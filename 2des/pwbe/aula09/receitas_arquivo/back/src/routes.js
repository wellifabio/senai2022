const express = require('express');
const router = express.Router();

const Receita = require("./controllers/ReceitasController");
const Arquivo = require("./controllers/ArquivosController");

router.get("/receitas", Receita.listarReceitas);
router.post("/receitas", Receita.cadastrarReceita);
router.delete("/receitas", Receita.excluirReceita);
router.post("/arquivos", Arquivo.enviarArquivo);

module.exports = router;