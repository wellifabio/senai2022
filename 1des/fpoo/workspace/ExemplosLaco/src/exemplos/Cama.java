package exemplos;

import java.io.IOException;
import java.util.Scanner;

public class Cama {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 3) {
			System.out.println("1.Coisa\n2.E Tal\n3.Sair\nEscolha:");
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("Ueba, vc escolheu \"Coisa\"");
				break;
			case 2: 
				System.out.println("Opa, vc escolheu \"Tal\"");
				break;
			case 3:
				System.out.println("Valeus, falows...");
				break;
			default:
				System.out.println("Ta de brincation with me.");
			}
		}

	}

}
