package modelo;

import java.util.Random;
import java.util.Scanner;

public class Turma {
	
	private String nomes[];
	private String nomesEmbaralhados[];
	private int usados[];
	private int contador = 0;
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
	
	public void preencherVetor(int qtdade) {
		nomes = new String[qtdade];
		nomesEmbaralhados = new String[qtdade];
		usados = new int[qtdade];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = scan.nextLine();
		}
		for (int i = 0; i < nomes.length; i++) {
			usados[i] = -1;
		}
	}
	
	public void listarTodosEmbaralhados() {
		for (String a : nomesEmbaralhados) {
			System.out.println(a);
		}
	}
	
	public int obterAleatorioUnico() {
		int indiceAleatorio = rand.nextInt(nomes.length);
		boolean contem = true;
		while(contem) {
			contem = false;
			for (int i = 0; i < usados.length; i++) {
				if(indiceAleatorio == usados[i]) {
					contem = true;
					break;
				}
			}
			if(contem) {
				indiceAleatorio = rand.nextInt(nomes.length);
			}
		}
		usados[contador] = indiceAleatorio;
		contador++;
		return indiceAleatorio;
	}
	
	public void embaralhar() {
		for (int i = 0; i < nomes.length; i++) {
			nomesEmbaralhados[i] = nomes[obterAleatorioUnico()]; 	
		}
	}
	
	public void listarTodos() {
		for (String a : nomes) {
			System.out.println(a);
		}
	}
	
	public void separarGrupos(int totIntegrantes) {
		int cont = 0;
		int contGrupo = 1;
		System.out.printf("\nGrupo %d:\n",contGrupo);
		for (String a : nomesEmbaralhados) {
			System.out.println(a);
			cont++;
			if(cont == totIntegrantes) {
				cont = 0;
				contGrupo++;
				System.out.printf("\nGrupo %d:\n",contGrupo);
			}
		}
	}
}
