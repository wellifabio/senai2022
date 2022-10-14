const create = (model) => {
    return `call solicita_um_item(${model.n_sol},${model.n_depto},${model.n_func},${model.n_prod},${model.qtd},${model.total})`;
}

const readAll = () => {
    return `SELECT * FROM vw_solicitacoes`;
}

const readProdutos = (mes) => {
    return `SELECT * FROM vw_solicitacoes WHERE data_sol LIKE '_____${mes}___'`;
}

const readTotSolFum = () => {
    return `select Nome_Func, count(valor) as total_sol from vw_solicitacoes group by nome_func`;
}

module.exports = {
    create,
    readAll,
    readProdutos,
    readTotSolFum
}