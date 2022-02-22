package tamires;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 5) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- Horas Extras");
			System.out.println("2- Apuração");
			System.out.println("3- Matérias Primas");
			System.out.println("4- Blocos");
			System.out.println("5- Sair");
			opcao = read.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("informe o valor do salário reajustado: ");
				int valor = read.nextInt();

				break;
			case 2:
				System.out.println("Apuração: ");
				int apuração = read.nextInt();

				break;
			case 3:
				System.out.println("Matérias Primas: ");
				int primas = read.nextInt();

				break;
			case 4:
				System.out.println("bloco: ");
				int bloco = read.nextInt();

				break;
			case 5:
				System.out.println("Até mais.");
			}
		}

	}

}