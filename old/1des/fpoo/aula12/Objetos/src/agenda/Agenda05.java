package agenda;

public class Agenda05 {
	
	public static void main(String[] args) {
		Contato c1 = new Contato(30,"Jaqueline",19,"(19)97878-7898");
		Contato c2 = new Contato(25,"Marcos",21,"(19)97777-1111");
		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
	}

}
