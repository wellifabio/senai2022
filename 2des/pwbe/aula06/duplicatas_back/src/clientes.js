const clientes = (lista)=>{
    //Para cada elemento da lista removemos os campos tipo e telefone e criamos uma sublista telefones
    lista.forEach(e => {
        e.telefones = [];
        let tel = {};
        tel.tipo = e.tipo;
        tel.numero = e.telefone;
        e.telefones.push(tel);
        delete e.tipo;
        delete e.telefone;
    });

    //Criar uma nova lista sem os dados duplicados (Comparando o proximo item com o aterior)
    let liAux = []; //Lista auxiliar
    let lip = 0 //Ultimo indice liAux
    liAux.push(lista[lip]); //Acrescente o primeiro item da lista na liAux
    for(i = 1; i < lista.length; i++) {
        if(lista[i].cod_cli == lista[i-1].cod_cli){//Se o próximo for igual ao anterior
            let tel = {};//Novo objeto telefone
            tel.tipo = lista[i].telefones[0].tipo;
            tel.numero = lista[i].telefones[0].numero;
            liAux[lip].telefones.push(tel);//Acrescento somente o novo objeto telefone
        }else{//Senão acrescenta o novo item na lista e incrementa o indice
            liAux.push(lista[i]);
            lip++;
        }
    }
    return liAux;//Retornamos a nova lista sem os duplicados e com os objetos telefones
}

module.exports = {
    clientes
}