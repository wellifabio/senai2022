package util;

import java.util.Random;

public class Nome {

	private String[] nomes;
	private String[] sobrenomes;

	// Construtores
	public Nome() {
	}

	public Nome(String[] nomes, String[] sobrenomes) {
		this.nomes = nomes;
		this.sobrenomes = sobrenomes;
	}

	// Getters && Setters
	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}

	public String[] getSobrenomes() {
		return sobrenomes;
	}

	public void setSobrenomes(String[] sobrenomes) {
		this.sobrenomes = sobrenomes;
	}

	// Retorna um nome aleat�rio
	public String getNome() {
		return nomes[new Random().nextInt(nomes.length)] + " " + sobrenomes[new Random().nextInt(sobrenomes.length)];
	}

	public String getNome(int n) {
		String retorno = nomes[new Random().nextInt(nomes.length)] + " ";
		for (int i = 0; i < n; i++) {
			retorno += sobrenomes[new Random().nextInt(sobrenomes.length)] + " ";
		}
		return retorno;
	}

	// Retorna todos os poss�veis
	public String[] getAll() {
		String[] retornos = new String[nomes.length * sobrenomes.length];
		int cont = 0;
		for (int i = 0; i < nomes.length; i++)
			for (int j = 0; j < sobrenomes.length; j++) {
				retornos[cont] = nomes[i] + " " + sobrenomes[j];
				cont++;
			}
		return retornos;
	}

}
