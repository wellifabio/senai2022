package exercicio1;

public class FGTS {
	
	//Atributos
	private String nome;
	private double salario;
	
	//Entrada via Construtor
	public FGTS(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	//Métodos
	public double fgts() {
		return salario * 8 / 100f;
	}

	//Saida via toString
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", nome, salario, fgts());
	}
	
	public String toCSV() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, fgts());
	}
	
}
