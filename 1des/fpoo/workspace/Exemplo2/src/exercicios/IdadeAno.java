package exercicios;

import java.time.Year;
import java.util.Scanner;

public class IdadeAno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int ano, idade;
		int anoAtual = Year.now().getValue();
		
		System.out.print("Digite o ano em que você nasceu: ");
		ano = read.nextInt();
		
		idade = anoAtual - ano; 
		
		if(idade >= 18) {
			System.out.println("Você \"di maior\"");
		}else {
			System.out.println("Você \"di menor\"");
		}

	}

}
