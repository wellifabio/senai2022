package exercicio3;

public class IRRF {

	private String nome;
	private double salario;

	public IRRF(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double irrf() {
		if (salario < 1903.99f)
			return 0;
		else if (salario < 2826.66f)
			return salario * 7.5f / 100f - 142.80f;
		else if (salario < 3751.06f)
			return salario * 15 / 100f - 354.80f;
		else if (salario < 4664.69f)
			return salario * 22.5f / 100f - 363.13f;
		else
			return salario * 27.5f / 100f - 689.36f;
	}

	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", nome, salario, irrf());
	}

	public String toCSV() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, irrf());
	}
}
