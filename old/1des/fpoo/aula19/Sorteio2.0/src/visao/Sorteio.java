package visao;

import java.util.Scanner;

import modelo.Grupo;

public class Sorteio {

	private static Scanner scan = new Scanner(System.in);
	private static Grupo turma;
	private static String nomes[];

	public static void main(String[] args) {
		//Objeto para leitura dos nomes
		Leitura leia = new Leitura();
		
		//Entrada
		System.out.print("Quantos nomes:");
		int quantos = scan.nextInt();
		nomes = leia.lerNomes(quantos);

		//Processamento
		turma = new Grupo(nomes);
		turma.embaralhar();
		
		//Saída
		System.out.println();
		turma.listarTodos();
		System.out.println("Digite quantos integrantes cada grupo deve ter");
		turma.separarGrupos(scan.nextInt());
	}
	
	//Classe interna para limpar o Scanner e funcionar corretamente o nextLine()
	public static class Leitura {
		private Scanner scan = new Scanner(System.in);
		public String[] lerNomes(int n) {
			String nomes[] = new String[n];
			System.out.println("Digite ou cole os nomes separados por <Enter>:");
			for (int i = 0; i < n; i++) {
				nomes[i] = scan.nextLine();
			}
			return nomes;
		}
	}

}
