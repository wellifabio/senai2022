const alunos = (lista)=>{
    let duplicados = [];
    //Encontra duplicados transfere para uma lista específica e remove da lista original
    for (let i = 0; i < lista.length; i++) {
        if(i > 0){
            if (lista[i].id_aluno === lista[i-1].id_aluno) {
                duplicados.push(lista[i]); //acrescenta na lista de duplicados
                lista.splice(i, 1); //remove da lista original
            }
        }
        //Transforma o telefone em uma lista
        let tels = [];
        tels.push(lista[i].telefone)
        lista[i].telefone = tels;
    }

    //Percorre a lista original
    lista.forEach(e => {
        duplicados.forEach(d => {
            if(d.id_aluno === e.id_aluno) 
                e.telefone.push(d.telefone);
        });
    });

    return lista;
}

module.exports = { 
    alunos 
}