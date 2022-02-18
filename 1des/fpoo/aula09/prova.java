package prova;

import java.util.Scanner;

public class prova {
//	Você foi contratado para desenvolver soluções para a equipe organizadora do carnaval do Rio de Jaqueiro, para isso deve desenvolver um programa que solucione os quatro requisitos a seguir.
//	O programa deve contar com uma estrutura de menu (Utilizando Switch/Case), onde o usuário selecione o problema a ser resolvido;
//	(1 Horas Extras, 2 Apuração, 3 Matérias Primas, 4 Blocos, 5 Sair)
	public static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 5) {
			mostrarOpcoes();
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1: 
					calcularHorasExtras();
					break;
				case 2: 
					calcularApuracao();
					break;
				case 3: 
					calcularMateriasPrimas();
					break;
				case 4:
					calcularBlocos();
					break;
					
			}//Fechamento do switch case
		}//Fechamento while
	}//Fechamento metodo main
	
	
//	1 – A escola de samba unidos do JAVA está com 
//	dificuldade para gerenciar o pagamento de seus 
//	funcionários, devido ao aumento das horas extras. 
//	Para auxiliá-los crie um algoritmo que receba o 
//	total de horas e horas extras trabalhadas no mês 
//	e informe o valor do salário reajustado. Leve 
//	em consideração que todos recebem em média R$ 5,625 
//	por hora trabalhada e que a hora extra vale 75% a 
//	mais do valor original.

	public static void calcularHorasExtras() {
		input = new Scanner(System.in);
		int opcao_horas = 0;
		
		while(opcao_horas != 2) {
			System.out.println("1. Calcular um novo funcionario. ");
			System.out.println("2. Voltar ao menu.");
			opcao_horas = input.nextInt();
			if(opcao_horas == 1) {
				System.out.println("Digite quantas horas foram trabalhadas.");
				int total_horas = input.nextInt();
				
				System.out.println("Digite quantas horas extras foram trabalhadas.");
				int horas_extras = input.nextInt();
				
				double salario = total_horas * 5.625;
				salario = salario + (horas_extras * (5.625*1.75));
				
				System.out.printf("O salario é: R$ %.2f\n", salario);
			}
		}
	}
	
	public static void calcularApuracao() {
		
	}
	
	public static void calcularMateriasPrimas() {
		
	}
	
	public static void calcularBlocos() {
		
	}
	
	public static void mostrarOpcoes() {
		String[] vetor_opcoes = new String[5];
		vetor_opcoes[0] = "1. Horas extras.";
		vetor_opcoes[1] = "2. Apuracao.";
		vetor_opcoes[2] = "3. Matérias primas.";
		vetor_opcoes[3] = "4. Blocos.";
		vetor_opcoes[4] = "5. Sair.";
		
		for(int i = 0; i < vetor_opcoes.length; i++) {
			System.out.println(vetor_opcoes[i]);
		}
	}
}
