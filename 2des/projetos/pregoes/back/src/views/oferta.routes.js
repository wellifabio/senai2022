const express = require('express');
const router = express.Router();

const Oferta = require('../controllers/oferta.controller');
const { fornecedorJWT } = require('./middleware');

router.post("/create", fornecedorJWT, Oferta.create);
router.get("/read", Oferta.readAll);
router.get("/read/view", Oferta.readView);
router.get("/read/fornecedor/:id", Oferta.readFornecedor);
router.get("/read/objeto/:id", Oferta.readObjeto);
router.get("/read/:id", Oferta.read);
router.put("/update", fornecedorJWT, Oferta.update);
router.delete("/del/:id", fornecedorJWT, Oferta.del);

module.exports = router;