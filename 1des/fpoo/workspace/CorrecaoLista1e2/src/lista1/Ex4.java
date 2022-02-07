package lista1;

import java.util.Scanner;

/*Sabendo-se que a velocidade de cruzeiro de um avião 747-300
 *é de 900 km/h, faça um programa que leia uma distância (km),
 *calcule e apresente na tela, quanto tempo (horas)
 *será necessário para um 747-300 sobrevoar a
 *distância informada.*/
public class Ex4 {

	public static int VELCRUZ = 900;
	
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.print("Digite a distância em Km: ");
		int distancia = info.nextInt();
		
		int tempo = distancia / VELCRUZ;
		
		System.out.println("O tempo gasto será de "+tempo+" horas.");
	}
}
