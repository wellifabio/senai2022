package rodrigo;

import java.util.Scanner;

public class Prova {
	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {
			System.out.println("----------------------------------");
			System.out.println(" Escolha uma opção");
			System.out.println("----------------------------------");
			System.out.println("1-Horas extras\n2-Apuração\n3-Matérias primas\n4-Blocos\n5-Sair");
			menu = scan.nextInt();
			switch (menu) {
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

				break;
			case 5:
				System.out.println("Adeus!");
				break;

			}
		}

	}

// completo :)
	public static void HorasExtras() {
		scan = new Scanner(System.in);
		double salarioporcen;
		System.out.println("Informe seu salário");
		int salario = scan.nextInt();
		System.out.println("DIgite seu total de horas extras trabalhadas");
		int HorasT = scan.nextInt();

		if (HorasT >= 1) {

			salarioporcen = 75.0 / 100;
			double SalFinal = salario + (salarioporcen * salario);
			System.out.println("Seu salário final será " + SalFinal);
		} else {
			System.out.println("Você não trabalhou horas suficientes");

		}
	}

// incompleto :(
	public static void Apuração() {
		scan = new Scanner(System.in);
		int escola, pontos;
		System.out.println("Digite o nome da escola");
		escola = scan.nextInt();
		System.out.println("Digite quantos pontos a escola fez");
		pontos = scan.nextInt();
	}

// completo :)
	public static void MatériasPrimas() {
		scan = new Scanner(System.in);
		Double valorKiloProduto;
		Double qtdKilosProduto;
		Double valorPagar;

		System.out.println("informe o valor do quilo da lantejoula");
		valorKiloProduto = scan.nextDouble();
		System.out.println("Informe o valor do quilo das penas");
		valorKiloProduto = scan.nextDouble();
		System.out.println("Informe o valor do quilo do tecido");
		valorKiloProduto = scan.nextDouble();

		System.out.println("informe a quantidade de quilos de lantejoula");
		qtdKilosProduto = scan.nextDouble();
		System.out.println("informe a quantidade de quilos de penas");
		qtdKilosProduto = scan.nextDouble();
		System.out.println("informe a quantidade de quilos de tecido");
		qtdKilosProduto = scan.nextDouble();

		valorPagar = valorKiloProduto * qtdKilosProduto;
		System.out.println("O valor total a ser pago é de: R$" + valorPagar + " Reais\"");

	}

}