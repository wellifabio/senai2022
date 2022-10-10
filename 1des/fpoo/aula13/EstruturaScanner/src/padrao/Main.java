package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		int idade;
		float peso;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = scan.next();
		System.out.println("Digite sua idade");
		idade = scan.nextInt();
		System.out.println("Digite seu peso");
		peso = scan.nextFloat();
		
		System.out.printf("Nome: %s\nIdade:%d\nPeso:%.1f\n",nome, idade, peso);
	}

}
