package exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	static BufferedReader br;
	static int i = 1;
	static Veiculo v;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./bd/dados2.csv"));
			String linha = br.readLine(); //Lê a primeira linha
			System.out.println(new Veiculo().rotulos());
			linha = br.readLine(); //Lê a segunda linha
			while (linha != null) {//Lê as outras linhas
				v = new Veiculo(linha);
				System.out.println(v);
				i++;
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("O arquivo possui %d linhas e três colunas\n", i);
	}

}
