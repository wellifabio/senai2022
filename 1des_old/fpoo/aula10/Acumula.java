package classicos;

import java.util.Random;

public class Acumula {
	public static Random rand;
	
	public static void main(String[] args) {
		System.out.println("O algoritmo de acumulação");
		System.out.print("simples, retornou = ");
		System.out.println(simples(5));
		System.out.println("Total = " + aleatorio(5));
		System.out.println("5!="+fatorial(5));
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
			x+=r;
			System.out.print("Aleatorio = " + r);
			System.out.println("\tAcumulado = " + x);
		}
		return x;
	}
	public static int fatorial(int n) {
		int x  = 1;
		for(int i = n; i > 0; i--)
			x*=i;
		return x;
	}
	

}
