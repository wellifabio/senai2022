package view;

import java.text.DecimalFormat;

import model.ObservaEstoque;

public class GetEstoque implements Runnable {

	private int inicio;
	private String estoque;
	private double preco;
	private ObservaEstoque obsEstoque;

	public GetEstoque(ObservaEstoque obsEstoque, int inicio, String estoque, double preco) {

		this.inicio = inicio;
		this.estoque = estoque;
		this.preco = preco;
		this.obsEstoque = obsEstoque;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			double randNum = (Math.random() * (.9)) - .1;
			DecimalFormat df = new DecimalFormat("#.##");
			preco = Double.valueOf(df.format((preco + randNum)));

			if (estoque == "Forn1")
				((ObservaEstoque) obsEstoque).setPrecoForn1(preco);
			if (estoque == "Forn2")
				((ObservaEstoque) obsEstoque).setPrecoForn2(preco);
			if (estoque == "Forn3")
				((ObservaEstoque) obsEstoque).setPrecoForn3(preco);

			System.out.println("->" + inicio + ":" + estoque + ": " + df.format(preco + randNum) +" - "+ df.format(randNum));
		}

	}

}
