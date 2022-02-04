package lista1;
/*
 * Um caminhão consegue transportar 18 toneladas de laranjas
 * em uma viagem que faz entre a fazenda e a fábrica de suco de laranja.
 * Um alqueire de terra produz em média 250 toneladas de laranjas.
 * Faça um programa que leia quantos caminhões
 * e quantos alqueires uma fazenda produtora de laranjas possui,
 * calcule e apresente na tela quantas viagens de caminhão serão necessárias
 * para transportar toda a colheita de laranjas.
 * */

import java.io.IOException;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		int tonCaminhao = 18;
		int tonAlqueire = 250;
		int caminhoes;
		int alqueires;
		int viagens;
		
		//Entrada
		System.out.print("Quantos caminhões você possui: ");
		caminhoes = read.nextInt();
		System.out.print("Quantos alqueires você possui: ");
		alqueires = read.nextInt();
		
		//Processamento
		int producao = alqueires * tonAlqueire;
		int carga = caminhoes * tonCaminhao;
		viagens = (int) Math.ceil(producao / carga);//Arredonda para cima
		
		//Saída
		System.out.printf("Você precisará de %d viagens.",viagens);

	}

}
