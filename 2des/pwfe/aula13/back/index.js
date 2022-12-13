require('dotenv').config();
const PORT = process.env.PORT || 3000
const express = require('express');
const cors = require('cors');

const routes = require('./src/routes.js');

const app = express();
app.use(express.json());
app.use(cors());
app.use(routes);

app.listen(PORT, () => {
    console.log("Respondendo na porta " + PORT);
});