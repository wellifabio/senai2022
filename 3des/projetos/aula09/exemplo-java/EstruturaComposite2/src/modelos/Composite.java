package modelos;

import java.util.ArrayList;
import java.util.List;

//Compositor = compõe todas as partes
public class Composite implements Componente {

	private String nome;
	private float preco;
	private List<Componente> componentes =  new ArrayList<>();

	//Método que adiciona um componente a lista de componentes
	public void adicionarComponente(Componente teclado) {
		componentes.add(teclado);
	}
	
	@Override
	public void mostrarPreco() {
		System.out.println("Nome: "+nome);
		if(preco != 0) {
			System.out.println("\tPreco: "+preco);	
		}
		for(Componente d: componentes) {
			System.out.print("\t");
			d.mostrarPreco();
		}
	}
	
	//Construtor com apenas o campo nome
	public Composite(String nome) {
		this.nome = nome;
	}

	//GETs && SETs
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
