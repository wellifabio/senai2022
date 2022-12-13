const express = require('express');
const router = express.Router();

const Chamado = require("./controllers/ChamadoController");

router.post("/create", Chamado.cadastrar);
router.get("/read", Chamado.listar);
router.put("/update", Chamado.alterar);
router.delete("/delete/:id", Chamado.excluir);

module.exports = router;