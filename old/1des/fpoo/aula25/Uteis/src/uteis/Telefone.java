package util;

import java.util.Random;

public class Telefone {

	// Atrinutos
	private String telefone;

	// Construtores (O constr. vazio gera um n�mero aleat�rio)
	public Telefone() {
		this.telefone = "";
		String[] ddd = { "19", "11", "21", "14" };
		this.telefone += ddd[new Random().nextInt(ddd.length)];
		for (int i = 0; i < (9 - new Random().nextInt(2)); i++)
			this.telefone += new Random().nextInt(9);
	}

	public Telefone(String telefone) {
		this.telefone = telefone;
	}

	// Getters
	public String getTelefone() {
		return telefone;
	}

	// Formata o telefone
	public String getFormat() {
		StringBuilder retorno = new StringBuilder(this.telefone);
		retorno = retorno.insert(0, "(");
		retorno = retorno.insert(3, ")");
		if (this.telefone.length() == 11)
			retorno = retorno.insert(9, "-");
		else
			retorno = retorno.insert(8, "-");
		return retorno.toString();
	}
	
}
