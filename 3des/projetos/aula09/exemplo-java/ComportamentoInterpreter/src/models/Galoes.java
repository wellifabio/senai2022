package models;

public class Galoes extends Contexto {

	@Override
	public String galoes(double quantidade) {
		return Double.toString(quantidade);
	}

	@Override
	public String litros(double quantidade) {
		return Double.toString(quantidade * 3.78);
	}

	@Override
	public String copos(double quantidade) {
		return Double.toString(quantidade * 16);
	}

	@Override
	public String mls(double quantidade) {
		return Double.toString(quantidade * 3785);
	}

}
