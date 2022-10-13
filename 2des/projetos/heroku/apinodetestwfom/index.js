require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');
const router = express.Router();

const getStatus = (req, res) => {
    res.json("API online").end();
}

router.get("/", getStatus);

//Iniciar a API
const app = express();
app.use(express.json());
app.use(cors());
app.use(router);

app.listen(PORT, () => {
    console.log('Servidor em execução na porta ' + PORT);
});