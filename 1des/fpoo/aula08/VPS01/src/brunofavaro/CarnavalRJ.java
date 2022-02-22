package brunofavaro;

import java.util.Scanner;

public class CarnavalRJ {

	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 5) {

			System.out.println("1- Horas Extras");
			System.out.println("2- Apuração");
			System.out.println("3- Matérias Primas");
			System.out.println("4- Blocos");
			System.out.println("5- Sair");
			System.out.print("Digite uma opção: ");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				HoraE();
				break;
			case 2:
				Apuracao();
				break;
			case 3:
				MateriaPri();
				break;
			case 4:
				Blocos();
				break;
			case 5:
				System.out.println("Até mais tarde!");
				break;
			default:
				break;

			}
		}
	}

	public static void HoraE() {

		System.out.println("Insira o Nome do Funcionario: ");
		String name = input.next();
		System.out.println("Insira as Horas extras Trabalhadas: ");
		double time = input.nextDouble();

		double extra = (time * 5.625) + (time * 5.625 * 0.75);
		System.out.printf("%s recebera de hora extra R$%.2f", name, extra);
	}

	public static void Apuracao() {

		int esc = 5;

		String[] name = new String[esc];
		int[] score = new int[esc];

		for (int i = 0; i < esc; i++) {

			int bat, sam, fant;
			System.out.print("Escola[" + i + "]: ");
			name[i] = input.next();
			System.out.println("De nota para as categorias");
			System.out.print("Bateria: ");
			bat = input.nextInt();
			System.out.print("Samba-enredo: ");
			sam = input.nextInt();
			System.out.print("Fantasias: ");
			fant = input.nextInt();

			score[i] = (bat + sam + fant) / 3;
		}
		for (int i = 0; i < esc; i++) {
			System.out.println(name[i] + " Nota " + score[i]);
		}
	}

	public static void MateriaPri() {

		int quant = 3;
		String[] material = { "Lantejoulas", "Penas de Avestruz do Himalaia", "Tecido da Húngria" };
		int[] gasto = new int[quant];

		for (int i = 0; i < quant; i++) {
			System.out.println("Kilos de " + material[i] + ": ");
			int peso = input.nextInt();
			System.out.println("Preço de " + material[i] + ": ");
			int preco = input.nextInt();

			gasto[i] = peso * preco;
		}

		if (gasto[0] > gasto[1] && gasto[0] > gasto[2]) {
			System.out.println(material[0] + " Custa R$" + gasto[0]);
		} else if (gasto[1] > gasto[0] && gasto[1] > gasto[2]) {
			System.out.println(material[1] + " Custa R$" + gasto[1]);
		} else {
			System.out.println(material[2] + " Custa R$" + gasto[2]);
		}

	}

	public static void Blocos() {

		int part;

		System.out.print("Insira o Total de participantes: ");
		part = input.nextInt();

		System.out.println("Participarão " + (part * 0.15) + " da Comissão de Frente\n");
		System.out.println("Participarão " + (part * 0.05) + " da Abre-Alas\n");
		System.out.println("Participarão " + (part * 0.15) + " da Ala das baianas\n");
		System.out.println("Participarão " + (part * 0.20) + " do Carros alegóricos\n");
		System.out.println((part * 0.03) + " serão Mestre-sala e Porta-bandeira\n");
		System.out.println("Participarão " + (part * 0.20) + " da Bateria\n");
		System.out.println((part * 0.02) + " serão Madrinha de bateria\n");
		System.out.println("Participarão " + (part * 0.20) + " da Recuo da bateria\n");
	}
}