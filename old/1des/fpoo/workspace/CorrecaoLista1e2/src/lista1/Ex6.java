package lista1;

import java.util.Scanner;

/*Desenvolva um programa que leia o raio (cm) e a altura (cm) de um cilindro.
 * Calcule e mostre a área (cm2) e o volume (cm3) do cilindro.*/
public class Ex6 {

	public static float PI = (float) 3.14;
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o raio (cm) e a altura (cm) de um cilindro:");
		int raio = read.nextInt();
		int altura = read.nextInt();
		
		// Fórmula da área do Círculo (Al = 2p. r)
		float areaCirculo = (float) 2 * PI * raio;
		// Fórmula do volume do Cilindro (Al = 2p. r. h)
		float volumeCilindro = (float) 2 * PI * raio * altura;

		System.out.printf("A área do Círculo é de %.2fcm2\n", areaCirculo);
		System.out.printf("O volume do Cilindro é de %.2fcm3", volumeCilindro);
	}
}
