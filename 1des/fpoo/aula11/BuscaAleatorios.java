package modelo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BuscaAleatorios {
	
	static Random r = new Random();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		System.out.print("Digite quantos números deseja:");
		int n = scan.nextInt();
		int dados[] = numerosAleatorios(n);
		System.out.print("Digite o número que deseja buscar:");
		int b = scan.nextInt();
		mostrarDados(dados);
		boolean resultado = buscaSimples(dados,b);
		System.out.println("A busca obteve sucesso? "+resultado);
		
		//1 - Faça uma busca que ao encontrar retorne
		//em qual posição do vetor o valor foi encontrado
		
		//2 - Faça uma busca que caso encontre o valor
		//em mais de uma posição no vetor
		//retorne quantas vezes o valor foi encontrado
		
		//3 - Faça uma busca que caso encontre o valor
		//em mais de uma posição no vetor
		//Retorne em quais posições encontrou
		
		//4 - Faca um método que gere uma matriz aleatória
		//que receba como parâmetro o número de
		//linhas e colunas
		
		//5 - Faça um método que mostre a matriz
		//Ele deve receber a matriz como parâmetro
		//e deve mostrá-la na tela
		
		//Faça os desafios 2 e 3 só que com matriz
		
	}

	//Este método retorna um valor booleando V ou F
	//Recebe um vetor como parâmetro com dados
	//E um valor b a ser procurado
	private static boolean buscaSimples(int[] dados, int b) {
		for(int i = 0; i < dados.length; i++)
			if(dados[i] == b)
				return true;
		return false;
	}

	//Métodos que não retornam nada, só fazem alguma coisa
	//Também são conhecidos como procedimento
	private static void mostrarDados(int[] dados) {
		for(int i = 0; i < dados.length; i++)
			System.out.println(dados[i]);
	}

	//Este método recebe um parâmetro inteiro
	//E retorna n números aleatórios em forma de vetor
	private static int[] numerosAleatorios(int n) {
		int[] x = new int[n];
		for(int i = 0; i < n; i++)
			x[i] = r.nextInt(1000);
		return x;
	}
}
