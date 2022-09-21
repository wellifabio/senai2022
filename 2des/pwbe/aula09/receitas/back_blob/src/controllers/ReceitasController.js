const con = require('../dao/dbreceitas');
const multer = require('multer');
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

const cadastrarReceita = async (req, res) => {
    parser.single('foto')(req, res, err => {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            let data = {};
            data.arquivo = req.file.filename;
            res.status(200).json(data).end();
        }
    });
    /*
    let tipo = req.body.tipo;
    let nome = req.body.nome;
    let ingredientes = req.body.ingredientes;
    let modoPreparo = req.body.modoPreparo;
    let foto = req.body.foto;
    let string = `insert into receitas values (default,'${tipo}','${nome}','${ingredientes}','${modoPreparo}','${foto}')`;
    con.query(string, (err, result) => {
        if (err == null) {
            res.status(201).end();
        } else {
            res.status(400).json(err).end();
        }
    });
    */
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