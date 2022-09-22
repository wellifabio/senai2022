const toCreate = (dados,file) =>{
    if (file != null){
        dados.foto = file.buffer.toString('base64');
        return `insert into receitas values (default,'${dados.tipo}','${dados.nome}','${dados.ingredientes}','${dados.modoPreparo}','${dados.foto}')`;
    }else
        return `insert into receitas values (default,'${dados.tipo}','${dados.nome}','${dados.ingredientes}','${dados.modoPreparo}',null)`;
}

const toReadAll = ()=>{
    return "select * from receitas order by id desc";
}

const toDel = (dados)=>{
    return `delete from receitas where id = ${dados.id}`
}

const toAscii = (dados)=>{
    dados.forEach(d => {
        if(d.foto != null) d.foto = d.foto.toString('ascii');
    });
    return dados;
}

module.exports = {
    toCreate,
    toReadAll,
    toDel,
    toAscii
}