package agenda;

public class Contato {

	//Atributos
	public int id;
	public String nome;
	public int idade;
	public String telefone;
	
	//Método Contrutor vazio
	Contato(){}
	
	//Método Contrutor completo
	Contato(int id, String nome, int idade, String telefone){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	//Método simples
	public String contatoTab() {
		return id+"\t"+nome+"\t"+idade+"\t"+telefone;
	}

}
