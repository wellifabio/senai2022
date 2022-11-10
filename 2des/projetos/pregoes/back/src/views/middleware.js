// Pattern Facade (Fachada intermediario fazendo validações e segurança)
// Autenticação JSON Web Token (JWT)
const jwt = require('jsonwebtoken');

const geraJWT = (usuario) => {
    const id = usuario.usuario_id;
    const tipo = usuario.tipo;
    let token = null;
    if (tipo == 0) {
        token = jwt.sign({ id }, process.env.SECRET_COMP || "comp", {
            expiresIn: 600 // milisegundos -> expira e 10min
        });
    } else {
        token = jwt.sign({ id }, process.env.SECRET_FORN || "forn", {
            expiresIn: 600 
        });
    }
    return { id: id, tipo: tipo, token: token }
}

function compradorJWT(req, res, next) {
    const token = req.headers['token-comp'];
    if (!token) return res.status(401).json({ auth: false, message: 'Token não fornecido.' });

    jwt.verify(token, process.env.SECRET_COMP || "comp", function (err, decoded) {
        if (err) return res.status(500).json({ auth: false, message: 'Falha ao aotenticar o token.' });
        req.usuario_id = decoded.id;
        next();
    });
}

function fornecedorJWT(req, res, next) {
    const token = req.headers['token-forn'];
    if (!token) return res.status(401).json({ auth: false, message: 'Token não fornecido.' });

    jwt.verify(token, process.env.SECRET_FORN || "forn", function (err, decoded) {
        if (err) return res.status(500).json({ auth: false, message: 'Falha ao aotenticar o token.' });
        req.usuario_id = decoded.id;
        next();
    });
}

module.exports = {
    geraJWT,
    compradorJWT,
    fornecedorJWT
}