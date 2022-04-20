package modelos;

//Classe padrão exemplo
public class Casa {
	
	//Atributos encapsulados
	private int numero;
	private String descricao;
	private int nComodos;
	private float peDireito;
	
	//Método construtor com todos os atributos
	public Casa(int numero, String descricao, int nComodos, float peDireito) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.nComodos = nComodos;
		this.peDireito = peDireito;
	}
	
	//GETs && SETs
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getnComodos() {
		return nComodos;
	}
	public void setnComodos(int nComodos) {
		this.nComodos = nComodos;
	}
	public float getPeDireito() {
		return peDireito;
	}
	public void setPeDireito(float peDireito) {
		this.peDireito = peDireito;
	}
	
	//toString serve para exibir o objeto
	@Override
	public String toString() {
		return "Casa [numero=" + numero + ", descricao=" + descricao + ", nComodos=" + nComodos + ", peDireito="
				+ peDireito + "]";
	}
	
}
