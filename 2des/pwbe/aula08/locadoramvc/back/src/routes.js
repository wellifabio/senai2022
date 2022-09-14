const express = require('express');
const router = express.Router();

const Cliente = require("./controllers/ClienteController");
const Locacao = require("./controllers/LocacaoController");

router.get("/locadora/clientes", Cliente.listarClientes);
router.post("/locadora/clientes", Cliente.criarCliente);

router.get("/locadora/locacoes", Locacao.listarLocacoesAtivas);
router.put("/locadora/locacoes", Locacao.registrarDevolucao);

module.exports = router;