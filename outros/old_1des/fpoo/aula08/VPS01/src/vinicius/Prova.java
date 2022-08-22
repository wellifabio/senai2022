package vinicius;

import java.io.IOException;

import java.util.Scanner;

public class Prova {

	public static Scanner ler;

	public static void main(String[] args) throws IOException {

		ler = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {

			System.out.println("Selecione a função que queira utilizar");
			System.out.println("1-Horas Extras, 2-Apuração, 3-Matérias Primas, 4-Blocos, 5-Sair");
			menu = ler.nextInt();
			switch (menu) {
			case 1:
				double S, H, SE, ST, HE;

				System.out.println("Digite o total de horas de trabalho do mês: ");
				H = ler.nextDouble();
				System.out.println("Digite o total de horas extras do mês: ");
				HE = ler.nextDouble();
				S = H * 5.625;
				SE = HE * 4.218;
				ST = S + SE;
				System.out.println("O salario com o total de horas trabalhadas é: " + ST);
				System.out.printf("O valor do salario de horas normais trabalhadas é: %.3f e ", S);
				System.out.printf("o valor do salario de horas extras trabalhadas é: %.3f.", SE);

				break;
			case 2:
				int escola = 0;
				while (escola != 5) {
					System.out.println("Escolha a escola de samba");
					System.out.println(
							"1-Unidos do JAVA/2-Rosas de Café/3-Imperatriz HTML/4-Pítons da Amazonia/5-Visual Basico");
					escola = ler.nextInt();
					switch (escola) {
					case 1:
						int batera, samba, fantasia;
						System.out.println("digite as notas na ordem, bateria, samba-enredo e fantasias");
						batera = ler.nextInt();
						samba = ler.nextInt();
						fantasia = ler.nextInt();

						break;

					case 2:

						break;

					case 3:

						break;

					case 4:

						break;

					case 5:

						break;

					}
				}
				break;
			case 3:
				System.out.println("");
				break;

			case 4:
				int p;
				System.out.println("Digite o numero de pessoas que irão participar: ");
				p = ler.nextInt();
				double pp, comissao, abrealas, baianas, carros, mestreporta, bateria, madrinha, recuo;
				pp = (p * 15) / 100;
				comissao = (p * 15) / 100;
				abrealas = (p * 5) / 100;
				baianas = (p * 15) / 100;
				carros = (p * 20) / 100;
				mestreporta = (p * 3) / 100;
				bateria = (p * 20) / 100;
				madrinha = (p * 2) / 100;
				recuo = (p * 20) / 100;

				System.out.printf("O numero de pessoas para cada bloco sera de ");
				System.out.printf("%.0f pessoas na Comissão de frente, ", comissao);
				System.out.printf("%.0f pessoas na Abre-Alas, ", abrealas);
				System.out.printf("%.0f pessoas na Ala das baianas, ", baianas);
				System.out.printf("%.0f pessoas no Carros alegóricos, ", carros);
				System.out.printf("%.0f pessoas nos Mestre-sala e Porta-bandeira, ", mestreporta);
				System.out.printf("%.0f pessoas na Bateria, ", bateria);
				System.out.printf("%.0f pessoas na Madrinha de bateria e ", madrinha);
				System.out.printf("%.0f pessoas no Recuo da bateria.", recuo);
				System.out.println("");
				System.out.println("");

				break;

			case 5:
				System.out.println("Tchau ;)");
				break;
			}
		}
	}
}