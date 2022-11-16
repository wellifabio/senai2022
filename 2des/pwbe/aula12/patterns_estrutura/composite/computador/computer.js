class Leaf {

	constructor(price, name) {
		this.price = price;
		this.name = name;
	}

	showPrice() {
		console.log(this.name + " : " + this.price);
	}
}

class Composite {

	constructor(nome) {
		this.name = nome
	}

	components = [];

	addComponent(com) {
		this.components.push(com);
	}

	showPrice() {
		this.components.forEach(element => {
			console.log(element)
		});
	}
}

hd = new Leaf(450, "HDD");
mouse = new Leaf(14, "Mouse");
monitor = new Leaf(350, "Monitor");
ram = new Leaf(275, "RAM");
cpu = new Leaf(480, "CPU");

ph = new Composite("Perifericos");
cabinet = new Composite("Gabinete");
mb = new Composite("Placa Mãe");
computer = new Composite("Computador");

ph.addComponent(mouse);
ph.addComponent(monitor);
mb.addComponent(cpu);
mb.addComponent(ram);
cabinet.addComponent(mb);
cabinet.addComponent(hd);
computer.addComponent(ph);
computer.addComponent(cabinet);

computer.showPrice();
JSON.stringify(computer);

const comp = {
	"components": [
		{
			"components": [
				{ "price": 14, "name": "Mouse" },
				{ "price": 350, "name": "Monitor" }
			],
			"name": "Perifericos"
		},
		{
			"components":
				[
					{
						"components": [
							{ "price": 480, "name": "CPU" },
							{ "price": 275, "name": "RAM" }
						], "name": "Placa Mãe"
					},
					{
						"price": 450,
						"name": "HDD"
					}
				],
			"name": "Gabinete"
		}],
	"name": "Computador"
}