require('dotenv').config();
const PORT = process.env.PORT || 2000
const express = require('express');
const cors = require('cors');
const router = express.Router();

//Pattern prototype
var users = [
    {
        "id": 1,
        "name": "Roberto",
        "password": "12345678"
    },
    {
        "id": 2,
        "name": "Marcela",
        "password": "12345678"
    },
    {
        "id": 3,
        "name": "Jair",
        "password": "12345678"
    }
];

//Pattern facade
const getIndex = (id) => {
    let index = -1;
    for (i = 0; i < users.length; i++)
        if (users[i].id == id) {
            index = i;
            break;
        }
    return index;
}

const test = (req, res) => {
    res.json({ status: "API online" }).end();
}

const create = (req, res) => {
    if (getIndex(req.body.id) == -1) {
        users.push(req.body);
        res.status(201).end();
    } else {
        res.status(406).end();
    }
}

const readAll = (req, res) => {
    res.json(users).end();
}

const update = (req, res) => {
    let index = getIndex(req.body.id);
    if (index != -1) {
        users[index] = req.body;
        res.status(202).json(users[index]).end();
    } else
        res.status(404).end();
}

const del = (req, res) => {
    let index = getIndex(req.params.id);
    if (index != -1) {
        users.splice(index, 1);
        res.status(204).end();
    } else {
        res.status(404).end();
    }
}

router.get("/", test);
router.post("/create", create);
router.get("/read", readAll);
router.put("/update", update);
router.delete("/delete/:id", del);

//Iniciar a API
const app = express();
app.use(express.json());
app.use(cors());
app.use(router);

app.listen(PORT, () => {
    console.log('Servidor em execução na porta ' + PORT);
});