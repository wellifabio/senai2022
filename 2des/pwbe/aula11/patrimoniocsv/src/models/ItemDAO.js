const fs = require('fs');

const abrir =  () => {
    let arquivo = '../bucket/itens.csv';
    return new Promise((resolve, reject) => {
        fs.readFile(arquivo, (err, data) /* callback */ => {
            err ? reject(err) : resolve(data);
        });
    });
}

const salvar = () => {

}

module.exports = {
    abrir,
    salvar
}