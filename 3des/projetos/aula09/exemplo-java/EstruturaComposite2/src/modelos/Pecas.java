package modelos;

public class Pecas implements Componente {

	private String nome;
	private float preco;

	@Override
	public void mostrarPreco() {
		System.out.println(nome + ": " + preco);
	}

	// Construtor com todos os campos
	public Pecas(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// GETs && SETs
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
