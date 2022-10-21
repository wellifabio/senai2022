const create = (dados) => {
    return `insert into usuarios values ('${dados.login}','${dados.nome}','${dados.nascimento}','${dados.telefone}','${dados.avatar}')`;
}

const read = (login) => {
    return `select * from usuarios where login = '${login}'`;
}

const readAll = () => {
    return "select * from usuarios";
}

const update = (dados) => {
    return `update usuarios set nome = '${dados.nome}', nascimento = '${dados.nascimento}', telefone = '${dados.telefone}', avatar = '${dados.avatar}' where login ='${dados.login}'`;
}

const del = (login) => {
    return `delete from usuarios where login = '${login}'`
}

const blobToAscii = (dados) => {
    dados.forEach(e => {
        if (e.avatar != null) e.avatar = e.avatar.toString('ascii');
    });
    return dados;
}

module.exports = {
    create,
    readAll,
    read,
    update,
    del,
    blobToAscii
}