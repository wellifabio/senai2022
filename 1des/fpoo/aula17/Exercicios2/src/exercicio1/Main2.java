package exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	static BufferedReader br;
	static int i = 0;
	static Pessoa p;
	
	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./bd/dados1.txt"));
			p = new Pessoa(br.readLine());
			while (p.getNome() != null) {
				System.out.println(p);
				i++;
				p = new Pessoa(br.readLine());
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
