const express = require('express');
const router = express.Router();

const Comprador = require('../controllers/comprador.controller');
const { compradorJWT } = require('./middleware');

router.post("/create", compradorJWT, Comprador.create);
router.get("/read", compradorJWT, Comprador.readAll);
router.get("/read/:id", compradorJWT,Comprador.read);

module.exports = router;