package client;

/*
 * Exemplo do Design Pattern de Criação Prototype
 * https://www.youtube.com/watch?v=nZ76x13Nm8Q
 * */

import domain.Livraria;

public class Cliente {

	private static Livraria livraria1;
	private static Livraria livraria2;
	
	public static void main(String[] args) throws CloneNotSupportedException {

		livraria1 = new Livraria();
		livraria1.setNomeLivraria("Saraiva");
		livraria1.carregarDados();
		livraria1.getLivros().remove(2);
		System.out.println(livraria1);
		
		livraria2 = livraria1.clone();
		livraria2.setNomeLivraria("Novel");
		System.out.println(livraria2);
		
	}

}
