package client;

import domain.Component;
import domain.Composite;
import domain.Leaf;

public class CompositeTest {
	
	public static void main(String[] args) {
		
		Component hd = new Leaf(450,"HDD");
		Component mouse = new Leaf(14,"Mouse");
		Component monitor = new Leaf(350,"Monitor");
		Component ram = new Leaf(275,"RAM");
		Component cpu = new Leaf(480,"CPU");
		
		Composite ph = new Composite("Perifericos");
		Composite cabinet = new Composite("Gabinete");
		Composite mb = new Composite("Placa Mãe");
		Composite computer = new Composite("Computador");
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		mb.addComponent(cpu);
		mb.addComponent(ram);
		cabinet.addComponent(mb);
		cabinet.addComponent(hd);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
	}

}
