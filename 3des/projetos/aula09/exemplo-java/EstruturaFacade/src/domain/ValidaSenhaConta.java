package domain;

public class ValidaSenhaConta {

	private int senha = 1234;

	public int getSenha() {
		return senha;
	}

	public boolean senhaCorreta(int senha) {
		if (senha == getSenha()) {
			return true;
		} else {
			return false;
		}
	}
}
