package modelos;

public class CaixaDeSom {

	public boolean status;
	
	public void ligar() {
		System.out.println("Caixa ligada");
		status = true;
	}

	public void desligar() {
		System.out.println("Caixa desligada");
		status = false;
	}

	public void configuraCanal(int canalPadrao) {
		System.out.println("Caixa está configurada no canal " + canalPadrao);
	}

	public void configuraVolume(int volume) {
		System.out.println("Caixa está configurada no volume " + volume);
	}

}
