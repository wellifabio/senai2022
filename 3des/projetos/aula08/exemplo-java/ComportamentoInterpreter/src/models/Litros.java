package models;

public class Litros extends Contexto {

	@Override
	public String galoes(double quantidade) {
		return Double.toString(quantidade / 3.78);
	}

	@Override
	public String litros(double quantidade) {
		return Double.toString(quantidade);
	}

	@Override
	public String copos(double quantidade) {
		return Double.toString(quantidade * 5);
	}

	@Override
	public String mls(double quantidade) {
		return Double.toString(quantidade * 1000);
	}

}
