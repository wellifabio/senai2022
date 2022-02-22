package annamassaro;

import java.io.IOException;
import java.util.Scanner;

public class Carnaval {

	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 4) {
			System.out.print("1 - Horas Extras\n2 - Apuração\n3 - Materias Primas\n4 - Blocos\n5 - Sair");

			menu = scan.nextInt();
			switch (menu) {
			case 1:
				GerarExtras();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.print("Tchau, obrigada!");
				break;
			default:
				System.out.print("A opção que foi seleciona não existe");
				break;
			}
		}

	}

	public static void GerarExtras() {
		scan = new Scanner(System.in);
		int s, sa;
		double result, resultEx, salario;

		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		System.out.println("Digite quantas horas você trabalhou");
		s = scan.nextInt();
		System.out.println("Digite quantas horas extras você fez");
		sa = scan.nextInt();

		result = s * 5.625;
		resultEx = sa * 9.84375;
		salario = result + resultEx;

		System.out.println("O funcionario" + nome + "ira receber R$" + salario);

	}
}