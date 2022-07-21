package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aparelho {

	//Atributos encapsulados
	private String nome;
	private String tipoExecicio;
	private String grupoMuscular;
	private Date dataAquisicao;
	private double valorAquisicao;

	//Atributo não encapsulado
	private int tempoDepreciacao;

	//Métodos de acesso quanto utilizamos encapsulamento
	public void setTempoDepreciacao(int tempoDepreciacao) {
		this.tempoDepreciacao = tempoDepreciacao;
	}
	
	public int getTempoDepreciacao() {
		return tempoDepreciacao;
	}
	
	//Atrinutos de auxílio
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	
	//Métodos
	//Construtores
	public Aparelho() {
	}

	public Aparelho(String nome, String tipoExecicio, String grupoMuscular, String dataAquisicao, double valorAquisicao)
			throws ParseException {
		this.nome = nome;
		this.tipoExecicio = tipoExecicio;
		this.grupoMuscular = grupoMuscular;
		this.dataAquisicao = df.parse(dataAquisicao);
		this.valorAquisicao = valorAquisicao;
	}

	//Calcular o tempo de uso
	public int tempoUso() {
		Date hoje =  new Date();
		return hoje.getYear() - dataAquisicao.getYear();
	}
	
	public double depreciacao() {
		return valorAquisicao / tempoDepreciacao * tempoUso();
	}
	
	public double valorDepreciado() {
		return valorAquisicao - depreciacao();
	}

	//Saídas
	@Override
	public String toString() {
		return nome + "\t" + tipoExecicio + "\t" + grupoMuscular + "\t" + df.format(dataAquisicao) + "\t"
				+ valorAquisicao + "\t" + tempoUso() + "\t" + depreciacao() + "\t" + valorDepreciado();
	}
	
}
