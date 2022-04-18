package domain;

import java.util.ArrayList;

public class Livraria implements Cloneable {

	private String nomeLivraria;
	private ArrayList<Livro> livros = new ArrayList<>();

	public String getNomeLivraria() {
		return nomeLivraria;
	}

	public void setNomeLivraria(String nomeLivraria) {
		this.nomeLivraria = nomeLivraria;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public void carregarDados() {
		for (int i = 1; i <= 10; i++) {
			Livro l = new Livro();
			l.setId(i);
			l.setNome(" livro " + i);
			getLivros().add(l);
		}
	}

	@Override
	public String toString() {
		return "Livraria [nomeLivraria=" + nomeLivraria + ", livros=" + livros + "]";
	}

	@Override
	public Livraria clone() throws CloneNotSupportedException {
		Livraria livraria = new Livraria();
		/*
		for (Livro l : getLivros()) {
			livraria.getLivros().add(l);
		}
		*/
		livraria.carregarDados();
		return livraria;
	}

}
