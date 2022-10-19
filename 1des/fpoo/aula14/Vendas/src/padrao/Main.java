package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Venda vendas[] = new Venda[10];
		float total = 0, media = 0;
		int caro = -1, barato = -1, vendido = -1;
		float maisCaro = 0, maisBarato = 1000000, maisVendido = 0;
		
		System.out.println("Produto\tQuantidade\tPreço:");
		for(int i = 0; i < 10; i++)
			vendas[i] = new Venda(scan.next(), scan.nextInt(), scan.nextFloat());
		
		System.out.println("Produto\tQuantidade\tPreço\tSubtotal():");
		for(int i = 0; i < 10; i++) {
			System.out.println(vendas[i].toString());
			total += vendas[i].subTotal();
			media += vendas[i].preco;
			if(vendas[i].preco > maisCaro) {
				maisCaro = vendas[i].preco;
				caro = i;
			}
			if(vendas[i].preco < maisBarato) {
				maisBarato = vendas[i].preco;
				barato = i;
			}
			if(vendas[i].quantidade > maisVendido) {
				maisVendido = vendas[i].quantidade;
				vendido = i;
			}
		}
		
		System.out.println("Estatísticas:");
		System.out.printf("Total: R$ %.2f\n",total);
		System.out.printf("Média de preços: R$ %.2f\n",media/10);
		System.out.printf("Mais caro: %s\n",vendas[caro].toString());
		System.out.printf("Mais barato: %s\n",vendas[barato].toString());
		System.out.printf("Mais vendido: %s\n",vendas[vendido].toString());
	}

}
