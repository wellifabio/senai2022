const express = require('express');
const cors = require('cors');
const fs = require('fs');
const router = express.Router();
const arquivo = '../docs/bd/itens.csv';
const itens = [];

//Funções Model conversão de string x Objeto e busca
const toListObj = (dados) => {
    let vetor = dados.split("\r\n");
    let item = {};
    vetor.forEach(e => {
        item = {};
        item.ni = isNaN(e.split(",")[0]) ? e.split(",")[0] : parseInt(e.split(",")[0]);
        item.aquisicao = e.split(",")[1];
        item.denominacao = e.split(",")[2];
        item.valor = isNaN(e.split(",")[3]) ? e.split(",")[3] : parseFloat(e.split(",")[3]);
        item.img = e.split(",")[4];
        itens.push(item);
    });
    itens.shift();
    itens.pop();
    return itens;
}

const toCSV = () => {
    let csv = 'ni,aquisicao,denominacao,valor,img\r\n';
    itens.forEach(e => {
        csv += e.ni + ',' + e.aquisicao + ',' + e.denominacao + ',' + e.valor + ',' + e.img + '\r\n';
    });
    return csv;
}

const find = (ni) => {
    let indice = -1;
    for (i = 0; i < itens.length; i++)
        if (itens[i].ni == ni)
            indice = i;
    return indice;
}

//Funções DAO
const abrir = () => {
    fs.readFile(arquivo, 'utf8', (err, data) => {
        return err ? err : toListObj(data);
    });
}

const salvar = () => {
    fs.writeFile(arquivo, toCSV(), (err) => {
        return err ? err : true;
    });
}

//Funções Controllers CRUD
const criarItem = (req, res) => {
    if (find(req.body.ni) == -1){
        itens.push(req.body);
        res.status(201).json(req.body).end();
        salvar();
    }else{
        res.status(406).json(req.body).end();
    }
}

const listarItens = (req, res) => {
    res.json(itens).end();
}

const alterarItem = (req, res) => {
    let indice = find(req.body.ni);
    if (indice > -1) {
        itens[indice] = req.body;
        res.status(200).json(itens[indice]).end();
        salvar();
    } else
        res.status(404).end();
}

const excluirItem = (req, res) => {
    let indice = find(req.params.ni);
    if (indice > -1) {
        res.status(204).json(itens[indice]).end();
        itens.splice(indice, 1);
        salvar();
    } else
        res.status(404).end();
}

//Funções View (Rotas)
router.post("/patrimonio/itens", criarItem);
router.get("/patrimonio/itens", listarItens);
router.put("/patrimonio/itens", alterarItem);
router.delete("/patrimonio/itens/:ni", excluirItem);

abrir();
const app = express();
app.use(express.json());
app.use(cors());
app.use(router);

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});