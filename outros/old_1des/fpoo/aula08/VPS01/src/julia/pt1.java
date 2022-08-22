package julia;

import java.util.Scanner;

public class pt1 {
	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int menu = 0;

		while (menu != 4) {
			System.out.println("1- Horas Extras\n2- Apuração\n3- Matérias Primas \n4- Sair");
			menu = sc.nextInt();

			switch (menu) {
			case 1:

				public class atv1 {

					public static void main(String[] args) {
						Scanner entrada = new Scanner(System.in);
// 1 – A escola de samba unidos do JAVA está com dificuldade para gerenciar
//o pagamento de seus funcionários, devido ao aumento das horas extras. Para auxiliá-los
//crie um algoritmo que receba o total de horas e horas extras trabalhadas no mês e informe
//o valor do salário reajustado. Leve em consideração que todos recebem em média R$ 5,625 por
//hora trabalhada e que a hora extra vale 75% a mais do valor original.

						double a, b, c;

						System.out.println("Quantidade de horas trabalhadas: ");
						a = entrada.nextDouble();
						System.out.println("Quantidade de horas EXTRAS trabalhadas: ");
						b = entrada.nextDouble();
						c = (a * 5.625) + (b * 0.75);
						System.out.println("O valor do salário reajustado é: " + c);
					}

				}

				break;
			case 2:

				public class Atv2 {
					public static Scanner sc;

					public static void main(String[] args) {
						/*
						 * 2 – A academia de artes carnavalescas precisa de um sistema que armazene o
						 * nome das escolas de samba concorrentes e os pontos obtidos nas categorias:
						 * bateria, samba-enredo e fantasias, e no final da apuração informe o nome da
						 * escola, a média dos pontos obtidos e a escola campeã. Sabe-se que 5 escolas
						 * de samba estão competindo e que os pontos de cada categoria vão de 0 a 10.
						 */

						sc = new Scanner(System.in);

						int menu = 0;

						while (menu != 4) {
							System.out.println("1- Escola1 \n2- Escola2 \n3- Escola3 \n4- Sair");
							menu = sc.nextInt();

							int media;
							switch (menu) {
							case 1:
								System.out.println("Escola1:");
								System.out.println("Notas: Bateria - 10, Samba-enredo - 10, Fantasias - 10");
								media = 10 + 10 + 10;
								System.out.println("Média : " + media);
								break;

							case 2:
								System.out.println("Escola2:");
								System.out.println("Notas: bateria - 0, samba-enredo - 0, fantasias - 0");
								media = 10 + 10 + 10;
								System.out.println("A média da escola1 é: " + media);
								break;

							case 3:
								System.out.println("Escola3:");
								System.out.println("Notas: bateria - 0, samba-enredo - 0, fantasias - 0");
								media = 10 + 10 + 10;
								System.out.println("A média da escola1 é: " + media);
								break;

							case 4:
								System.out.print("Obrigado!");
								break;

							default:
								System.out.print("Opção Inválida");
								break;

							}

						}
					}
				}

				break;
			case 3:

				break;
			case 4:
				System.out.print("Obrigado!");
				break;
			default:
				System.out.print("Opção Inválida");
				break;
			}
		}
	}

}