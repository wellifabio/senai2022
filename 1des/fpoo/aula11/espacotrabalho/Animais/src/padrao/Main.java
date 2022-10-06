package padrao;

public class Main {

	public static void main(String[] args) {
		Gato gato1 = new Gato();//Objeto gato1
		Gato gato2 = new Gato();//Objeto gato2
		Gato gato3 = new Gato();//Objeto gato3
		Gato gato4 = new Gato();//Objeto gato4
		
		//Configurar atributos
		gato1.nome = "Gatão";
		gato1.raca = "Vira latas";
		gato1.peso = 3.5f;

		//Utilizar métodos
		gato1.ronronar();
		gato1.miar();
	}

}
