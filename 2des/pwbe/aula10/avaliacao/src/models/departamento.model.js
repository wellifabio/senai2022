const create = (model) => {
    return `INSERT INTO departamentos VALUES(${model.cod_depto},'${model.nome_depto}')`;
}

const del = (model) => {
    return `DELETE FROM departamentos WHERE cod_depto = ${model.cod_depto}`;
}

module.exports = {
    create,
    del
}