package visao;

import java.util.Scanner;

import modelo.Grupo;

public class Sorteio {

	private static Scanner scan = new Scanner(System.in);
	private static Grupo turma;
	private static String nomes[];

	public static void main(String[] args) {
		//Entrada
		System.out.print("Quantos nomes:");
		nomes = new String[scan.nextInt()];
		System.out.println("Digite ou cole os nomes separados por <Enter>:");
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = scan.next();
		}

		//Processamento
		turma = new Grupo(nomes);
		turma.embaralhar();
		
		//Saída
		System.out.println();
		turma.listarTodos();
		System.out.println("Digite quantos integrantes cada grupo deve ter");
		turma.separarGrupos(scan.nextInt());
	}

}
