package exercicio3;

public class Veiculo {

	//Atributos
	private String modelo;
	private int ano;
	private double valor;
	//Construtor Vazio
	public Veiculo() {
	}
	//Construtor cheio, porém recebendo como parâmetro apenas uma String linha
	public Veiculo(String linha) {
		String[] colunas = linha.split(",");//Esplode a linha
		this.modelo = colunas[0];
		this.ano = Integer.parseInt(colunas[1]); //Converte para inteiro
		this.valor = Double.parseDouble(colunas[2]); //Converte para Double
	}
	
	//Getters	
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	public double getValor() {
		return valor;
	}
	//Método que retorna o cabeçalho
	public String rotulos() { 
		return "Veículo\tAno\tValor";
	}
	@Override
	public String toString() { //Método de saída da classe
		return String.format("%s\t%d\t%.2f", modelo, ano, valor);
	}

}
