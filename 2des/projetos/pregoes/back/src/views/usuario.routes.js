const express = require('express');
const router = express.Router();

const Usuario = require('../controllers/usuario.controller');

router.put("/update/", Usuario.update);
router.delete("/del/:id", Usuario.del);
router.post("/telefone/create", Usuario.createTel);
router.put("/telefone/update", Usuario.updateTel);
router.delete("/telefone/del/:id", Usuario.delTel);

module.exports = router;