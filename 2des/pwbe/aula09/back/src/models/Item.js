const toReadAll = () => {
    return "SELECT * FROM itens";
}
const toRead = (model) => {
    return `SELECT * FROM itens  WHERE ni=${model.ni}`;
}
const toCreate = (model) => {
    return `INSERT INTO itens VALUES (${model.ni},'${model.aquisicao}',${model.valor},'${model.img}')`;
}
const toDelete = (model) => {
    return `DELETE FROM itens WHERE ni=${model.ni}`;
}

module.exports = {
    toReadAll,
    toRead,
    toCreate,
    toDelete
}