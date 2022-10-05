const toReadAll = () => {
    return "select * from receitas order by id desc";
}

const toCreate = (body) => {
    return `insert into receitas values (default,'${body.tipo}','${body.nome}','${body.ingredientes}','${body.modoPreparo}','${body.foto}')`;
}

const toDelete = (body) => {
    return `delete from receitas where id = ${body.id}`;
}

module.exports = {
    toReadAll,
    toCreate,
    toDelete
}