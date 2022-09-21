const con = require('../dao/dbreceitas');
const multer = require('multer');
const fs = require('fs');

// Configuração de armazenamento temporario
const storage = multer.diskStorage({
    destination: function (req, file, cb) {
        cb(null, '../repositorio/')
    },
    filename: function (req, file, cb) {
        cb(null, 'temp.png')
    }
});
const parser = multer({ storage });

const paraBase64 = (fileName) => {
    var bitmap = fs.readFileSync('../repositorio/' + fileName + '');
    return new Buffer(bitmap).toString('base64');
}

function deBase64(base64str, fileName) {
    var bitmap = new Buffer(base64str, 'base64');
    fs.writeFileSync('../repositorio/' + fileName + '', bitmap, 'binary', function (err) {
        if (err) console.log('Conversao com erro');
    });
}

const cadastrarReceita = async (req, res) => {
    parser.single('foto')(req, res, err => {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            let dados = {}
            dados.tipo = req.body.tipo;
            dados.nome = req.body.nome;
            dados.ingredientes = req.body.ingredientes;
            dados.modoPreparo = req.body.modo_preparo;
            dados.foto = req.file != null ? paraBase64(req.file.filename) : '';
            let string = `insert into receitas values (default,'${dados.tipo}','${dados.nome}','${dados.ingredientes}','${dados.modoPreparo}','${dados.foto}')`;
            con.query(string, (err, result) => {
                if (err == null) {
                    res.status(201).json(dados).end();
                } else {
                    res.status(400).json(err).end();
                }
            });
        }
    });
}

const listarReceitas = (req, res) => {
    let string = "select * from receitas order by id desc";
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
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