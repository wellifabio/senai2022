package agenda;

import java.util.Scanner;

public class Agenda06 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Digite quantos contatos deseja cadastrar:");
		int qtdCont = scan.nextInt();
		Contato[] contatos = new Contato[qtdCont];
		
		System.out.println("id\tNome\tIdade\tTelefone");
		for(int i = 0; i < qtdCont; i++) {
			contatos[i] = new Contato();
			contatos[i].id = scan.nextInt();
			contatos[i].nome = scan.next();
			contatos[i].idade = scan.nextInt();
			contatos[i].telefone = scan.next();
		}

		System.out.println("id\tNome\tIdade\tTelefone");
		for(int i = 0; i < qtdCont; i++) {
			System.out.println(contatos[i].contatoTab());
		}
	}

}
