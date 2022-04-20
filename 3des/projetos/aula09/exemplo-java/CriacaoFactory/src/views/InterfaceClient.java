package views;

import models.Android;
import models.IOS;
import models.SistemaOperacional;
import models.Windows;

///* 
//* Exemplo da utilização simples de Interface
//* Neste Caso, utilizamos a Interface SistemaOperacional
//* Instanciada de três formas diferentes
//* https://www.youtube.com/watch?v=pt1IbV1aSZ4
//* */

public class InterfaceClient {

	private static SistemaOperacional so;

	public static void main(String[] args) {

		so = new Android(); //A cada vez que utilizamos o "new" alocamos memória para um objeto
		System.out.println(so.getTipo());
		so = new IOS();
		System.out.println(so.getTipo());
		so = new Windows();
		System.out.println(so.getTipo());
		
		//Da forma convencional estamos alocando memória para três objetos

	}

}
