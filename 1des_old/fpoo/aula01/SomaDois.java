import java.util.Scanner;

public class SomaDois{
	public static void main(String[] args){
		int valor1, valor2;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		valor1  = leia.nextInt();
		System.out.print("Digite outro número:");
		valor2  = leia.nextInt();
		
		int resultado = valor1 + valor2;
		
		System.out.println("O resultado da soma dos dois números é = "+resultado);
	}
}