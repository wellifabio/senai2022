package agenda;

public class Agenda02 {

	public static void main(String[] args) {
		//Criando um objeto
		Contato c1 = new Contato();
		//Preenche os atributos
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		//Mostra na tela
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
		//Limpa o objeto ou renova ele
		c1 = new Contato();
		//Mostra na tela
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
		//Preenche novamente com outros dados
		c1.id = 25;
		c1.nome = "Marcos";
		c1.idade = 21;
		//Mostra na tela
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);

	}

}
