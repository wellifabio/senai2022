package joao;

import java.util.Scanner;

public class Prova {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int menu = 0;

		while (menu != 5) {
			System.out.println("escolha o programa que quer resolver!\n");
			System.out.println("1 Horas Extras\n2 Apuração,\n3 Matérias Primas\n4 Blocos\n5 Sair");
			menu = leia.nextInt();

			switch (menu) {
			case 1:

				System.out.print("digite o total de horas trabalhadas:");
				int horas = leia.nextInt();
				System.out.print("digite o total de horas extras:");
				int horasE = leia.nextInt();

				float salario = (float) (horas * 5.625);

				float he = (float) (5.625 * 75) / 100;

				float nSalario = (horasE * he) + salario;

				System.out.printf("o seu salario vai ser de: %.2f\n", nSalario);
				break;

			case 2:

				System.out.print("Digite os nomes das escolas!:");
				String nome = leia.nextLine();

				break;

			case 3:

				break;

			case 4:

				System.out.print("quantas pessoas irão participar do desfile?:");
				int pessoas = leia.nextInt();

				float cf = (pessoas * 15) / 100;
				float aa = (pessoas * 5) / 100;
				float ab = (pessoas * 15) / 100;
				float ca = (pessoas * 20) / 100;
				float ms = (pessoas * 3) / 100;
				float b = (pessoas * 20) / 100;
				float mb = (pessoas * 2) / 100;
				float rb = (pessoas * 20) / 100;
				System.out.print("irá precisar de " + cf + " pessoas na comissão de frente\nDe " + aa
						+ " pessoas na Abre alas\nDe " + ab + " pessoas na ala das baianas\nDe " + ca
						+ " pessoas nos Carros alegóricos\nDe " + ms + " pessoas no Mestre sala e porta bandeira\nDe "
						+ b + " pessoas na bateria\nDe " + mb + " pessoas na madrinha de bateria\nDe " + rb
						+ " pessoas no recuo de bateria");

				break;

			case 5:
				System.out.print("Adeus");

				break;

			default:
			}
		}
	}
}