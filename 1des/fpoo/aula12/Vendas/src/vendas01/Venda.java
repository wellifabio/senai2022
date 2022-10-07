package vendas01;

public class Venda {
	
	String produto;
	float preco;
	int quantidade;
	
	float subtotal() {
		return preco * quantidade;
	}
}
