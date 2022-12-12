package modelo;

public class Login {

	private String nome;
	private String senha;

	public Login(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public Login(String linha) {
		this.nome = linha.split(";")[0];
		this.senha = linha.split(";")[1];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
