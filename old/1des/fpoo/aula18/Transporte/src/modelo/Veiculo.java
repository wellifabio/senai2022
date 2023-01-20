package modelo;

public class Veiculo {
	
	public String placa;
	public String marca;
	public String modelo;
	public int anoModelo;
	public int anoFabricacao;
	public String cor;
	
	public Veiculo() {		
	}

	public Veiculo(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String cor) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoModelo=" + anoModelo
				+ ", anoFabricacao=" + anoFabricacao + ", cor=" + cor + "]";
	}

}
