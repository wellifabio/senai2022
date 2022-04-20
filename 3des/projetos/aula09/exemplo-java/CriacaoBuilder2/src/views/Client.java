package views;

/*
 * Exemplo do Design Pattern de Criação Builder
 * https://www.youtube.com/watch?v=KbIdk5BRn0w
 * */

import models.Phone;
import models.PhoneBuilder;

public class Client {

	public static void main(String[] args) {
			
		//Não é possível criar com construtor vazio
		//Phone telefone = new Phone();		
		//Criação padrão de um Objeto, com todos os parâmetros preenchidos
		Phone telefone = new Phone("IOs","Intel",5,465,13);
		System.out.println(telefone);
		
		//Construtor de objeto, configurando todos os parâmetros com valor padrão
		PhoneBuilder builder = new PhoneBuilder();		
		Phone p = builder.getPhone();
		System.out.println(p);

	}

}
