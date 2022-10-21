const express = require('express');
const cors = require('cors');

const itens = require('./src/routes/itens');

const app = express();
app.use(express.json());
app.use(cors());
app.use(itens);

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});