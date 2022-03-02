package inventario;

import java.util.Random;
import java.util.Scanner;

import inventario.CadastroBens.Bem;

public class CadastroBens {
	// Atributos da classe principal
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	static String[] descs = { "Carro", "Casa", "Moto", "Ap.", "Relógio", "celular", "Empresa" };
	// Método principal executável
	public static void main(String[] args) {
		System.out.println("Quantos bens deseja gerar? ");
		int qtdBens = s.nextInt();
		Bem[] bens = new Bem[qtdBens];
		System.out.println("Id\tDescrição\tValor");
		double acumulador = 0;
		for(int i = 0; i < qtdBens; i++) {
			bens[i] = new Bem(i+1,descs[r.nextInt(descs.length)],r.nextDouble()*100000);
			System.out.println(bens[i].bemTab());
			acumulador += bens[i].valor;
		}
		System.out.printf("Total R$ %.2f ",acumulador);
	}
	// Classe Interna
	public static class Bem {
		public int id;
		public String descricao;
		public double valor;

		Bem(){}
		Bem(int i, String d, double v) {
			id = i;
			descricao = d;
			valor = v;
		}
		public String bemTab() {
			return String.format("%d\t%s\t\tR$%.2f", id,descricao,valor);
		}
	}
}
