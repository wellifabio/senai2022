package padrao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Operacao> operacoes = new ArrayList<>();
	
	public static void main(String[] args) {
		float investTotal = 0, faturaTotal = 0, lucro = 0, lucroPorcento = 0;
		
		System.out.println("Produto\tQtd. Comprada\tQtd. Vendida\tPreço Compra\t Preço Venda:");
		for(int i = 0; i < 10; i++) {
			operacoes.add(new Operacao(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextFloat(),scan.nextFloat()));
		}
		
		System.out.println("Produto\tQtd. Comprada\tQtd. Vendida\tPreço Compra\t Preço Venda\tInvestimento\tFaturamento\tLucro R$\tlucro %:");
		for(Operacao o: operacoes) {
			System.out.println(o.toString());
			investTotal += o.investimento();
			faturaTotal += o.faturamento();
		}
		lucro = faturaTotal - investTotal;
		lucroPorcento = lucro / faturaTotal * 100;
		System.out.println("Estatísticas:");
		System.out.printf("Investimento total R$ %.2f\n", investTotal);
		System.out.printf("Faturamento total R$ %.2f\n", faturaTotal);
		System.out.printf("Lucro total R$ %.2f\n", lucro);
		System.out.printf("Porcentagem de Lucro total %.1f%%\n", lucroPorcento);
	}

}
