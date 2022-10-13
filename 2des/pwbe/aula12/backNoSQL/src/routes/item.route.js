const express = require('express');
const router = express.Router();

const itemController = require('../controllers/item.controller');

router.get('/', itemController.teste);
router.get('/read/', itemController.readAll);
router.get('/read/id/:id', itemController.readId);
router.get('/read/ni/:ni', itemController.readNi);
router.post('/create', itemController.create);
router.put('/update/id/:id', itemController.updateId);
router.put('/update/ni/:ni', itemController.updateNi);
router.delete('/del/id/:id', itemController.delId);
router.delete('/del/ni/:ni', itemController.delNi);

module.exports = router;