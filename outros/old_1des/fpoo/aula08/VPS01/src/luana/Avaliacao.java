package luana;

import java.util.Scanner;
import java.io.IOException;

public class Avaliacao {

	public static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int opcao = 0;

//*1 Horas Extras, 2 Apuração, 3 Matérias Primas, 4 Blocos, 5 Sair

		while (opcao != 5) {

			System.out.println(" ");
			System.out.println("1-Horas Extras\t2-Apuração\n3-Matérias Primas\n4-Blocos\n5- Sair");
			System.out.println(" ");

			System.out.println("Digite uma opção: ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				HorasExtras();

				break;

			case 2:
				Apuração();
				break;

			case 3:
				MatériasPrimas();
				break;

			case 4:
				Blocos();
				break;

			case 5:
				System.out.print("obrigado!");
				break;

			default:
				System.out.print("Opçao Invalida");
			}

		}
	}

	public static void HorasExtras() {
		scan = new Scanner(System.in);

		double HorasNormais, HorasExtras;
		double PreçoNormais = 5.625, PreçoExtras = 8.438;
		String nome;
		/*
		 * entrada
		 */

		System.out.println(".");

		System.out.println("solução das horas extras dos funcionários");

		System.out.println("nome do funcionário: ");
		nome = scan.next();

		System.out.println("quantas horas normais? ");
		HorasNormais = scan.nextDouble();

		System.out.println("quantas horas extras? ");
		HorasExtras = scan.nextDouble();

		System.out.println("o valor a receber em horas normais EM UM DIA será: " + HorasNormais * PreçoNormais);

		System.out.println("o valor a receber em horas extras será: " + HorasExtras * PreçoExtras);

		System.out.printf("o salario final do funcionário %s será: %.3f", nome,
				(HorasNormais * PreçoNormais) + (HorasExtras * PreçoExtras));

		System.out.println(" ");

		/*
		 * uso do print f %d = int %.(numero de casas dps da virgula)f = double ou float
		 * %s = string
		 */
	}

	public static void Apuração() {
		scan = new Scanner(System.in);

		System.out.print("Apuração");

		/*
		 * 2 – A academia de artes carnavalescas precisa de um sistema que armazene o
		 * nome das escolas de samba concorrentes e os pontos obtidos nas categorias:
		 *
		 * bateria, samba-enredo e fantasias, e no final da apuração informe o nome da
		 * escola, a média dos pontos obtidos e a escola campeã.
		 *
		 * Sabe-se que 5 escolas de samba estão competindo e que os pontos de cada
		 * categoria vão de 0 a 10.
		 * 
		 */

	}

	public static void MatériasPrimas() {
		scan = new Scanner(System.in);

		System.out.print("MatériasPrimas");

		System.out.println("quantidade real de material utilidada em kg");
		int qntdReal = scan.nextInt();

		System.out.println("quantidade de material programada em kg");
		int qntdPlano = scan.nextInt();

		System.out.println("preço do kg do material");
		int preço = scan.nextInt();

		System.out.println("preço total gasto");

		System.out.println("valor exedido");

	}

	public static void Blocos() {
		scan = new Scanner(System.in);
		System.out.print("Blocos da Imperatriz HTML");

		System.out.print("quantas pessoas vão participar?");
		int qnt = scan.nextInt();

		System.out.println("Comissão de frente: " + qnt * 0.15);

		System.out.println("Abre-Alas: " + qnt * 0.05);

		System.out.println("Ala das baianas: " + qnt * 0.15);

		System.out.println("Carros alegóricos: " + qnt * 0.2);

		System.out.println("Mestre-sala: " + qnt * 0.03);

		System.out.println("Porta-bandeira: " + qnt * 0.03);

	}

	public static void sair() {
		scan = new Scanner(System.in);

		System.out.print("Obrirgado!");

	}

}
