package exercicio1;

public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public int letras() {
		return this.nome.length();
	}
	
	public int palavras() {
		return this.nome.split(" ").length;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", letras()=" + letras() + ", palavras()=" + palavras() + "]";
	}
	
}
