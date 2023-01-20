package felipecanizela;

import java.io.IOException;
import java.util.Scanner;

public class Testes {

	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 3) {
			System.out.println("1.Horas Extras\n2.Apuração\n3.Matérias Primas\n4.Blocos\n5.Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				Ex1();
				break;
			case 2:
				Ex2();
				break;
			case 3:
				Ex3();
				break;
			case 4:

				break;
			case 5:
				System.out.println("Obrigado, até a proxima!");
				break;
			default:
				System.out.println("Opção Invalida.");
				break;
			}
		}

	}

	public static void Ex1() {
		scan = new Scanner(System.in);
		int h1, extra;
		double salario;
		System.out.println("Digite quantas horas você trabalha nomalmente: ");
		h1 = scan.nextInt();
		System.out.println("Digite suas horas extras trabalhadas neste mês: ");
		extra = scan.nextInt();

		if (h1 > 5.625) {

			if (extra < 5.625) {
				salario = (5.625 * 2);
				System.out.println("O seu salario foi reajustado para: " + salario);
			}
		}
	}

	public static void Ex2() {
		scan = new Scanner(System.in);
		System.out.println("Digite quantas escolas participantes: ");

		int comp = scan.nextInt();

		String[] nomes = new String[comp];
		int[] pontos = new int[comp];
		String[] s1 = new String[comp];
		String[] b2 = new String[comp];
		String[] f3 = new String[comp];
		String[] media = new String[comp];
		for (int i = 0; i < comp; i++) {
			System.out.print("Escola[" + i + "]: ");
			nomes[i] = scan.next();
			if (pontos[i] < 5) {
				System.out.println("samba[" + i + "]: ");
			} else if (pontos[i] < 10) {
				System.out.println("bateria[" + i + "]: ");
			} else if (pontos[i] < 10) {
				System.out.println("fantasias[" + i + "]: ");

				media[i] = (s1[i] + b2[i]);

				System.out.println("A media é: " + media[i]);

			}
		}
	}

	public static void Ex3() {
		Scanner read = new Scanner(System.in);
	}
}