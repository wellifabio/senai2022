class Pregao{

    objetos = [];
    
    constructor(id, comprador, dataAbertura, dataEncerramento){
        this.id = id;
        this.comprador = comprador;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
    }

    addObjeto(objeto){
        this.objetos.push(objeto);
    }
}