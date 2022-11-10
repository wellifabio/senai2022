const express = require('express');
const router = express.Router();

const Pregao = require('../controllers/pregao.controller');
const { compradorJWT } = require('./middleware');

router.post("/create", compradorJWT, Pregao.create);
router.get("/read", Pregao.readAll);
router.get("/readon", Pregao.readAtivos);
router.get("/read/:id", Pregao.read);
router.put("/update", compradorJWT, Pregao.update);
router.delete("/del/:id", compradorJWT, Pregao.del);

module.exports = router;