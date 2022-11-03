class Leaf{
	
	constructor(price,name) {
		this.price = price;
		this.name = name;
	}

	showPrice() {
		console.log(this.name + " : " + this.price);
	}

}

class Composite{

     constructor(nome){
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
	
hd = new Leaf(450,"HDD");
cabinet = new Composite("Gabinete");
cabinet.addComponent(hd);