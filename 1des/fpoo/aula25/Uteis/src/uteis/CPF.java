package util;

import java.util.Random;

public class CPF implements Cloneable {

	// Atributos
	private String cpf;

	// Construtores
	public CPF() {
		this.cpf = "";
		Random gerador = new Random();
		for (int i = 0; i < 9; i++) {
			cpf += "" + gerador.nextInt(9);
		}
		cpf += getDigit();
	}

	public CPF(String cpf) {
		this.cpf = cpf;
	}

	// Getters && Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// M�todo que gera os d�gitos verificadores do CPF
	public String getDigit() {
		String cpfSemDigito = this.cpf.substring(0, 9);
		String digito = "";
		int peso = 10, soma = 0, d1 = 0, d2 = 0;
		for (int i = 0; i < 9; i++) {
			soma += Integer.parseInt(cpfSemDigito.charAt(i) + "") * (peso - i);
		}
		d1 = soma % 11;
		if (d1 < 2)
			d1 = 0;
		else
			d1 = 11 - d1;
		soma = 0;
		cpfSemDigito += d1;
		peso = 11;
		for (int i = 0; i < 10; i++) {
			soma += Integer.parseInt(cpfSemDigito.charAt(i) + "") * (peso - i);
		}
		d2 = soma % 11;
		if (d2 < 2)
			d2 = 0;
		else
			d2 = 11 - d2;
		digito += d1;
		digito += d2;
		return digito;
	}

	// Valida se os digitos do CPF est�o OK
	public boolean isOk() {
		if (this.cpf.length() == 11) {
			if (this.cpf.substring(9, 11).equals(getDigit()))
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
	
	// Formata o cpf
	public String getFormat() {
		StringBuilder retorno = new StringBuilder(this.cpf);
		retorno = retorno.insert(3, ".");
		retorno = retorno.insert(7, ".");
		retorno = retorno.insert(11, "-");
		return retorno.toString();
	}

}
