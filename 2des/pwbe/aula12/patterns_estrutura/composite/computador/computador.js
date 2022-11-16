class Componente {

	constructor(preco, nome) {
		this.preco = preco;
		this.nome = nome;
	}

	showPreco() {
		console.log(this.nome + " : " + this.preco);
	}
}

class Composicao {

	constructor(nome) {
		this.nome = nome
	}

	componentes = [];

	addComponent(com) {
		this.componentes.push(com);
	}

	showPreco() {
		this.componentes.forEach(e => {
			console.log(e)
		});
	}
}

hd = new Componente(450, "HDD");
mouse = new Componente(14, "Mouse");
monitor = new Componente(350, "Monitor");
ram = new Componente(275, "RAM");
cpu = new Componente(480, "CPU");

perif = new Composicao("Perifericos");
gabinete = new Composicao("Gabinete");
mb = new Composicao("Placa Mãe");
computador = new Composicao("Computador");

perif.addComponent(mouse);
perif.addComponent(monitor);
mb.addComponent(cpu);
mb.addComponent(ram);
gabinete.addComponent(mb);
gabinete.addComponent(hd);
computador.addComponent(perif);
computador.addComponent(gabinete);

computador.showPreco();
JSON.stringify(computador);

const comp = {
	"componentes": [
		{
			"componentes": [
				{ "preco": 14, "nome": "Mouse" },
				{ "preco": 350, "nome": "Monitor" }
			],
			"nome": "Perifericos"
		},
		{
			"componentes":
				[
					{
						"componentes": [
							{ "preco": 480, "nome": "CPU" },
							{ "preco": 275, "nome": "RAM" }
						], "nome": "Placa Mãe"
					},
					{
						"preco": 450,
						"nome": "HDD"
					}
				],
			"nome": "Gabinete"
		}],
	"nome": "Computador"
}