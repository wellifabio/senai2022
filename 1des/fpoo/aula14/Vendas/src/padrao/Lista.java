/*
 * Listas
 * Permitem a solução dos 4 problemas básicos da programação
 * CRUD (Create, Read, Update, Delete)
 * (Criar, Ler, Alterar e Excluir)
 * */
package padrao;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		//Inicialmento toda lista tem 0 elementos
		ArrayList<String> nomes = new ArrayList<>();
		//Adicionar elementos a lista
		nomes.add("Maria");
		nomes.add("Marcos");
		nomes.add("Ana");
		nomes.add("Marcelo");
		System.out.println("O comprimento da lista criada é "+nomes.size());
		//Laço forEach para percorrer a lista
		for(String nome: nomes) {
			System.out.println(nome);
		}
		//Se precisar adicionar mais itens a lista
		nomes.add("Roberto");
		System.out.println("O comprimento da lista com mais um item é "+nomes.size());
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		//Se precisar remover
		nomes.remove(3); //Remove o quarto elemento da lista
		System.out.println("O comprimento da lista com o 4º item removido é "+nomes.size());
		for(String nome: nomes) {
			System.out.println(nome);
		}
		//Se precisar alterar um elemento da lista
		nomes.set(1, "Osvaldo");
		System.out.println("O comprimento da lista com o 2º item alterado é "+nomes.size());
		for(String nome: nomes) {
			System.out.println(nome);
		}
		//Se precisar excuir a lista inteira
		nomes = new ArrayList<>();
		nomes.add("Maria");
		System.out.println("O comprimento da lista excluída e com um ítem apenas "+nomes.size());
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}

}
