package lista2;

import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		double salFilho = 56.47, salFam = 0;
		
		System.out.print("Digite seu salário: ");
		double salario = read.nextDouble();
		
		if(salario > 1655.98) {
			System.out.println("\"Se vira\", você não tem direito ao salário família");
		}else {
			System.out.print("Quantos filhos que se enquadra na regra você têm:");
			int filhos = read.nextInt();
			salFam = filhos * salFilho;
		}
		
		System.out.printf("O montante do salário família é: %.2f\n",salFam);
		System.out.printf("Seu salário total é: %.2f\n",salario + salFam);
	}

}
