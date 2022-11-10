const express = require('express');
const router = express.Router();

const Objeto = require('../controllers/objeto.controller');
const { compradorJWT } = require('./middleware');

router.post("/create", compradorJWT, Objeto.create);
router.get("/read", Objeto.readAll);
router.get("/read/:id", Objeto.read);
router.get("/read/pregao/:id", Objeto.readPregao);
router.put("/update", compradorJWT, Objeto.update);
router.delete("/del/:id", compradorJWT, Objeto.del);

module.exports = router;