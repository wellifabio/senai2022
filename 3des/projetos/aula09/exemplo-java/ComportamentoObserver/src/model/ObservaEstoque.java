package model;

import java.util.ArrayList;

public class ObservaEstoque implements Estoque {

	// Atributos
	private ArrayList<Observador> observers;
	private double precoForn1;
	private double precoForn2;
	private double precoForn3;

	// Construtor
	public ObservaEstoque() {
		observers = new ArrayList<Observador>();
	}

	// Métodos da interface comportamento
	@Override
	public void registar(Observador o) {
		observers.add(o);

	}

	@Override
	public void excluirRegistro(Observador o) {
		int indice = observers.indexOf(o);
		System.out.println("Observer " + (indice + 1) + " excluído");
		observers.remove(indice);

	}

	@Override
	public void notificar() {
		for (Observador o : observers) {
			o.update(precoForn1, precoForn2, precoForn3);
		}
	}

	// Setters
	public void setPrecoForn1(double precoForn1) {
		this.precoForn1 = precoForn1;
		notificar();
	}

	public void setPrecoForn2(double precoForn2) {
		this.precoForn2 = precoForn2;
		notificar();
	}

	public void setPrecoForn3(double precoForn3) {
		this.precoForn3 = precoForn3;
		notificar();
	}

}
