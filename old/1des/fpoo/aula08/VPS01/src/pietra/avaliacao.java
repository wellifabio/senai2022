package pietra;

import java.io.IOException;

import java.util.Scanner;

public class avaliacao {

	public static Scanner entrada;

	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);

		int menu = 0;

		while (menu != 5) {
			System.out.print("\n 1 - Horas Extras \n 2 - Apuraçao \n 3 - Materia Primas \n 4 - Blocos \n 5 - Sair");
			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				javauni();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.out.print("Saiu!");
				break;
			default:
				System.out.print("---------[Essa opçao esta errada]-----------");

			}

		}
	}

	private static void javauni() {

	}
}
