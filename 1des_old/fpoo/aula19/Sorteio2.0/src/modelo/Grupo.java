package modelo;

import java.util.Random;

public class Grupo {
	
	//Aributos
	private String nomes[];
	private String nomesEmbaralhados[];
	private int usados[];
	private int contador;
	private Random rand;
	
	//Construtor
	public Grupo(String nomes[]) {
		//Iniciando os 3 vetores
		this.nomes = nomes;
		this.nomesEmbaralhados = new String[nomes.length];
		this.usados = new int[nomes.length];
		this.contador = 0;
		for (int i = 0; i < nomes.length; i++) {
			usados[i] = -1;
		}
	}
	//Métodos úteis
	public int obterAleatorioUnico() {
		rand = new Random();
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
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
	
	public void listarTodosEmbaralhados() {
		for (String nome : nomesEmbaralhados) {
			System.out.println(nome);
		}
	}
	
	public void separarGrupos(int totIntegrantes) {
		int cont = 0;
		int contGrupo = 1;
		System.out.printf("\nGrupo %d:\n",contGrupo);
		for (String nome : nomesEmbaralhados) {
			System.out.println(nome);
			cont++;
			if(cont == totIntegrantes) {
				cont = 0;
				contGrupo++;
				System.out.printf("\nGrupo %d:\n",contGrupo);
			}
		}
	}
}
