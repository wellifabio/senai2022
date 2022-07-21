package lista1;

import java.util.Scanner;

/*Desenvolva um programa que leia a
 * velocidade de um carro (km/h) e a
 * distância(Km) a ser per-corrida (km)
 * por ele. Calcule e apresente na tela,
 * quanto tempo (horas) será necessário
 * para o carro percorrer a distância
 * informada*/
public class Ex2 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.print("Velocidade Km/h: ");
		int velocidade = info.nextInt();
		System.out.print("Distância Km: ");
		int distancia = info.nextInt();
		
		int tempo = distancia / velocidade;
		
		System.out.print("O tempo gasto será de: "+tempo+" horas");
	}
}
