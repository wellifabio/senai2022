package view;

import model.ObservaPrecos;

import java.util.Locale;

import model.ObservaEstoque;

/*
 * Design Pattern Comportamental Observer
 * Quando precisamos que outros objetos sejam atualizados quando um objeto muda
 * Exemplo
 * Um programa que compara preços de um detrminado produto em fornecedores diferentes
 * e atualiza o valor do estoque
 * https://www.youtube.com/watch?v=wiQdrH2YpT4
 * 
 * */

public class ClienteObservador {

	
	public static ObservaEstoque obsEstq;
	public static ObservaPrecos obsPr1;
	public static ObservaPrecos obsPr2;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		obsEstq = new ObservaEstoque();
		
		//Inserindo preços manualmente
		obsPr1 = new ObservaPrecos(obsEstq);	
		obsEstq.setPrecoForn1(197.00);
		obsEstq.setPrecoForn2(245.50);
		obsEstq.setPrecoForn3(135.55);

		obsPr2 = new ObservaPrecos(obsEstq);
		obsEstq.setPrecoForn1(199.00);
		obsEstq.setPrecoForn2(249.50);
		obsEstq.setPrecoForn3(139.55);
		
		obsEstq.excluirRegistro(obsPr2);
		
		//Obtendo preços automaticamente de forma aleatória
		Runnable getForn1 = new GetEstoque(obsEstq, 1, "Forn1", 200.00);
		Runnable getForn2 = new GetEstoque(obsEstq, 1, "Forn2", 200.00);
		Runnable getForn3 = new GetEstoque(obsEstq, 2, "Forn3", 200.00);
		new Thread(getForn1).start();
		new Thread(getForn2).start();
		new Thread(getForn3).start();

	}

}
