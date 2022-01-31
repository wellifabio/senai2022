package exercicios;

import java.time.Year;
import java.util.Scanner;

public class ClassificaIdade {
	public static void main(String[] args) {
		//Variáveis
		Scanner read = new Scanner(System.in);
		int ano, idade;
		int anoAtual = Year.now().getValue();
		
		//Entrada
		System.out.print("Digite o ano em que você nasceu: ");
		ano = read.nextInt();
		
		//Processamento 1
		idade = anoAtual - ano;
		
		//Processamento 2 e Saída
		if(idade < 10) {
			System.out.println("Vocé é uma criança");
		}else if(idade < 15) {
			System.out.println("Vocé é um(a) adolescente");
		}else if(idade < 18) {
			System.out.println("Vocé é um(a) Jovem");
		}else if(idade < 50) {
			System.out.println("Vocé é um(a) adulto");
		}else if(idade < 100) {
			System.out.println("Vocé é um(a) idoso");
		}else {
			System.out.println("Vocé passou da idade");
		}
		
	}
}
