package karina;

import java.io.IOException;
import java.util.Scanner;

public class AvaliacaoSomativa01 {
	public static Scanner entrada;

	public static void main(String[] args) throws IOException {
		entrada = new Scanner(System.in);

		int menu = 0;
		while (menu != 5) {
			System.out.println("Bem Vindos ao Carnaval do Rio de Jaqueiro!");
			System.out.println("--------------------MENU--------------------");
			System.out.println("Ecolha a opção abaixo conforme sua necessidade:");
			System.out.println("1-Horas Extras\n2-Apuração\n3-Matérias Primas\n4-Blocos\n5-Sair");
			menu = entrada.nextInt();
			switch (menu) {
			case 1:
				horasExtras();
				break;
			case 2:
				apuracao();
				break;
			case 3:
				materiasPrimas();
				break;
			case 4:
				blocos();
				break;
			case 5:
				System.out.println("Obrigada e volte sempre!");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	public static void horasExtras() {
		entrada = new Scanner(System.in);
		double valHora = 5.625;
		double valExtra = valHora * 0.75 + valHora;
		double horasTrab, horasExtrasTrab, salarioFinal;

		System.out.print("Digite quantas horas você trabalhou esse mês: ");
		horasTrab = entrada.nextDouble();
		System.out.print("E quantas horas extras você fez esse mês: ");
		horasExtrasTrab = entrada.nextDouble();

		salarioFinal = horasTrab * valHora + horasExtrasTrab * valExtra;
		System.out.printf("Seu salário este mês será de R$ %.3f\n", salarioFinal);
	}

	public static void apuracao() {
		entrada = new Scanner(System.in);
		int comprimento = 5;

		String[] nomes = new String[comprimento];
		int[] pontosBat = new int[comprimento];
		int[] pontosSam = new int[comprimento];
		int[] pontosFan = new int[comprimento];

		for (int i = 0; i < comprimento; i++) {
			System.out.print("Escola de Samba [" + i + "]: ");
			nomes[i] = entrada.next();

			System.out.print("Pontos Bateria [" + i + "]: ");
			pontosBat[i] = entrada.nextInt();

			System.out.print("Pontos Samba-enredo [" + i + "]: ");
			pontosSam[i] = entrada.nextInt();

			System.out.print("Pontos Fantasias [" + i + "]: ");
			pontosFan[i] = entrada.nextInt();
		}

		for (int i = 0; i < comprimento; i++) {
			double[] media = new double[comprimento];
			media[i] = (pontosBat[i] + pontosSam[i] + pontosFan[i]) / 3;
			System.out.println("Escola de Samba: " + nomes[i] + " Média: " + media[i]);
		}
	}

	public static void materiasPrimas() {
		entrada = new Scanner(System.in);
		System.out.println("Falta muito ainda para esse código...");

	}

	public static void blocos() {

		entrada = new Scanner(System.in);
		int totalPessoas;
		double comissaoFrente = 0.15f;
		double abreAlas = 0.05f;
		double alaBaianas = 0.15f;
		double carrosAleg = 0.20f;
		double mestreSala = 0.03f;
		double portaBand = 0.03f;
		double bateria = 0.20f;
		double madrinhaBat = 0.02f;
		double recuoBat = 0.20f;

		System.out.println("Digite aqui quantas pessoas irão ao desfile: ");
		totalPessoas = entrada.nextInt();

		System.out.printf("A quantia de pessoas por cada bloco segue abaixo:");
		System.out.printf("Comissão de Frente: %.1f\n", totalPessoas * comissaoFrente);
		System.out.printf("Abre-Alas: %.1f\n", totalPessoas * abreAlas);
		System.out.printf("Ala das Baianas: %.1f\n", totalPessoas * alaBaianas);
		System.out.printf("Carros Alegóricos: %.1f\n", totalPessoas * carrosAleg);
		System.out.printf("Mestre-sala: %.1f\n", totalPessoas * mestreSala);
		System.out.printf("Porta-bandeiras: %.1f\n", totalPessoas * portaBand);
		System.out.printf("Bateria: %.1f\n", totalPessoas * bateria);
		System.out.printf("Madrinha de Bateria: %.1f\n", totalPessoas * madrinhaBat);
		System.out.printf("Recuo da Bateria: %.1f\n", totalPessoas * recuoBat);
	}
}