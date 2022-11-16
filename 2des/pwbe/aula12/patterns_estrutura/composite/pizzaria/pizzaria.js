class Borda {
    constructor(nome, preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class Sabor {
    constructor(nome, ingredientes, preco) {
        this.nome = nome;
        this.ingredients = ingredientes;
        this.preco = preco;
    }
}

class Pizza {

    sabores = [];

    constructor(sabor, borda) {
        this.sabores.push(sabor);
        if (borda != undefined)
            this.borda = borda;
    }

    addSabor(sabor) {
        this.sabores.push(sabor);
    }

    //Quando a pizza for meio a meio o preço é o da de maior valor + a borda.
    getPreco() {
        let maiorPreco = 0;
        this.sabores.forEach(e => {
            if (maiorPreco < e.preco)
                maiorPreco = e.preco;
        })
        let bordaPreco = 0;
        if (this.borda != undefined)
            bordaPreco = this.borda.preco;
        return maiorPreco + bordaPreco;
    }
}

class Item {
    constructor(pizza, quantidade) {
        this.pizza = pizza;
        this.quantidade = quantidade;
    }

    getSubTotal() {
        return this.pizza.getPreco() * this.quantidade;
    }
}

class Pedido {

    itens = [];

    constructor(data, hora) {
        this.data = data;
        this.hora = hora;
    }

    addItem(item) {
        this.itens.push(item);
    }

    getTotal() {
        let total = 0;
        this.itens.forEach(e => {
            total += e.getSubTotal();
        })
        return total;
    }
}

const bordas = [];
bordas.push(new Borda("Catupiry", 8));
bordas.push(new Borda("Cheddar", 12));
const sabores = [];
sabores.push(new Sabor("Pepperoni", "Fatias de salame pepperoni, queijo, tomate e orégano", 49.9));
sabores.push(new Sabor("Marguerita", "Fatias de tomate, queijo e mangericão", 39.9));
sabores.push(new Sabor("Frango c/ Catupiry", "Frango desfiado, queijo catupiry e azeitonas", 34.9));
sabores.push(new Sabor("Lombo Canadense", "Fatias de lombo canadense, queijo catupiry e mussarela", 31.9));
sabores.push(new Sabor("Calabreza", "Fatias de linguíça calabresa, fatias de cebola e oregano", 29.9));
const pizzas = [];
pizzas.push(new Pizza(sabores[0], bordas[0]));
pizzas.push(new Pizza(sabores[1]));
pizzas.push(new Pizza(sabores[2], bordas[1]));
pizzas[2].addSabor(sabores[3]);
pizzas.push(new Pizza(sabores[4]));
const itens = [];
itens.push(new Item(pizzas[0], 1));
itens.push(new Item(pizzas[1], 1));
itens.push(new Item(pizzas[2], 1));
itens.push(new Item(pizzas[3], 2));
const pedido = new Pedido(new Date(), "10:30");
pedido.addItem(itens[0]);
pedido.addItem(itens[1]);
pedido.addItem(itens[2]);
pedido.addItem(itens[3]);

JSON.stringify(pedido);

pedido.getTotal();
pedido.itens[2].getSubTotal();
pedido.itens[2].pizza.getPreco();

//Exemplo no formato de objeto
const objetoPedido = {
    "itens": [
        {
            "pizza": {
                "sabores": [
                    {
                        "nome": "Pepperoni",
                        "ingredients": "Fatias de salame pepperoni, queijo, tomate e orégano",
                        "preco": 49.9
                    }
                ],
                "borda": {
                    "nome": "Catupiry",
                    "preco": 8
                }
            },
            "quantidade": 1
        },
        {
            "pizza": {
                "sabores": [
                    {
                        "nome": "Marguerita",
                        "ingredients": "Fatias de tomate, queijo e mangericão",
                        "preco": 39.9
                    }
                ]
            },
            "quantidade": 1
        },
        {
            "pizza": {
                "sabores": [
                    {
                        "nome": "Frango c/ Catupiry",
                        "ingredients": "Frango desfiado, queijo catupiry e azeitonas",
                        "preco": 34.9
                    },
                    {
                        "nome": "Lombo Canadense",
                        "ingredients": "Fatias de lombo canadense, queijo catupiry e mussarela",
                        "preco": 31.9
                    }
                ],
                "borda": {
                    "nome": "Cheddar",
                    "preco": 12
                }
            }, "quantidade": 1
        },
        {
            "pizza": {
                "sabores": [
                    {
                        "nome": "Calabreza",
                        "ingredients": "Fatias de linguíça calabresa, fatias de cebola e oregano",
                        "preco": 29.9
                    }
                ]
            }, "quantidade": 2
        }
    ],
    "data": "2022-11-04T13:34:49.945Z",
    "hora": "10:30"
}