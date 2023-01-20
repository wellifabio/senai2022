/*Exemplo de um algoritmo de padronização para entrada de dados*/
import java.util.Scanner;

public class Altura {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Digite sua altura:");
		float altura = input.nextFloat();
		if(altura >= 3) {
			altura = altura / 100;
		}
		System.out.printf("Você possui %.2f metros de altura",altura);
	}
}