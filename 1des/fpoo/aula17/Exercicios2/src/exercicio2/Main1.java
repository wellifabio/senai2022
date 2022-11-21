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
			System.out.println("Veículo\tAno\tValor");
			String linha = br.readLine();
			while (linha != null) {
				String colunas[] = linha.split(",");
				cols = colunas.length;
				if (i > 0) {
					int ano = Integer.parseInt(colunas[1]);
					float valor = Float.parseFloat(colunas[2]);
					System.out.printf("%s\t%d\t%.2f\n", colunas[0], ano, valor);
				}
				i++;
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("O arquivo possui %d linhas\n", i);
		System.out.printf("O arquivo possui %d colunas\n", cols);

	}

}
