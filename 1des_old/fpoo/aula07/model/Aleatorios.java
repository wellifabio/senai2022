package model;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

	public static Scanner scan;

	public static void main(String[] args) throws IOException{
		scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 4) {
			System.out.print("1.Numeros Inteiros\n2.Numeros Reais\n3.Nomes\n4.Sair");
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				GeraInteiros();
				break;
			case 2:
				GeraReais();
				break;
			case 3:
				GeraNomes();
				break;
			case 4:
				System.out.print("Valews, falows.");
				break;
			default:
				System.out.print("Opção inválida.");
				break;
			}
		}
	}

	public static void GeraInteiros() {
		scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Digite quantos números deseja gerar:");
		int qtd = scan.nextInt();

		int[] numeros = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			numeros[i] = rand.nextInt(100);
			System.out.println(numeros[i]);
		}
	}

	public static void GeraReais() {
		scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Digite quantos números deseja gerar:");
		int qtd = scan.nextInt();

		double[] numeros = new double[qtd];

		for (int i = 0; i < qtd; i++) {
			numeros[i] = rand.nextDouble() * 100;
			System.out.printf("%.2f\n", numeros[i]);
		}
	}

	public static void GeraNomes() {
		scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Digite quantos nomes você deseja gerar até 5:");
		int qtd = scan.nextInt();

		String[] nomes = { "João", "Maria", "Ivone", "Marcelo", "Marcos", "Juliana", "Brino", "Bruna" };

		for (int i = 0; i < qtd; i++) {
			int aleatorio = rand.nextInt(nomes.length);
			System.out.println(nomes[aleatorio]);
		}

	}

}
