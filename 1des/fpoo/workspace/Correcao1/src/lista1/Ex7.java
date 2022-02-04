package lista1;

import java.util.Scanner;

/*Um laboratório de Física está estudando barras de calcário para Construção Civil,
 * e precisa saber a densidade de cada barra.
 * Faça um programa para ajudá-los. (Dado: densidade = massa / volume)*/
public class Ex7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a massa e o volume do calcário:");
		int massa = read.nextInt();
		int volume = read.nextInt();

		float densidade = (float) massa / volume;
		System.out.printf("A dencidade do calcário é de %.2f",densidade);
	}
}
