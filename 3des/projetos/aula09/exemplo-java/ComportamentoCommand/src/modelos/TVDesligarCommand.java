package modelos;

public class TVDesligarCommand implements Command{

	TV tv;

	public TVDesligarCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.desligar();		
	}
	
}
