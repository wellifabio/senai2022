package modelo;

import java.util.Scanner;

public class Soma {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int val1, val2, result;
		
		System.out.println("Programa que faz Soma\n\n");
		
		System.out.print("Digite um valor inteiro:");
		val1 = entrada.nextInt();
		System.out.print("Digite outro valor:");
		val2 = entrada.nextInt();
		
		result = val1 + val2;
		
		System.out.println("A soma de "+ val1 +" e "+ val2 + " é " + result);
		System.out.printf("%d + %d = %d",val1,val2,result);
	}

}
