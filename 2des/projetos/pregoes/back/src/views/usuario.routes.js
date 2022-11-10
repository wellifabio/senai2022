const express = require('express');
const router = express.Router();

const Usuario = require('../controllers/usuario.controller');
const { compradorJWT } = require('./middleware');

router.post("/login", Usuario.login);
router.put("/update", compradorJWT, Usuario.update);
router.delete("/del/:id", compradorJWT, Usuario.del);
router.post("/telefone/create", Usuario.createTel);
router.put("/telefone/update", Usuario.updateTel);
router.delete("/telefone/del/:id", Usuario.delTel);

module.exports = router;