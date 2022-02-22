package santiago;

import java.util.Scanner;

public class Carnaval {

	public static Scanner entrada;

	public static void main(String[] args) {

		double val1, val2, result;
		entrada = new Scanner(System.in);

		int op = 0;

		while (op != 5) {
			System.out.println(
					"Selecione uma opção\n1- Horas Extras\n2- Apuração\n3- Matérias Primas\n4- Blocos\n5 Sair ");
			op = entrada.nextInt();

			switch (op) {
			case 1:

				System.out.println("Infome o total de horas trabalhadas: ");
				val1 = entrada.nextDouble();
				System.out.println("Informe tambem as horas extras: ");
				val2 = entrada.nextDouble();

				result = val1 * 5.625 + (val2 * (5.625 / 100 * 75));

				System.out.printf("O valor total a receber é de %.2f\n ", result);

				break;

			case 2:
				entrada = new Scanner(System.in);

				System.out.println("Informe o nome da escola 1: ");
				String escola1 = entrada.nextLine();
				System.out.println("Informe o nome da escola 2: ");
				String escola2 = entrada.nextLine();
				System.out.println("Informe o nome da escola 3: ");
				String escola3 = entrada.nextLine();
				System.out.println("Informe o nome da escola 4: ");
				String escola4 = entrada.nextLine();
				System.out.println("Informe o nome da escola 5: ");
				String escola5 = entrada.nextLine();

				System.out.println("Digite a nota de bateria da escola " + escola1);
				double notabateria1 = entrada.nextDouble();
				System.out.println("Digite a nota de bateria da escola " + escola2);
				double notabateria2 = entrada.nextDouble();
				System.out.println("Digite a nota de bateria da escola " + escola3);
				double notabateria3 = entrada.nextDouble();
				System.out.println("Digite a nota de bateria da escola " + escola4);
				double notabateria4 = entrada.nextDouble();
				System.out.println("Digite a nota de bateria da escola " + escola5);
				double notabateria5 = entrada.nextDouble();

				System.out.println("Digite a nota de samba-enredo da escola " + escola1);
				double notaSE1 = entrada.nextDouble();
				System.out.println("Digite a nota de samba-enredo da escola " + escola2);
				double notaSE2 = entrada.nextDouble();
				System.out.println("Digite a nota de samba-enredo da escola " + escola3);
				double notaSE3 = entrada.nextDouble();
				System.out.println("Digite a nota de samba-enredo da escola " + escola4);
				double notaSE4 = entrada.nextDouble();
				System.out.println("Digite a nota de samba-enredo da escola " + escola5);
				double notaSE5 = entrada.nextDouble();

				System.out.println("Digite a nota de fantasias da escola " + escola1);
				double notafantasia1 = entrada.nextDouble();
				System.out.println("Digite a nota de fantasias da escola " + escola2);
				double notafantasia2 = entrada.nextDouble();
				System.out.println("Digite a nota de fantasias da escola " + escola3);
				double notafantasia3 = entrada.nextDouble();
				System.out.println("Digite a nota de fantasias da escola " + escola4);
				double notafantasia4 = entrada.nextDouble();
				System.out.println("Digite a nota de fantasias da escola " + escola5);
				double notafantasia5 = entrada.nextDouble();

				double media1 = (notabateria1 + notaSE1 + notafantasia1) / 3;
				double media2 = (notabateria2 + notaSE2 + notafantasia2) / 3;
				double media3 = (notabateria3 + notaSE3 + notafantasia3) / 3;
				double media4 = (notabateria4 + notaSE4 + notafantasia4) / 3;
				double media5 = (notabateria5 + notaSE5 + notafantasia5) / 3;

				System.out.println("A escola " + escola1 + " Com a média de: " + media1);
				System.out.println("A escola " + escola2 + " Com a média de: " + media2);
				System.out.println("A escola " + escola3 + " Com a média de: " + media3);
				System.out.println("A escola " + escola4 + " Com a média de: " + media4);
				System.out.println("A escola " + escola5 + " Com a média de: " + media5);

				double maiorMedia = 0;

				if (media1 > maiorMedia) {
					maiorMedia = media1;
				}
				if (media2 > maiorMedia) {
					maiorMedia = media2;
				}
				if (maiorMedia == media1) {
					System.out.println("Vencedora: " + escola1);
				}
				if (maiorMedia == media2) {
					System.out.println("Vencedora: " + escola2);
				}
				if (maiorMedia == media3) {
					System.out.println("Vencedora: " + escola3);
				}
				if (maiorMedia == media4) {
					System.out.println("Vencedora: " + escola4);
				}
				if (maiorMedia == media5) {
					System.out.println("Vencedora: " + escola5);
				}
				break;

			case 3:

				System.out.println("DIgite a quantia de lantejoula em kg: ");
				double lantejoula = entrada.nextDouble();
				System.out.println("Digite a quantia em kg de Penas de Avestruz do Himalaia: ");
				double PNH = entrada.nextDouble();
				System.out.println("Digite a quantidade em kg de tecido de seda Húngara: ");
				double TSH = entrada.nextDouble();

				System.out.println("Digite o valor do kg de lantejoula: ");
				double valor1 = entrada.nextDouble();
				System.out.println("Digite o valor do kg de Penas de Avestruz do Himalaia: ");
				double valor2 = entrada.nextDouble();
				System.out.println("Digite o valor do kg de tecido de seda Húngara: ");
				double valor3 = entrada.nextDouble();

				System.out.println("Digite a quantia esperada de gasto de Lantejoula: ");
				double expec1 = entrada.nextDouble();
				System.out.println("Digite a quantia esperada de gasto de Penas de Avestruz do Himalaia : ");
				double expec2 = entrada.nextDouble();
				System.out.println("Digite a quantia esperada de gasto de tecido de seda Húngara: ");
				double expec3 = entrada.nextDouble();

				if (valor1 * lantejoula > expec1) {
					System.out.println("O valor de lantejoula foi excedido. Valor gasto: R$" + valor1 * lantejoula);
				}
				if (valor2 * PNH > expec2) {
					System.out.println(
							"O valor das Penas de Avestruz do Himalaia foi excedido. Valor gasto: R$" + valor2 * PNH);
				}
				if (valor3 * TSH > expec3) {
					System.out
							.println("O valor do tecido de seda Húngara foi excedido. Valor gasto: R$" + valor3 * TSH);
				}
				break;
			case 4:

				System.out.println("Digite a quantia total de pessoas que irão se apresentar: ");
				int per = entrada.nextInt();

			}

		}
	}
}