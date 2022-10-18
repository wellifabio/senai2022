package programa;

public class Paciente {

	// Atributos
	String nome;
	float peso;
	float altura;

	// Construtores
	Paciente() {
	}

	Paciente(String n, float p, float a) {
		nome = n;
		peso = p;
		altura = a;
	}

	// Método que calcula o índice de massa corpórea IMC
	public float imc() {
		return peso / (altura * altura);
	}
	//Método que faz o diagnóstico conforme orientações médicas
	public String diagnostico() {
		if (imc() < 16)
			return "Subpeso Severo";
		else if (imc() < 20)
			return "Subpeso";
		else if (imc() < 25)
			return "Normal";
		else if (imc() < 30)
			return "Sobrepeso";
		else if (imc() < 40)
			return "Obeso";
		else
			return "Obeso Mórbido";
	}

	// Método que formata a String de saída
	public String toString() {
		return String.format("%s\t%.2f\t%.2f\t%.2f\t%s", nome, peso, altura, imc(), diagnostico());
	}

}