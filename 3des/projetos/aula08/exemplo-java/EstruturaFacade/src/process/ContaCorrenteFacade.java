package process;

import domain.BoasVindas;
import domain.ValidaNumeroConta;
import domain.ValidaSaldoConta;
import domain.ValidaSenhaConta;

public class ContaCorrenteFacade {

	private int numero;
	private int senha;

	BoasVindas bemVindo;
	ValidaNumeroConta validarNumero;
	ValidaSenhaConta validarSenha;
	ValidaSaldoConta validarSaldo;

	public ContaCorrenteFacade(int numero, int senha) {
		this.numero = numero;
		this.senha = senha;
		bemVindo = new BoasVindas();
		validarNumero = new ValidaNumeroConta();
		validarSenha = new ValidaSenhaConta();
		validarSaldo = new ValidaSaldoConta();
	}

	public int getNumero() {
		return numero;
	}

	public int getSenha() {
		return senha;
	}

	public void sacar(double dinheiro) {
		if (validarNumero.contaAtiva(getNumero()) && validarSenha.senhaCorreta(getSenha())
				&& validarSaldo.fazerSaque(dinheiro)) {
			System.out.println("Transação completa \n");
		} else {
			System.out.println("Falha ao executar transação \n");
		}
	}

	public void depositar(double dinheiro) {
		if (validarNumero.contaAtiva(getNumero()) && validarSenha.senhaCorreta(getSenha())) {
			validarSaldo.fazerDeposito(dinheiro);
			System.out.println("Transação completa \n");
		} else {
			System.out.println("Falha ao executar transação \n");
		}
	}

}
