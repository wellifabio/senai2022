package controllers;

import java.util.ArrayList;

import models.Orcamento;
import models.Produto;
import models.dao.OrcamentoDAO;

public class OrcamentoProcess {

	public static ArrayList<Orcamento> orcamentos = new ArrayList<>();
	private static OrcamentoDAO sd = new OrcamentoDAO();
	
	public static void abrir() {
		orcamentos = sd.ler();
	}
	
	public static void salvar() {
		sd.escrever(orcamentos);
	}
	
	public static void setMaisBarato() {
		ArrayList<Produto> produtos = new ArrayList<>();
		Produto produto;
		//Percorre todos os produtos agrupando e selecionando os mais baratos
		for (Orcamento o : orcamentos) {
			produto = new Produto(o.getProduto(),o.getPreco());
			if(!produtos.contains(produto)) {
				produtos.add(produto);
			}else {
				//Se não contem o produto, adiciona o produto se contem verifica se é o mais barato se for adiciona o mais barato
				if(produtos.get(produtos.indexOf(produto)).getPreco() >= produto.getPreco()) {
					produtos.set(produtos.indexOf(produto),produto);
				}
			}
		}
		//Percorre Todos os produtos configurando o mais barato
		for (Orcamento o : orcamentos) {
			produto = new Produto(o.getProduto(),o.getPreco());
			if(o.getPreco() != produtos.get(produtos.indexOf(produto)).getPreco()) {
				o.setMaisBarato(false);
			}
		}
	}
	
	public static void main(String[] args) {
		abrir();
		setMaisBarato();
		for (Orcamento o : orcamentos) {
			System.out.print(o.toString());
		}		
	}
}
