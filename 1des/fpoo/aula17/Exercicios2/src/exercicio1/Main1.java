package exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {

	static BufferedReader br;
	static int i = 0;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./bd/dados1.txt"));
			System.out.println("Nome\tQtd. de Letras\tPalavras");
			String linha = br.readLine();
			while (linha != null) {
				System.out.print(linha);
				System.out.print("\t" + linha.length());
				System.out.println("\t" + linha.split(" ").length);
				i++;
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("O arquivo possui %d linhas", i);
	}

}
