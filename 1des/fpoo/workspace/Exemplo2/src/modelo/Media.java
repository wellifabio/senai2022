package modelo;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		float n1, n2, media;
		String conceito = null;
		
		//Entrada
		System.out.print("Digite 1º nota: ");
		n1 = leia.nextFloat();
		System.out.print("Digite 2º nota: ");
		n2 = leia.nextFloat();
		
		//Processamento
		media = (n1 + n2) / 2;
		if(media >= 5) {
			conceito = "Aprovado";
		}else {
			conceito = "Reprovado";
		}

		//Saída
		System.out.println("A media é "+media);
		System.out.println("O aluno foi  "+conceito);
	}
	
}
