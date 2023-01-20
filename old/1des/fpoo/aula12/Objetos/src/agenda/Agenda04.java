package agenda;

public class Agenda04 {

	public static void main(String[] args) {
		Contato c1 = new Contato();
		Contato c2 = new Contato();
		
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		c1.telefone = "(19)97878-7898";

		c2.id = 25;
		c2.nome = "Marcos";
		c2.idade = 21;
		c2.telefone = "(19)97777-1111";

		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
	}

}
