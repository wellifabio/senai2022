const express = require('express');
const router = express.Router();

const Objeto = require('../controllers/objeto.controller');

router.post("/create", Objeto.create);
router.get("/read", Objeto.readAll);
router.get("/read/:id", Objeto.read);
router.get("/read/pregao/:id", Objeto.readPregao);
router.put("/update", Objeto.update);
router.delete("/del/:id", Objeto.del);

module.exports = router;