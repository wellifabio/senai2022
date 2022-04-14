package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Arquivo arq = new Arquivo();
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Cadastrar;");
			System.out.println("2 - Listar;");
			System.out.println("0 - Sair;");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1: 
					System.out.println("Informe o seu nome : ");
					String nome = input.nextLine();
					
					System.out.println("Informe sua idade : ");
					String idade = input.next();
					
					System.out.println("Informe sua cidade : ");
					String cidade = input.next();
					
					String data = nome + ";" + idade + ";" + cidade;
					
					arq.escrever(data, "Pessoas", true);
					break;
				case 2:
					ArrayList<String> infoFile = arq.ler("Pessoas");
					
					for(String linha : infoFile) {
						System.out.println(linha);
					}
					break;
				case 0:
					System.out.println("Inté");
					break;
			}
		}while(opcao != 0);
		
		
		
	}

}
