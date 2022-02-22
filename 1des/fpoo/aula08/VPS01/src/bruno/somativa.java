package bruno;

import java.io.IOException;
import java.util.Scanner;

public class somativa {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int opcao = 0;
		while (opcao != 4) {

			System.out.println("Escolha Uma Opção: ");
			System.out.println("1-Horas Extras\t2-Apuração\t3-Materias Prima\\t4-Bloco\\t5-Sair");
			opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				double salario, salarioR;
				int horas, horasE;
				System.out.println("Digite suas horas trabalhadas no mes: ");
				horas = sc.nextInt();
				System.out.println("Digite suas horas Extras trabalhadas: ");
				horasE = sc.nextInt();

				salario = 5.625 * horas;

				salarioR = salario + (horasE * (5.625 * 0.75));

				System.out.printf("seu salario é: R$%.2f\n", salario);
				System.out.printf("seu salario reajustado é: R$%.2f\n", salarioR);
				break;
			case 2:
				int comprimento = 6;

				String[] escolas = new String[comprimento];
				int[] pontosB = new int[comprimento];
				int[] pontosS = new int[comprimento];
				int[] pontosF = new int[comprimento];
				int[] media = new int[comprimento];

				for (int i = 1; i < comprimento; i++) {
					System.out.println("Nome da " + i + "° escola: ");
					escolas[i] = sc.next();
					System.out.println("total de pontos na bateria(maximo 10): ");
					pontosB[i] = sc.nextInt();
					System.out.println("total de pontos no samba-enredo(maximo 10): ");
					pontosS[i] = sc.nextInt();
					System.out.println("total de pontos na fantasia(maximo 10): ");
					pontosF[i] = sc.nextInt();

				}
				for (int i = 1; i < comprimento; i++) {
					media[i] = pontosB[i] + pontosS[i] + pontosF[i] / 3;
				}
				for (int i = 1; i < comprimento; i++) {
					System.out.println("Escola " + escolas[i] + " com média de pontos: " + media[i]);
				}
				if (media[1] > media[2] && media[1] > media[3] && media[1] > media[4] && media[1] > media[5]) {
					System.out.println("Escola " + escolas[1] + " é a vencedora");
				} else if (media[2] > media[1] && media[2] > media[3] && media[2] > media[4] && media[2] > media[5]) {
					System.out.println("Escola " + escolas[2] + " é a vencedora");
				} else if (media[3] > media[1] && media[3] > media[2] && media[3] > media[4] && media[3] > media[5]) {
					System.out.println("Escola " + escolas[3] + " é a vencedora");
				} else if (media[4] > media[1] && media[4] > media[2] && media[4] > media[3] && media[4] > media[5]) {
					System.out.println("Escola " + escolas[4] + " é a vencedora");
				} else if (media[5] > media[1] && media[5] > media[2] && media[5] > media[3] && media[5] > media[4]) {
					System.out.println("Escola " + escolas[5] + " é a vencedora");
				} else {
					System.out.println("ouve um empate.");
				}

				break;

			case 3:
				double peso, gastos, lantejolas, Penas, Seda;

				System.out.println("Digite o total de peso dos materiais: ");
				peso = sc.nextFloat();

				System.out.println("Digite o valor dos gastos: ");
				gastos = sc.nextFloat();

				System.out.println("Digite o valor das lantejoulas: ");
				lantejolas = sc.nextFloat();

				System.out.println("Digite o valor das Penas: ");
				Penas = sc.nextDouble();

				System.out.println("Digite o valor da Seda: ");
				Seda = sc.nextDouble();

				double valorT = lantejolas + Penas + Seda;
				System.out.printf("Total de R$%.2f\n", valorT);

				if (valorT > gastos) {
					System.out.println("O valor passa do estimado.");
				} else {
					System.out.println("Está dentro da estimativa.");
				}

				break;
			case 4:
				break;
			case 5:
				break;

			}
		}
	}
}
