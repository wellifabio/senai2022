const fs = require('fs');
const arquivo = '../bucket/itens.csv';

const abrir = () => {
    return new Promise((resolve, reject) => {
        fs.readFile(arquivo, 'utf8', (err, data) => {
            err ? reject(err) : resolve(data);
        });
    });
}

const salvar = (dados) => {
    return new Promise((resolve, reject) => {
        fs.writeFile(arquivo, dados, (err) => {
            err ? reject(err) : resolve(true);
        });
    });
}

module.exports = {
    abrir,
    salvar
}