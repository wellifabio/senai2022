package exemplo;

/*
 * Todo arquivo é tratado como Texto (String)
 * Para fazer cálculos é preciso converter a coluna para int, float, double
 * Integer.parseInt()
 * Float.parseFloat()
 * Double.parseDouble()
 * */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivoCalcula {

	static BufferedReader br;
	
	public static void main(String[] args) {
		
		int i = 0;
		float total = 0;
		float caro = 0;
		float barato = 1000000;
				
		try {
			br = new BufferedReader(new FileReader("./bd/dados.txt"));
			String linha  = br.readLine();
			while(linha != null) {
				String vetor[] = linha.split("-");
				System.out.println(vetor[0]+"\t"+vetor[1]);
				if(i != 0) {
					float preco = 0;
					preco = Float.parseFloat(vetor[1]);
					if(caro < preco) caro = preco;
					if(barato > preco) barato = preco;
					total+=preco;
				}
				i++;
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: "+e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: "+e);
		}
		
		System.out.printf("Total de preços = %.2f\n",total);
		System.out.printf("A média de preços = %.2f\n",total/i);
		System.out.printf("A produto mais caro é = %.2f\n",caro);
		System.out.printf("A produto mais barato = %.2f\n",barato);

	}

}
