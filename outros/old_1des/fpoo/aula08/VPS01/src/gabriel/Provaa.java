package gabriel;

import java.util.Scanner;

public class Provaa {

	public static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int opcao = 0;
		while (opcao != 5) {

			System.out.println("escolha o programa que deseja utilizar : ");
			System.out.println("1 hora extra\n2 Apuraçao\n3 Materias Primas\n4 blocos\n5 Sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("digite a quantidade de horas trabalhadas : ");
				int horas = entrada.nextInt();
				System.out.println("digite a quantidade de horas extras : ");
				int ahoras = entrada.nextInt();

				double salario = (double) (horas * 5.625);

				double hr = (double) (5.625 * 75) / 100;

				double Salario = (ahoras * hr) + salario;

				System.out.printf("o seu salario sera de : %.2f\n", +Salario);

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:
				System.out.print("digite a quantidade de pessoas : ");
				int pessoas = entrada.nextInt();

				float pepols = (pessoas * 15) / 100;
				float comissao = (pessoas * 5) / 100;
				float alas = (pessoas * 15) / 100;
				float ala = (pessoas * 20) / 100;
				float cl = (pessoas * 20) / 100;
				float mestresalaeportabandeira = (pessoas * 3) / 100;
				float bateria = (pessoas * 20) / 100;
				float madrinhadebateria = (pessoas * 2) / 100;
				float recuodebateria = (pessoas * 20) / 100;

				System.out.println("a quantidade sera de : " + pepols + "");
				System.out.println("comissao de frente : " + comissao + "");
				System.out.println("abre alas : " + alas + "");
				System.out.println("ala das baianas : " + ala + "");
				System.out.println("carros alegoricos : " + cl + "");
				System.out.println("mestre sala e porta bandeira : " + mestresalaeportabandeira + "");
				System.out.println("quantidade de pessoas na bateria : " + bateria + "");
				System.out.println("a madrinha de bateria : " + madrinhadebateria + "");
				System.out.println("recuodebateria : " + recuodebateria + "");
				break;

			case 5:

				System.out.println("ate mais, vlw ");

				break;

			}

		}

	}

}