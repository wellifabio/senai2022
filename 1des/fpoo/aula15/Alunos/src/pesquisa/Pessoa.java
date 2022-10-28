package pesquisa;

public class Pessoa {

	String nome;
	String sobrenome;
	int idade;
	String faseVetor[] = { "Criança", "Jovem", "Adulto", "Idoso" };

	Pessoa() {
	}

	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public int faseDaVida() {
		if (idade < 10)
			return 0;
		else if (idade < 25)
			return 1;
		else if (idade < 60)
			return 2;
		else
			return 3;
	}

	@Override
	public String toString() {
		return nome + "\t" + sobrenome + "\t" + idade + "\t" + faseVetor[faseDaVida()];
	}

}
