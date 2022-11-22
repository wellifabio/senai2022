package exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {

	static BufferedReader br;
	static int i = 0;
	static int cols = 0;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./bd/dados2.csv"));
			String linha = br.readLine(); //Lê a primeira linha
			String colss[] = linha.split(","); //Separa pelas vírgulas
			//Mostra a primeira linha, Rótulos ou Cabeçalho
			System.out.printf("%s\t%s\t%s\n", colss[0], colss[1], colss[2]);
			cols = colss.length; //Contar quantas colunas
			linha = br.readLine(); //Lê a próxima linha
			while (linha != null) {
				String colunas[] = linha.split(",");
				int ano = Integer.parseInt(colunas[1]);
				float valor = Float.parseFloat(colunas[2]);
				System.out.printf("%s\t%d\t%.2f\n", colunas[0], ano, valor);
				i++;//Contador de linhas
				linha = br.readLine();//Lê a próxima linha
			}
			br.close();//Fecha o arquivo
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("O arquivo possui %d linhas\n", i);
		System.out.printf("O arquivo possui %d colunas\n", cols);

	}

}
