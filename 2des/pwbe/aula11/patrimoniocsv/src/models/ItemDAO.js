const fs = require('fs');
const arquivo = '../bucket/itens.csv';

const abrir = () => {
    return new Promise((resolve, reject) => {
        fs.readFile(arquivo, (err, data) /* callback */ => {
            err ? reject(err) : resolve(data);
        });
    });
}

const salvar = (dados) => {
    fs.writeFile(arquivo, dados, (erro) => {
        if (erro) {
            throw erro;
        }
        console.log("Arquivo salvo");
    });
}

module.exports = {
    abrir,
    salvar
}