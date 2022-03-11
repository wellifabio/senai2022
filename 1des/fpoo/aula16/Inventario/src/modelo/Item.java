package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
	
	//Atributos
	public String nome;
	public String local;
	public double valor;
	public Date dataCompra;
	
	//Atributo para formatar a Data em dia / mês / ano
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	//Metodos
	
	//Notação de método obsoleto
	@SuppressWarnings("deprecation") 
	public int idadeDoItem() {
		Date hoje = new Date();
		return hoje.getYear() - dataCompra.getYear();
	}
	
	//Método que mostra todo o objeto de uma só vez
	public String paraString() {
		return nome + "\t" + local + "\t" + String.format("%.2f", valor) + "\t" + df.format(dataCompra)+"\t"+idadeDoItem();
	} 
	
}