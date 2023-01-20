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
			input.nextLine();
			
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
					
					System.out.println("Informe o nome que deseja localizar : ");
					String busca = input.nextLine();
					
					// 0     1      2
					//nome;idade;cidade
					for(String linha : infoFile) {
						String[] temp = linha.split(";");
						if(temp[2].toLowerCase().contains(busca.toLowerCase())) {
							System.out.println("Nome : " + temp[0]);
							System.out.println("Idade : " + temp[1]);
							System.out.println("Cidade : " + temp[2]);	
						}
					}
					break;
				case 0:
					System.out.println("Inté");
					break;
			}
		}while(opcao != 0);
		
		
		
	}

}
