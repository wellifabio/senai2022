const multer = require('multer');

// Configuração de armazenamento
const storage = multer.diskStorage({
    //Diretório de destino
    destination: function (req, file, cb) {
        cb(null, '../repositorio/')
    },
    //Nome do arquivo
    filename: function (req, file, cb) {
        cb(null, `${file.originalname}`)
    }
});
// Passa as configurações para gravar o arquivo
const parser = multer({ storage });
// Grava o arquivo no diretório de destino assincronamente ao receber a requisição
const enviarArquivo = async (req, res)=>{
    parser.single('img')(req, res, err => {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            res.status(200).json(req.file.filename).end();
        }
    });
}

module.exports = {
    enviarArquivo
}