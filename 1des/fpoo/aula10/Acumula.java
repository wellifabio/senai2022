package classicos;

import java.util.Random;

public class Acumula {
	public static Random rand;
	
	public static void main(String[] args) {
		System.out.println("O algoritmo de acumulação");
		System.out.print("simples, retornou = ");
		System.out.println(simples(345));
		System.out.println("Total = " + aleatorio(345));
	}
	
	public static int simples(int iteracoes) {
		int x  = 0;
		for(int i = 0; i < iteracoes; i++)
			x+=i;
		return x;
	}
	
	public static int aleatorio(int iteracoes) {
		rand = new Random();
		int x = 0;
		int r = 0;
		for(int i = 0; i < iteracoes; i++) {
			r = rand.nextInt(100);
			System.out.println("Aleatorio = " + r);
			x+=r;
			System.out.println("Acumulado = " + x);
		}
		return x;
	}
}
