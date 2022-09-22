const con = require('../dao/dbreceitas');
const multer = require('multer');
const upload = multer().single('foto')
const fs = require('fs');

const cadastrarReceita = async (req, res) => {
    upload(req, res, function (err) {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            let dados = {}
            dados.tipo = req.body.tipo;
            dados.nome = req.body.nome;
            dados.ingredientes = req.body.ingredientes;
            dados.modoPreparo = req.body.modo_preparo;
            let string = null;
            if (req.file != null){
                dados.foto = req.file.buffer.toString('base64');
                string = `insert into receitas values (default,'${dados.tipo}','${dados.nome}','${dados.ingredientes}','${dados.modoPreparo}','${dados.foto}')`;
            }else
                string = `insert into receitas values (default,'${dados.tipo}','${dados.nome}','${dados.ingredientes}','${dados.modoPreparo}',null)`;
            if (dados.tipo != null && dados.nome != null) {
                con.query(string, (err, result) => {
                    if (err == null) {
                        //res.status(201).json(dados).end();
                        res.redirect('http://127.0.0.1:5500/front_blob/receitas.html');
                    } else {
                        res.status(500).json(err).end();
                    }
                });
            } else {
                res.status(500).json({'erro':'parametros obrigatórios: nome e tipo'}).end();
            }
        }
    });
}

const listarReceitas = (req, res) => {
    let string = "select * from receitas order by id desc";
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(receita(result)).end();
        }
    });
}

function receita(dados){
    dados.forEach(d => {
        if(d.foto != null) d.foto = d.foto.toString('ascii');
    });
    return dados;
}

const excluirReceita = (req, res) => {
    let id = req.body.id;
    let string = `delete from receitas where id = ${id}`;
    con.query(string, (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
}

module.exports = {
    listarReceitas,
    cadastrarReceita,
    excluirReceita
}