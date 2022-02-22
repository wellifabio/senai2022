package beatriz;

import java.io.IOException;
import java.util.Scanner;

public class prova {
	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {
			System.out.print("1- Horas extra\n2- Apuração\n3- Matérias Primas\n4- Blocos\n5- Sair");
			menu = scan.nextInt();
			switch (menu) {

			case 1:
				System.out.println("Digite o total de horas trabalhadas ao longo do mês: ");
				double horas = scan.nextDouble();
				System.out.println("Digite a quantidade de horas extra feita ao longo do mês: ");
				double horasExtra = scan.nextDouble();

				double mes = horas * 5.625;
				double extra = 5.625 + 4.218;
				double Ex = horasExtra * extra;

				System.out.println("O valor do seu salário sem horas extra seria de: " + mes);
				System.out.println("------------------------------------------------");
				System.out.println("Você realizou " + horasExtra + " horas extras.");
				System.out.println("------------------------------------------------");
				System.out.printf("O valor do seu salário com horas extras é de: %.2f\n", (mes + Ex));
				System.out.println("---------------------------------------------------");
				break;
			case 2:
				GerarNota();
				break;
			case 3:
				Gerarquilo();
				break;
			case 4:
				System.out.println("Digite a quantidade total de pessoas para o evento: ");
				int total = scan.nextInt();
				double G1 = total * 0.15;
				double G2 = total * 0.05;
				double G3 = total * 0.15;
				double G4 = total * 0.20;
				double G5 = total * 0.03;
				double G6 = total * 0.20;
				double G7 = total * 0.02;
				double G8 = total * 0.20;

				System.out.println("Para o bloco da Comissão de frente, é necessário: " + G1);
				System.out.println("Para o bloco da Abre-Alas, é necessário: " + G2);
				System.out.println("Para o bloco da Ala das baianas, é necessário: " + G3);
				System.out.println("Para o bloco da Carros alegóricos, é necessário: " + G4);
				System.out.println("Para o bloco da Mestre-sala e Porta-bandeira, é necessário: " + G5);
				System.out.println("Para o bloco da Bateria, é necessário: " + G6);
				System.out.println("Para o bloco da Madrinha de bateria, é necessário: " + G7);
				System.out.println("Para o bloco da Recuo da bateria, é necessário: " + G8);

				break;
			case 5:
				System.out.println("Obrigado! Adeus!");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
	}

	public static void GerarNota() {
		scan = new Scanner(System.in);
		int qntd1 = 5;
		String[] nomes = new String[qntd1];
		double notas1, notas2, notas3;
		double[] media = new double[qntd1];

		for (int i = 0; i < qntd1; i++) {
			System.out.println("Digite os nomes das escolas de samba: ");
			System.out.println("Digite as notas de cada escola seguindo a ordem bateria, samba-enredo e fantasias: ");
			nomes[i] = scan.next();
			notas1 = scan.nextDouble();
			notas2 = scan.nextDouble();
			notas3 = scan.nextDouble();
			media[i] = (notas1 + notas2 + notas3) / 3;

		}
		for (int i = 0; i < qntd1; i++) {
			System.out.println("Nomes das escolas de samba: " + nomes[i]);
			System.out.println("A media da scolade samba foi de : " + media[i]);
		}
	}

//3
	public static void Gerarquilo() {
		scan = new Scanner(System.in);

		int qntd1 = 3;
		String[] nomes = { "Lantejola", "Penas de avestruz do Himalaia", "Tecido de seda Húngara" };
		double[] estimativa = new double[qntd1];
		double[] total = new double[qntd1];

		for (int i = 0; i < qntd1; i++) {
			System.out.println("Digite o valor em quilos de " + nomes[i]);
			double quilos = scan.nextDouble();
			System.out.println("Digite o valor gasto: " + nomes[i]);
			double valor = scan.nextDouble();

			total[i] = quilos * valor;
		}
		for (int i = 0; i < qntd1; i++) {
			System.out.printf("%s custa em torno de R$%.2f\n", nomes[i], total[i]);
		}
	}
}