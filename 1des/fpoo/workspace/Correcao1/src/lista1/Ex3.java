package lista1;
/*Desenvolva um programa que leia
 * um número ”n” inteiro, positivo
 * e diferente de zero e apresen-te
 * na tela: n – 1, e também n + 1.*/
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número N inteiro, positivo, diferente de 0:");
		int numero = leia.nextInt();
		
		int nMaisUm = numero + 1;
		int nMenosUm = numero - 1;
		
		System.out.println("N + 1 = "+nMaisUm);
		System.out.println("N - 1 = "+nMenosUm);
	}
}
