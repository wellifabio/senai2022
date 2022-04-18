package modelos;

public class CaixaLigarCommand implements Command{

	CaixaDeSom caixa;
	
	public CaixaLigarCommand(CaixaDeSom caixa) {
		this.caixa = caixa;
	}
	
	@Override
	public void executar() {
		caixa.ligar();
		caixa.configuraCanal(1);
		caixa.configuraVolume(70);
	}

}
