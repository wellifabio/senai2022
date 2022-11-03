// Composit e Prototype
//Exemplo 1
const pessoa = {
    nome: {
        pri: "Marcos",
        sobrenome: "Souza"
    },
    endereco: {
        cep: "13914-552",
        numero: 2925,
        complemento: "BL19 AP44"
    }
}

//Exemplo 2
const nome = {
    pri: "Marcos",
    sobrenome: "Souza"
}

const endereco = {
    cep: "13914-552",
    numero: 2925,
    complemento: "BL19 AP44"
}

const pessoa2 = {
    nome: nome,
    endereco: endereco
}

//Exemplo 3

const telefones = [
    {
        tipo: "celular",
        numero: "19-44444-7777"
    },
    {
        tipo: "fixo",
        numero: "19-36587-6587"
    },
]

const pessoa3 = {
    nome: nome,
    endereco: endereco,
    telefones: telefones
}

//Exemplo 4
const pessoa4 = {
    nome: {
        pri: "Marcos",
        sobrenome: "Souza"
    },
    endereco: {
        cep: "13914-552",
        numero: 2925,
        complemento: "BL19 AP44"
    },
    telefones : [
        {
            tipo: "celular",
            numero: "19-44444-7777"
        },
        {
            tipo: "fixo",
            numero: "19-36587-6587"
        },
    ]
}
