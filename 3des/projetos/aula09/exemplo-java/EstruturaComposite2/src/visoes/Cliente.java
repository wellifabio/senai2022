package visoes;

import modelos.Pecas;
import modelos.Componente;
import modelos.Composite;

public class Cliente {
	
	//Partes finais
	private static Componente hd;
	private static Componente teclado;
	private static Componente mouse;
	private static Componente monitor;
	private static Componente ram;
	private static Componente cpu;
	
	//SubGrupos
	private static Composite perifericos;
	private static Composite placaMae;
	private static Composite gabinete;
	
	//Grupo Final
	private static Composite computador;

	public static void main(String[] args) {
		
		//Partes finais
		hd = new Pecas("HDD",(float)480.99);
		teclado = new Pecas("Teclado",(float)25.90);
		mouse = new Pecas("mouse",(float)7.5);
		monitor = new Pecas("Monitor LG 19'",525);
		ram = new Pecas("RAM DDR3",(float)225.5);
		cpu = new Pecas("Processador",630);
		
		//SubGrupos
		perifericos = new Composite("Periferios"); 
		placaMae = new Composite("Placa Mãe");
		placaMae.setPreco((float)325.9);
		gabinete = new Composite("Gabinete");
		gabinete.setPreco((float)89.9);
		
		//Grupo final
		computador = new Composite("Computador");
		
		//Compor as partes
		perifericos.adicionarComponente(teclado);
		perifericos.adicionarComponente(mouse);
		perifericos.adicionarComponente(monitor);
		placaMae.adicionarComponente(cpu);
		placaMae.adicionarComponente(ram);
		gabinete.adicionarComponente(placaMae);
		gabinete.adicionarComponente(hd);
		computador.adicionarComponente(perifericos);
		computador.adicionarComponente(gabinete);
		
		computador.mostrarPreco();
		
	}

}
