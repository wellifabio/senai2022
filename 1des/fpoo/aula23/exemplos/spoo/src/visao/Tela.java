package visao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ProcessaPlanilha.carregar();
		int menu = 0;
		while(menu!=5) {
			System.out.println("1. Adição");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			System.out.println("5. Sair");
			menu = scan.nextInt();
			ProcessaPlanilha.enviar(menu);
		}

	}

}
