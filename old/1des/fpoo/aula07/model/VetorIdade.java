package model;

import java.io.IOException;
import java.util.Scanner;

public class VetorIdade {

	public static void main(String[] args) throws IOException{

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quantas pessoas deseja classificar:");
		int comprimento = scan.nextInt();
		
		//Vetor
		String[] nomes = new String[comprimento];
		int[] idades = new int[comprimento];
		for(int i = 0; i < comprimento; i++) {
			System.out.print("Nome["+i+"]: ");
			nomes[i] = scan.next();
			System.out.print("Idade["+i+"]: ");
			idades[i] = scan.nextInt();
		}

		for(int i = 0; i < comprimento; i++) {
			if(idades[i]<10) {
				System.out.println(nomes[i]+" criança.");
			}else if(idades[i]<20) {
				System.out.println(nomes[i]+" Jovem.");
			}else {
				System.out.println(nomes[i]+" veio.");
			}
		}
		
	}

}
