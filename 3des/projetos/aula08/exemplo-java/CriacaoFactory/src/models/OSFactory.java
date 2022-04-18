	package models;

public class OSFactory {

	//Metodo que define a criação do objeto a partir do parâmetro tipo
	public SistemaOperacional getInstance(String tipo) {
		//Dependendo do tipo informado o objeto assumirá uma classe
		if (tipo.equals("Aberto")) {
			return new Android();
		} else if (tipo.equals("Fechado")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
