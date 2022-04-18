package model;

public class ObservaPrecos implements Observador {

	// Atributos observados
	private double precoFornecedor1;
	private double precoFornecedor2;
	private double precoFornecedor3;

	private static int observerRastreaId = 0;
	private int observerId;
	private Estoque observaPrecos;

	// Construtor
	public ObservaPrecos(Estoque observacao) {
		this.observaPrecos = observacao;
		this.observerId = ++observerRastreaId;
		System.out.println("***\nNova observação " + this.observerId);
		this.observaPrecos.registar(this);
	}

	@Override
	public void update(double precoForn1, double precoForn2, double precoForn3) {
		this.precoFornecedor1 = precoForn1;
		this.precoFornecedor2 = precoForn2;
		this.precoFornecedor3 = precoForn3;
		mostrarPrecos();
	}

	private void mostrarPrecos() {
		System.out.println(observerId + "\tFornecedor 1:" + precoFornecedor1 + "\tFornecedor 2:" + precoFornecedor2
				+ "\tFornecedor 3:" + precoFornecedor3);
	}

}
