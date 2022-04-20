package modelos;

public class CasaBuilder {

	//Atributos encapsulados
	private int numero;
	private String descricao;
	private int nComodos;
	private float peDireito;
	
	//Gets alterado o retorno de void para a própria classe
	public CasaBuilder setNumero(int numero) {
		this.numero = numero;
		return this;
	}
	public CasaBuilder setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	public CasaBuilder setnComodos(int nComodos) {
		this.nComodos = nComodos;
		return this;
	}
	public CasaBuilder setPeDireito(float peDireito) {
		this.peDireito = peDireito;
		return this;
	}
	
	//Um método Get da Classe inteira
	public Casa getCasa() {
		return new Casa(numero,descricao,nComodos,peDireito);
	}
	
}
