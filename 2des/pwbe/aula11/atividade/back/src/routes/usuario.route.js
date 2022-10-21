const express = require('express');
const router = express.Router();

const Usuario = require("../controllers/usuario.controller");

router.get("/", (req, res) => {
    res.json("Online").end();
});

router.post("/create",Usuario.create);
router.get("/read",Usuario.readAll);
router.get("/read/:login",Usuario.readLogin);
router.put("/update",Usuario.update);
router.delete("/del/:login",Usuario.del);

module.exports = router;