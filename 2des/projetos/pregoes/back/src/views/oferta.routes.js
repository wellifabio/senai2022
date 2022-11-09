const express = require('express');
const router = express.Router();

const Oferta = require('../controllers/oferta.controller');

router.get("/read", Oferta.readAll);
router.get("/read/view", Oferta.readView);
router.get("/read/:id", Oferta.read);

module.exports = router;