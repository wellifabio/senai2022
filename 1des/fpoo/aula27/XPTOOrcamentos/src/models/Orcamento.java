package models;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public class Orcamento {
	
	private int id;
	private String fornecedor;
	private String produto;
	private double preco;
	private boolean maisBarato;

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");

	public Orcamento(String id, String fornecedor, String produto, String preco) {
		df.setCurrency(Currency.getInstance(BRASIL));
		try {
			this.id = Integer.parseInt(id);
			this.fornecedor = fornecedor;
			this.produto = produto;
			this.preco = Double.parseDouble(df.parse(preco).toString());
			maisBarato = true;
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
	
	public Orcamento(String linha) {
		df.setCurrency(Currency.getInstance(BRASIL));
		try {
			this.id = Integer.parseInt(linha.split(";")[0]);
			this.fornecedor = linha.split(";")[1];
			this.produto = linha.split(";")[2];
			this.preco = Double.parseDouble(df.parse(linha.split(";")[3]).toString());
			maisBarato = true;
		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	public Orcamento(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}
	
	public String getPreco(String s) {
		return df.format(preco);
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isMaisBarato() {
		return maisBarato;
	}

	public void setMaisBarato(boolean maisBarato) {
		this.maisBarato = maisBarato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orcamento other = (Orcamento) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return id + "\t" + fornecedor + "\t" + produto + "\t" + getPreco("") + "\t" + maisBarato + "\n";
	}

	public String toCSV() {
		return id + ";" + fornecedor + ";" + produto + ";" + getPreco("") + "\r\n";
	}

	public String[] toVetor() {
		return new String[] {String.format("%d", id) ,fornecedor , produto , getPreco("")};
	}
}
