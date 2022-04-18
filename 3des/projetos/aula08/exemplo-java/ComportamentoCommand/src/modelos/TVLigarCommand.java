package modelos;

public class TVLigarCommand implements Command {

	TV tv;

	public TVLigarCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.ligar();
		tv.configuraCanal(2);
		tv.configuraVolume(100);
	}

}
