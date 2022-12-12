package modelo;

public class Login {

	private String nome;
	private String senha;

	public Login(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
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

	public boolean sucesso() {
		if(this.nome.equals("admin") && this.senha.equals("1234"))
			return true;
		else
			return false;
	}

}
