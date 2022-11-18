package exemplo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {

	static BufferedReader br;
	
	public static void main(String[] args) {
		
		try {
			//Abrir o arquivo para leitura
			br = new BufferedReader(new FileReader("./bd/dados.txt"));
			//Lê o aquivo linha por linha
			String linha  = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			//Fecha o arquivo
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: "+e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: "+e);
		}

	}

}
