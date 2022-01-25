package modelo;

import java.util.Scanner;

public class Div {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		float val1, val2, result;
		
		System.out.print("Digite um valor real: ");
		val1 = entrada.nextInt();
		System.out.print("Digite outro valor diferente de zero: ");
		val2 = entrada.nextInt();
		
		result = val1 / val2;
		
		System.out.printf("%.2f / %.2f = %.2f",val1,val2,result);
	}

}
