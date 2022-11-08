const express = require('express');
const router = express.Router();

const Comprador = require('../controllers/comprador.controller');

router.post("/create", Comprador.create);
router.get("/read", Comprador.readAll);
router.get("/read/:id", Comprador.read);

module.exports = router;