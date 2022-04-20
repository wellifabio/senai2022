package modelos;

public class TV {
	
	public boolean status;
	
	public void ligar() {
		System.out.println("TV Ligada");
		status = true;
	}

	public void desligar() {
		System.out.println("TV desligada");
		status = false;
	}
	
	public void configuraCanal(int canalPadrao) {
		System.out.println("A TV está configurada no canal " + canalPadrao);
	}

	public void configuraVolume(int volume) {
		System.out.println("A TV está configurada no volume " + volume);
	}
}
