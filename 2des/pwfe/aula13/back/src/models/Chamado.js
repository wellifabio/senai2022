//Modelo Básico
class Chamado {

    create(dados) {
        return `INSERT INTO chamados VALUES (default,'${dados.tipo}',${dados.severidade},'${dados.descricao}',curdate(),curtime(),'00:00:00','00:00:00','${dados.destino}')`;
    }

    readAll() {
        return "SELECT * FROM chamados";
    }

    update(dados) {
        return `UPDATE chamados SET tipo = '${dados.tipo}', severidade = ${dados.severidade}, descricao = '${dados.descricao}', data = '${dados.data}', hora = '${dados.hora}', hora_inicio = '${dados.hora_inicio}', hora_fim = '${dados.hora_fim}', destino = '${dados.destino}' WHERE id = ${dados.id}`;
    }

    del(id) {
        return `DELETE FROM chamados WHERE id = ${id}`;
    }
}


module.exports = {
    Chamado
}