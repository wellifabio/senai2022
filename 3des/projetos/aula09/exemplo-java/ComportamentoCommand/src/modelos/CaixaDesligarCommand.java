package modelos;

public class CaixaDesligarCommand implements Command {

	CaixaDeSom caixa;
	
	public CaixaDesligarCommand(CaixaDeSom caixa) {
		this.caixa = caixa;
	}

	@Override
	public void executar() {
		caixa.desligar();
	}

}
