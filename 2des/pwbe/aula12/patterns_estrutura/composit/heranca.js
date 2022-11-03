//Exemplo 1 de Herança com Composição (Nome + Sobrenome)
class Pessoa {
    constructor(nome) {
        this.nome = nome;
    }
    toString() {
        return this.nome + ' ' + this.sobrenome;
    }
}

class Cliente extends Pessoa {
    constructor(nome, sobrenome) {
        super(nome);
        this.sobrenome = sobrenome;
    }
}

const cli = new Cliente("João", "Silva");
cli.toString();

//Exemplo 2 de Herança com composição de id
class Pessoa {

    constructor(nome, telefone, nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    toString() {
        return this.nome + ' ' + this.telefone + ' ' + this.nascimento;
    }
}

class Cliente extends Pessoa {

    constructor(id, nome, telefone, nascimento) {
        super(nome, telefone, nascimento);
        this.id = id;
    }

    toString() {
        return this.id + ' ' + super.toString();
    }
}

const cli2 = new Cliente(1, "Marcos", "19-99878-7897", "2000-12-15");
cli2.toString();

//Exemplo 3 de Herança
class Pessoa {

    nome = {}

    constructor(nome, sobrenome, telefone, nascimento) {
        this.nome.pri = nome;
        this.nome.sobre = sobrenome;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    toString() {
        return this.nome.pri + ' ' + this.nome.sobre + ' ' + this.telefone + ' ' + this.nascimento;
    }
}

class Cliente extends Pessoa {

    constructor(id, nome, sobrenome, telefone, nascimento) {
        super(nome, sobrenome, telefone, nascimento);
        this.id = id;
    }

    toString() {
        return this.id + ' ' + super.toString();
    }
}

class Funcionario extends Pessoa {

    constructor(matricula, nome, sobrenome, telefone, nascimento) {
        super(nome, sobrenome, telefone, nascimento);
        this.matricula = matricula;
    }

    toString() {
        return this.matricula + ' ' + super.toString();
    }
}


const cliente = new Cliente(1, "Ana","Silva","19-78987-8789","2000-01-25");
const funcionario = new Cliente(101, "Marcus","Solza","19-99999-8788","2000-03-22");
cliente.toString();
funcionario.toString();

