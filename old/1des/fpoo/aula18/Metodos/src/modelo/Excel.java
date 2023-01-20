package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Excel {
	
	//Atributos
	private SimpleDateFormat dfAbnt = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat dfSimples = new SimpleDateFormat("dd/MM");
	private SimpleDateFormat hfAbnt = new SimpleDateFormat("HH:mm");
	private SimpleDateFormat hfAmPm = new SimpleDateFormat("hh:mm:aa");
	
	//Metodos
	public double soma(double valores[]) {
		double total = 0;
		for(int i = 0; i < valores.length; i++) {
			total = total + valores[i];
		}
		return total;
	}
	
	public double media(double valores[]) {
		double total = 0;
		for(int i = 0; i < valores.length; i++) {
			total = total + valores[i];
		}
		return total / valores.length;
	}
	
	public double maximo(double valores[]) {
		double max = 0;
		for(int i = 0; i < valores.length; i++) {
			if(max <= valores[i])
			max = valores[i];
		}
		return max;
	}
	
	public double minimo(double valores[]) {
		double min = soma(valores);
		for(int i = 0; i < valores.length; i++) {
			if(min >= valores[i])
			min = valores[i];
		}
		return min;
	}
	
	public String hoje() {
		Date data = new Date();
		return dfAbnt.format(data);
	}
	
	public String hojeSimples() {
		Date data = new Date();
		return dfSimples.format(data);
	}
	
	public String agora() {
		Date data = new Date();
		return hfAbnt.format(data);
	}
	
	public String agoraAmPm() {
		Date data = new Date();
		return hfAmPm.format(data);
	}
}
