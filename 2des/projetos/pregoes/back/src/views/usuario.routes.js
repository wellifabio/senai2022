const express = require('express');
const router = express.Router();

const Usuario = require('../controllers/usuario.controller');

router.put("/update/", Usuario.update);
router.delete("/del/:id", Usuario.del);

module.exports = router;