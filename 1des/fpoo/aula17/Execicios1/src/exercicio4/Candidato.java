package exercicio4;

public class Candidato {

	// Atributos
	private int numero;
	private String nome;

	// Construtores
	public Candidato(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Candidato() {
	}

	// Getter && Setter
	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return String.format("%d;%s\r\n", numero, nome);
	}

}
