class Pedido {
    Pizzas = []

    constructor(data, hora){
        this.data = data
        this.hora = hora
    }

    subTotal(){
        this.Pizzas.forEach(pizza =>{
            if(pizza.nome == undefined) {
                console.log(`Pizza meia ${pizza.nome1} e ${pizza.nome2}, borda : ${pizza.borda.nome}, valor : ${pizza.valor}`)
            } else {
                console.log(`${pizza.nome}, borda : ${pizza.borda.nome}, valor : ${pizza.valor}`)
            }
        })
    }

    total(){
        this.valTotal = 0;
        this.Pizzas.forEach(pizza =>{
            this.valTotal += pizza.valor
        })
        console.log(this.valTotal)
    }

    addPizza(pizza){
        this.Pizzas.push(pizza)
    }

}

class Pizza {

    constructor(Pizza, Borda){
        if(Borda == undefined){
            this.borda = { "nome": "sem borda"}
            this.valor = 0
        } else {
            this.borda = Borda
            this.valor = this.borda.valor
        }

        this.nome = Pizza.nome
        this.valor += Pizza.valor
        
    }

    show(){
        console.log(this.pizza)
    }
}

class Pizza2 {
    constructor(Pizza1, Pizza2, Borda){
        if(Borda == undefined){
            this.borda = { "nome": "sem borda"}
            this.valor = 0
        } else {
            this.borda = Borda
            this.valor = this.borda.valor
        }

        this.nome1 = Pizza1.nome
        this.nome2 = Pizza2.nome
        this.valor += Pizza1.valor + Pizza2.valor
    }
}

const Pizzas = [
    {
        "nome": "pizza de peppperoni",
        "valor": 38.90
    },
    {
        "nome": "pizza de marquerida",
        "valor": 35.90
    },
    {
        "nome": "pizza de frango c/ catupiry",
        "valor": 50.00
    },
    {
        "nome": "pizza de lombo canadense",
        "valor": 28.90
    },
    {
        "nome": "pizza de calabresa",
        "valor": 28.90
    }
]

const bordaPizza = [
    {
        "nome" : "borda de catupiry",
        "valor" : 5.00
    },
    {
        "nome" : "borda chadder",
        "valor" : 5.00
    }
]

const date = new Date()
pedido = new Pedido(date.toLocaleDateString(), date.toLocaleTimeString(), 200.00)
pedido.addPizza(new Pizza(Pizzas[0], bordaPizza[0]))
pedido.addPizza(new Pizza(Pizzas[1]))
pedido.addPizza(new Pizza2(Pizzas[2],Pizzas[3], bordaPizza[1]))
pedido.addPizza(new Pizza(Pizzas[4]))

//pedido Natã
pedidoNata = new Pedido(date.toLocaleDateString(), date.toLocaleTimeString(), 100.00)
pedidoNata.addPizza(new Pizza2(Pizzas[0], Pizzas[3]))
pedidoNata.addPizza(new Pizza(Pizzas[4], bordaPizza[1]))

//OBS: quando a pizza for meio a meio o preço é a soma dos dois sabores