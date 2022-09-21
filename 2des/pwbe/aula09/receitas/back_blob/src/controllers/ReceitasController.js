const con = require('../dao/dbreceitas');

const listarReceitas = (req, res) => {
    let string = "select * from receitas order by id desc";
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(result).end();
        }
    });
}

const cadastrarReceita = (req, res) => {
    console.log(req.body)
    res.json(req.body).end()
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