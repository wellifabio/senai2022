const express = require('express');
const router = express.Router();

const Produto = require("../controllers/produto.controller");

router.post("/create", Produto.create);
router.get("/read", Produto.readAll);
router.get("/read/name", Produto.readName);

module.exports = router;