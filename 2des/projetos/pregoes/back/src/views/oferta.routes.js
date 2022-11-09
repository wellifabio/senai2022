const express = require('express');
const router = express.Router();

const Oferta = require('../controllers/oferta.controller');

router.post("/create", Oferta.create);
router.get("/read", Oferta.readAll);
router.get("/read/view", Oferta.readView);
router.get("/read/fornecedor/:id", Oferta.readFornecedor);
router.get("/read/objeto/:id", Oferta.readObjeto);
router.get("/read/:id", Oferta.read);
router.put("/update", Oferta.update);
router.delete("/del/:id", Oferta.del);

module.exports = router;