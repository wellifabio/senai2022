package rodolfo;

import java.util.Scanner;

public class Avaliação {

	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {
			System.out.print("1.Horas Extras\n2.Apuração\n3.Materias primas\n4.Blocos\n5.Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Digite o total de horas trabalhadas");
				int horas = scan.nextInt();
				System.out.print("Digite o total de horas extras trabalhadas");
				int Extras = scan.nextInt();

				float pagamento = (float) (horas * 5.625);
				float ex = (float) (5.625 * 75) / 100;
				float ePagamento = (Extras * ex) + pagamento;

				System.out.printf("o salario será: %2f|n", ePagamento);
				break;
			case 2:

				break;
			case 3:
				System.out.print("Produtos.");

				break;
			case 4:
				System.out.print("Quantas pessoas serão?");
				int participantes = scan.nextInt();

				int comissão = (participantes * 15) / 100;
				int ala = (participantes * 5) / 100;
				int baianas = (participantes * 15) / 100;
				int carros = (participantes * 20) / 100;
				int mestre = (participantes * 3) / 100;
				int bateria = (participantes * 20) / 100;
				int madrinha = (participantes * 2) / 100;
				int recuo = (participantes * 20) / 100;
				System.out.print("Será nescessario " + comissão + " pessoas na comissão de frente\n" + ala
						+ " pessoas de abre alas\n" + baianas + " pessoas na ala das baianas\n" + carros
						+ " de pessoas nos carros\n" + mestre + " mestre sala e porta bandeira\n" + bateria
						+ " na bateria\n" + madrinha + " madrinhas de bateria\n" + recuo + " no recuo da bateria");

				break;
			case 5:
				System.out.print("Valews, falows.");
				break;
			default:
				System.out.print("Opção inválida.");
				break;

			}
		}
	}
}
