const express = require('express');
const router = express.Router();

const Solicitacao = require("../controllers/solicitacao.controller");

router.post("/create", Solicitacao.create);
router.get("/read", Solicitacao.readAll);
router.get("/read/:mes", Solicitacao.readProdByMes);
router.get("/total", Solicitacao.readTotSolFum);

module.exports = router;