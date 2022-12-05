package ex1;

public class Pessoa {
	
	private String nome;
	private int idade;

	public Pessoa(String nome, String idade) {
		this.nome = nome;
		try {
			this.idade = Integer.parseInt(idade);
		}catch(Exception e) {
			this.idade = 0;
		}
	}

	String faseDaVida() {
		if (this.idade < 10)
			return "Criança";
		else if (this.idade < 22)
			return "Jóvem";
		else if (this.idade < 60)
			return "Adulto";
		else
			return "Idoso";
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", faseDaVida()=" + faseDaVida() + "]";
	}
	
}
