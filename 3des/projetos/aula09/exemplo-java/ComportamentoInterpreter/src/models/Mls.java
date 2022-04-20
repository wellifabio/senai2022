package models;

public class Mls extends Contexto {

	@Override
	public String galoes(double quantidade) {
		return Double.toString(quantidade / 3785);
	}

	@Override
	public String litros(double quantidade) {
		return Double.toString(quantidade / 1000);
	}

	@Override
	public String copos(double quantidade) {
		return Double.toString(quantidade / 200);
	}

	@Override
	public String mls(double quantidade) {
		return Double.toString(quantidade);
	}

}
