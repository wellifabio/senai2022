package padrao;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Venda> vendas = new ArrayList<>();
		float total = 0, media = 0;
		int caro = -1, barato = -1, vendido = -1;
		float maisCaro = 0, maisBarato = 1000000, maisVendido = 0;
		
		System.out.println("Digite quantos produtos deseja adicionar:");
		int quantos = scan.nextInt();
		System.out.println("Produto\tQuantidade\tPreço:");
		for(int i = 0; i < quantos; i++)
			vendas.add(new Venda(scan.next(), scan.nextInt(), scan.nextFloat()));
		
		System.out.println("Produto\tQuantidade\tPreço\tSubtotal():");
		for(int i = 0; i < quantos; i++) {
			System.out.println(vendas.get(i).toString());
			total += vendas.get(i).subTotal();
			media += vendas.get(i).preco;
			if(vendas.get(i).preco > maisCaro) {
				maisCaro = vendas.get(i).preco;
				caro = i;
			}
			if(vendas.get(i).preco < maisBarato) {
				maisBarato = vendas.get(i).preco;
				barato = i;
			}
			if(vendas.get(i).quantidade > maisVendido) {
				maisVendido = vendas.get(i).quantidade;
				vendido = i;
			}
		}
		
		System.out.println("Estatísticas:");
		System.out.printf("Total: R$ %.2f\n",total);
		System.out.printf("Média de preços: R$ %.2f\n",media/quantos);
		System.out.printf("Mais caro: %s\n",vendas.get(caro).toString());
		System.out.printf("Mais barato: %s\n",vendas.get(barato).toString());
		System.out.printf("Mais vendido: %s\n",vendas.get(vendido).toString());
	}

}
