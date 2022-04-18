package domain;

public class ValidaNumeroConta {

	private int numeroConta = 12345678;

	public int getNumeroConta() {
		return numeroConta;
	}

	public boolean contaAtiva(int conta) {
		if (conta == getNumeroConta()) {
			return true;
		} else {
			return false;
		}
	}

}
