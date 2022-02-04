package lista1;

import java.util.Scanner;

/*Faça um programa que leia dois valores,
 * divida o primeiro valor digitado pelo segundo valor digita-do
 * e informe para o usuário qual será o valor de resto dessa divisão.*/
public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite dois valores inteiros A e B:");
		int a = leia.nextInt();
		int b = leia.nextInt();
		int resto = a % b;
		System.out.println("O resto da divisão de A por B é "+resto);
	}
}
