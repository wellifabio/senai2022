package lista1;

import java.io.IOException;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		int k = 10, m2;
		double custoUni = 130.00;
		double metros = 3.7;
		
		//Entrada
		System.out.print("Digite quantos m2 deseja revestir:");
		m2 = read.nextInt();
		
		//Processamento
		int pcotes = (int) Math.ceil(m2 / metros);
		double custo = pcotes * custoUni;
		
		//Saída
		System.out.printf("Você precisará de %d pacotes.\n",pcotes);
		System.out.printf("O que custará %.2f pacotes.\n",custo);
	}

}
