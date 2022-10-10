package vendas02;

public class Main {

	public static void main(String[] args) {
		Venda vs[] = new Venda[10]; //Vetor de 10 instâncias da classe Venda
		
		//10 Objetos
		vs[0] = new Venda();
		vs[0].produto = "Camiseta";
		vs[0].preco = 19.9f;
		vs[0].quantidade = 1;

		vs[1] = new Venda();
		vs[1].produto = "Bermuda";
		vs[1].preco = 39.9f;
		vs[1].quantidade = 2;
		
		vs[2] = new Venda();
		vs[2].produto = "Shots";
		vs[2].preco = 49.9f;
		vs[2].quantidade = 5;

		vs[3] = new Venda();
		vs[3].produto = "Calsa";
		vs[3].preco = 25.9f;
		vs[3].quantidade = 2;
		
		vs[4] = new Venda();
		vs[4].produto = "Blusa";
		vs[4].preco = 59.9f;
		vs[4].quantidade = 3;

		vs[5] = new Venda();
		vs[5].produto = "Cueca";
		vs[5].preco = 9.9f;
		vs[5].quantidade = 15;
		
		vs[6] = new Venda();
		vs[6].produto = "Calcinha";
		vs[6].preco = 9.9f;
		vs[6].quantidade = 1;

		vs[7] = new Venda();
		vs[7].produto = "Meia";
		vs[7].preco = 9.9f;
		vs[7].quantidade = 2;
		
		vs[8] = new Venda();
		vs[8].produto = "Boné";
		vs[8].preco = 19.9f;
		vs[8].quantidade = 1;

		vs[9] = new Venda();
		vs[9].produto = "Sapato";
		vs[9].preco = 79.9f;
		vs[9].quantidade = 2;
		
		float total = 0;
		System.out.println("Produto\tPreço\tQuantidade\tValor");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%s\t%.2f\t%d\t%.2f\n", vs[i].produto, vs[i].preco, vs[i].quantidade, vs[i].subtotal());
			total += vs[i].subtotal();
		}
		System.out.printf("Total: R$ %.2f\n",total);
	}

}
