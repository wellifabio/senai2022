package domain;

public class Livro {

	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + "]";
	}

}
