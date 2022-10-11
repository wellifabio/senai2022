const express = require('express');
const router = express.Router();

const patrimonioController = require('../controllers/patrimonio.controller');

router.get('/testar', patrimonioController.teste);
router.post('/create', patrimonioController.create);

module.exports = router;