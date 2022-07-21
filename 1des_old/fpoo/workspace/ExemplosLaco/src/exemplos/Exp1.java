package exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int opcao;
		do {
			System.out.print("Digite 1 para sair:");
			opcao = scan.nextInt();
		}while(opcao != 1);
		System.out.println("Adeus.");
	}

}
