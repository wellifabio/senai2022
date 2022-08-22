package modelo;

import java.util.Scanner;

public class Resto {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int val1, val2, result, resto;
		
		System.out.print("Digite um valor inteiro: ");
		val1 = entrada.nextInt();
		System.out.print("Digite outro valor diferente de zero: ");
		val2 = entrada.nextInt();
		
		result = val1 / val2;
		resto = val1 % val2;
		
		System.out.printf("%d / %d = %d\n",val1,val2,result);
		System.out.println("O resto da divisão é "+resto);
	}

}
