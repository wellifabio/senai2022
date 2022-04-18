package domain;

public class ValidaSaldoConta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void diminuirSaldo(double dinheiro) {
		saldo -= dinheiro;
	}
	public void aumentarSaldo(double dinheiro) {
		saldo += dinheiro;
	}
	
	public boolean fazerSaque(double dinheiro) {
		if (dinheiro > getSaldo()) {
			System.out.println("Erro: Saldo insuficiente");
			System.out.println("Saldo atual: "+getSaldo());
			return false;
		} else {
			diminuirSaldo(dinheiro);
			System.out.println("Saque realizaro com sucesso.");
			System.out.println("Saldo atual: "+getSaldo());
			return true;
		}
	}
	
	public void fazerDeposito(double dinheiro) {
		aumentarSaldo(dinheiro);
		System.out.println("Deposito realizado com sucesso: Saldo atual:"+getSaldo());
	}
}
