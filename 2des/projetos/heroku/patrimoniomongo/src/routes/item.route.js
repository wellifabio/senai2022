const express = require('express');
const router = express.Router();

const itemController = require('../controllers/item.controller');

router.get('/', itemController.teste);
router.get('/read/:id', itemController.read);
router.get('/read/', itemController.readAll);
router.post('/create', itemController.create);

module.exports = router;