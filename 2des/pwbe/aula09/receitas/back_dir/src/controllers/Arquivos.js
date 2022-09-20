const multer = require('multer');
const parser = multer({ dest: '../imgs/' });

const enviarArquivo = async (req, res)=>{
    parser.single('img')(req, res, err => {
        if (err)
            res.status(500).json({ error: 1, payload: err });
        else {
            const image = {};
            image.id = req.file.filename;
            image.url = `/imgs/${image.id}`;
            res.status(200).json({ error: 0, payload: { id: image.id, url: image.url } });
        }
    });
}

module.exports = {
    enviarArquivo
}