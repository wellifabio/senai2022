package carlosdaniel;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Provadois {

	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 4) {
			System.out.print("1.Hora Extra\n2.Apuração\n3.\n4.Organização\n5.Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				Horaextra();
				break;
			case 2:
				Pontosescolas();
				break;
			case 3:
				Materiais();
				break;
			case 4:
				Pessoas();
				break;
			default:
				System.out.print("Opção inválida.");
				break;
			}
		}
	}

	public static void Horaextra() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Quantas horas o funcionario trabalhou?");
		int tra = scan.nextInt();
		System.out.print("Quantas horas extras o funcionario fez?");
		int hor = scan.nextInt();
		double cal, result, total;
		cal = (hor * 5.625);
		result = (cal * 0.75) + cal;
		total = tra + hor;
		System.out.println("O funcionario trabalhou " + tra + " horas");
		System.out.printf("O valor a ser pago por horas extras é R$%.2f\n", result);
	}

	public static void Pontosescolas() {
		scan = new Scanner(System.in);
		int t = 5;
		System.out.println("Nome das escolas:");
		System.out.println("Notas por categoria(0 a 10)");
		String[] nome = new String[t];
		int n1, n2, n3;
		int[] calc = new int[t];
		for (int i = 0; i < t; i++) {
			System.out.println("Nome da " + (i + 1) + "° escola");
			nome[i] = scan.next();
			System.out.println("Nota samba-enredo " + (i + 1) + ":");
			n1 = scan.nextInt();
			System.out.println("Nota fantasia " + (i + 1) + ":");
			n2 = scan.nextInt();
			System.out.println("Nota bateria " + (i + 1) + ":");
			n3 = scan.nextInt();
			calc[i] = (n1 + n2 + n3) / 3;
		}
		for (int i = 0; i < t; i++) {
			System.out.println(+(i + 1) + "Escola" + nome[i] + " Media das notas:" + calc[i]);
		}
	}

	public static void Materiais() {
		scan = new Scanner(System.in);

		int q1 = 3;
		String[] nomes = { "Lantejoula", "Penas de avestruz do Himalaia", "Seda Húmgra" };
		double[] estimativa = new double[q1];

		for (int i = 0; i < q1; i++) {
			System.out.println("Kg de" + nomes[i]);
			double kk = scan.nextDouble();
			System.out.println("Digite o valor gasto:" + nomes[i]);
			double vv = scan.nextDouble();
			double total = kk * vv;
		}
		for (int i = 0; i < q1; i++) {
			//Object[] total;
			//System.out.printf("%s custa em torno de R$%.2f", nomes[i], total[i]);

		}
		// if (total[0] > total[1] && total[2])
		//System.out.println(total[0]);

	}

	public static void Pessoas() {
		scan = new Scanner(System.in);
		System.out.println("Quantas pessoas vão participar?");
		int pess = scan.nextInt();
		double A = pess * 0.15;
		double B = pess * 0.05;
		double C = pess * 0.15;
		double D = pess * 0.20;
		double E = pess * 0.03;
		double F = pess * 0.20;
		double G = pess * 0.02;
		double H = pess * 0.20;
		System.out.println("Cada bloco vai receber:");
		System.out.println(A + " Pessoas para Comissão de frente .");
		System.out.println(B + " Pessoas para Abre-Alas. ");
		System.out.println(C + " Pessoas para Ala das baianas.");
		System.out.println(D + " Pessoas para Carros alegóricos.");
		System.out.println(E + " Pessoas para Mestre-sala e porta Bandeira.");
		System.out.println(F + " pessoas para Bateria.");
		System.out.println(G + " Pessoas para Madrinha de bateria.");
		System.out.println(H + " Pessoas para Recuo da bateria.");

	}

}