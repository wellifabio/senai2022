package padrao;

public class Operacao {

	String produto;
	int qtdComprada;
	int qtdVendida;
	float precoCompra;
	float precoVenda;

	public Operacao() {
	}

	public Operacao(String produto, int qtdComprada, int qtdVendida, float precoCompra, float precoVenda) {
		this.produto = produto;
		this.qtdComprada = qtdComprada;
		this.qtdVendida = qtdVendida;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public float investimento() {
		return qtdComprada * precoCompra;
	}

	public float faturamento() {
		return qtdVendida * precoVenda;
	}

	public float lucroDinheiro() {
		return faturamento() - investimento();
	}

	public float lucroPorcentagem() {
		return lucroDinheiro() / faturamento() * 100;
	}

	@Override
	public String toString() {
		return String.format("%s\t%d\t%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f", produto, qtdComprada, qtdVendida,
				precoCompra, precoVenda, investimento(), faturamento(), lucroDinheiro(), lucroPorcentagem());
	}

}
