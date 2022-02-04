package exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Exp2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 1){
			System.out.print("Digite 1 para sair:");
			opcao = scan.nextInt();
		}
		System.out.println("Adeus.");
	}

}
