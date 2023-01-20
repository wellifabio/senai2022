package modelo;

import java.util.Scanner;

public class Exp2 {

	public static void main(String[] args) {
		//Variáveis
		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		float delta,r1,r2;
		
		//Entrada
		System.out.println("Este programa calcula");
		System.out.println("as raízes de uma expressão");
		System.out.println("de segundo grau");
		System.out.println("Digite A, B e C:");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		//Processamento
		delta = (float) b * b - 4 * a * c;
		if(delta <= 0) {
			System.out.println("Esta expressão não");
			System.out.println("possui raizes reais");
		}else {
			r1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raizes são");
			System.out.printf("x' = %.2f e x'' = %.2f",r1,r2);
		}
	}

}
