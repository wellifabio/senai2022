const itens = [];

const toListObj = (dados) => {
    let vetor = dados.split("\r\n");
    let item = {};
    vetor.forEach(e => {
        item = {};
        item.ni = e.split(",")[0];
        item.aquisicao = e.split(",")[1];
        item.denominacao = e.split(",")[2];
        item.valor = e.split(",")[3];
        item.img = e.split(",")[4];
        itens.push(item);
    });
    itens.shift();
    itens.pop();
    return itens;
}

const toCSV = () => {
    let csv = 'ni,aquisicao,denominacao,valor,img\r\n';
    itens.forEach(e => {
        csv += e.ni + ',' + e.aquisicao + ',' + e.denominacao + ',' + e.valor + ',' + e.img + '\r\n';
    });
    return csv;
}

module.exports = {
    itens,
    toListObj,
    toCSV
}