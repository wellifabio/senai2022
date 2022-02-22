package luizfernando;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Empresa {

	public static Scanner entrada;

	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);

		int menu = 0;

		while (menu != 5) {
			System.out.print("\n 1 - Horas Extras \n 2 - Apuração \n 3 - Matérias Primas \n 4 - Blocos \n 5 - Sair");
			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				Unidosjava();
				break;
			case 2:
				artesCanavalescas();
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.out.println("Saiu!");
				break;
			default:
				System.out.println("----------[Opção Inválida]----------");
				break;
			}

		}
	}

//**************** [UNIDOS JAVA] *******************
	public static void Unidosjava() {
		entrada = new Scanner(System.in);

		String nome;
		double totalHoras, horasExtras;
		double horasTrabalhadas, totalHorasExtras, reajuste, salarioFinal;

		System.out.println("Digite o nome do Funcionário:");
		nome = entrada.nextLine();

		System.out.println("Digite as horas Trabalhadas no mês:");
		horasTrabalhadas = entrada.nextInt();

		System.out.println("Digite as Horas Extras Feitas:");
		horasExtras = entrada.nextInt();

		totalHoras = horasTrabalhadas * 5.625;

		totalHorasExtras = 5.625 * 75 / 100 + 5.625;

		reajuste = horasExtras * totalHorasExtras;

		salarioFinal = reajuste + totalHoras;

		System.out.println("[" + nome + "]");
		System.out.println("Salário: R$" + totalHoras);
		System.out.printf("Salário Reajustado: %.2f", salarioFinal);
		System.out.println();

	}

//****************** [ARTES CANAVALESCAS] **********************
	public static void artesCanavalescas() {
		entrada = new Scanner(System.in);

		int comprimento = 1;

		String[] nomes = new String[comprimento];
		double[] bateria = new double[comprimento];
		double[] sambaEnredo = new double[comprimento];
		double[] fantasias = new double[comprimento];
		double[] media = new double[comprimento];
		double[] soma = new double[comprimento];

		for (int i = 0; i < comprimento; i++) {
			System.out.print("Nome da Escola..................: [" + i + "]: ");
			nomes[i] = entrada.next();

			System.out.print("Digite os Pontos da Bateria.....: [" + i + "]: ");
			bateria[i] = entrada.nextDouble();

			System.out.print("Digite os Pontos da Samba Enredo: [" + i + "]: ");
			sambaEnredo[i] = entrada.nextDouble();

			System.out.print("Digite os Pontos da Fantasias...: [" + i + "]: ");
			fantasias[i] = entrada.nextDouble();

			soma[i] = bateria[i] + sambaEnredo[i] + fantasias[i];

			media[i] = soma[i] / 3;

		}
		for (int i = 0; i < comprimento; i++) {

			System.out.println("************************************************");
			System.out.println("------------- Escola " + nomes[i] + "-----------");
			System.out.println("Pontos Bateria: [" + bateria[i] + "]");
			System.out.println("Pontos Samba Enredo: [" + sambaEnredo[i] + "]");
			System.out.println("Pontos Fantasias: [" + fantasias[i] + "]");
			System.out.println("************************************************");

			System.out.println("** TOTAL MÉDIA DAS ESCOLAS**");
			System.out.printf(" %.2f", media[i]);
			System.out.println();
			System.out.println("****************************");

		}
	}
}
