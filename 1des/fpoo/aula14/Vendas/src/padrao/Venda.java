package padrao;

public class Venda {

	String produto;
	int quantidade;
	float preco;

	Venda(){}
	Venda(String prod, int qtd, float pr){
		produto = prod;
		quantidade = qtd;
		preco = pr;
	}
	
	public float subTotal() {
		return preco * quantidade;
	}

	public String toString() {
		return String.format("%s\t%d\t%.2f\t%.2f", produto, quantidade, preco, subTotal());
	}
}
