const express = require('express');
const router = express.Router();

const Comprador = require('../controllers/comprador.controller');

router.get("/read", Comprador.readAll);

module.exports = router;