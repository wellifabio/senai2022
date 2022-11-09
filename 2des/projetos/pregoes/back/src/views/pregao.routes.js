const express = require('express');
const router = express.Router();

const Pregao = require('../controllers/pregao.controller');

router.post("/create", Pregao.create);
router.get("/read", Pregao.readAll);
router.get("/read/:id", Pregao.read);
router.put("/update", Pregao.update);
router.delete("/del/:id", Pregao.del);

module.exports = router;