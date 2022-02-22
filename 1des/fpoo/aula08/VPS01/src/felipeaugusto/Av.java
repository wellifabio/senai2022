package felipeaugusto;

import java.util.Scanner;
import java.io.IOException;

public class Av {

	public static Scanner scan;
	public static void main(String[] args)throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 5) {
			System.out.print("1-Horas Extras\n2-Apuração\n3-Matérias Primas\n4-Blocos\n5-Sair\n");
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				GeraSalarios();
				break;
			case 2:
				GerarSamba();
				break;
			case 3:
				GerarEscola();
				break;
			case 4:
				GerarBloco();
				break;
			case 5:
				System.out.print("Valews, falows.");
				break;
			default:
				System.out.print("Opção inválida.");
				break;
		}
	}
}

	public static void GeraSalarios() {
		scan = new Scanner(System.in);
		int h, he;
		double result, resultextra, salario;
		
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		System.out.println("Digite quantas horas você trabalhou");
		h = scan.nextInt();
		System.out.println("Digite quantas horas Extra você fez");
		he = scan.nextInt();
		
		result = h * 5.625;
		resultextra = he * 9.84375;
		salario = result + resultextra;
		
		System.out.println("O Funcionario "+ nome +" ira receber R$ "+ salario);
		
	}
	
	public static void GerarSamba() {
		scan = new Scanner(System.in);
		
		
		String[] nomes = new String[5];
		double[] pontobat = new double[5];
		double[] pontosamba = new double[5];
		double[] pontofan = new double[5];
		double[] notas = new double[5];
		
		for(int i = 0; i < 5; i++) {
		System.out.println("Digite o nome das escolas de samba: ");
		nomes[i] = scan.nextLine();
		
		}
		
		int maiormedId = 0;
		double maiormed = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("\nDigite as notas para a escola %s\n", nomes[i]);
			
			System.out.print("Bateria: ");
			pontobat[i] = scan.nextDouble();
			
			System.out.print("Samba-enredo: ");
			pontosamba[i] = scan.nextDouble();
			
			System.out.print("Fantasias: ");
			pontofan[1] = scan.nextDouble();
			
			notas[1] = (pontobat[i] + pontosamba[1] + pontofan[1])/3;
			
			if(notas[i] > maiormedId) {
				maiormed = notas[1];
				maiormedId = i;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.printf("Escola: %s\nBaterias: %.2f\nSamba-enredo: %.2f\nFantasias: %.2f\nMeida: %.2f\n\n", nomes[i], pontobat[i], pontosamba[i], pontofan[i], notas[i]);
			
		}
		System.out.println("Escola ganhadora: "+ nomes[maiormedId]);
	}
	
	public static void GerarEscola() {
		scan = new Scanner(System.in);
		
		String[] material = new String[4];
		double[] quilo = new double[4];
		double[] valor = new double[4];
		double[] valorestimado = new double[4];
		
		
		for(int i = 0; i < 4; i++) {
		System.out.println("Digite o nome do material utilizado: ");
		material[i] = scan.nextLine();
		
		}
		for(int i = 0; i < 4; i++) {
			System.out.printf("\nDigite o nome do material utilizado %s\n", material[i]);
			
			System.out.print("Quilos utilizado: ");
			quilo[i] = scan.nextDouble();
			
			System.out.print("Valor gasto: ");
			valor[i] = scan.nextDouble();
			
			System.out.print("Valor estimado: ");
			valorestimado[1] = scan.nextDouble();
			
		}
		
		for(int i = 0; i < 4; i++) {
			if(quilo[i] * valor[i] < valorestimado[i]) {
				System.out.println("O valor está dentro dos padrão estimado");
			}else if(quilo[i] * valor[i] > valorestimado[i]) {
				System.out.println("O valor excedeu o valor estimado");
			}
			
		}
		
		
		
	}
	
	public static void GerarBloco() {
		scan = new Scanner(System.in);
		
		System.out.println("Digite quantas pessoas irão participar");
		int total = scan.nextInt();
		
		int comi = (total * 15)/100;
		int abre = (total * 5)/100;
		int ala = (total * 15)/100;
		int carros = (total * 20)/100;
		int sala = (total * 3)/100;
		int bateria = (total * 20)/100;
		int madrinha = (total * 2)/100;
		int recuo = (total * 20)/100;
		
		System.out.println("Irão no bloco Comissão de frente: "+ comi +"\nAbre-Alas: "+ abre +"\nAla das baianas: "+ ala +"\nCarros alegóricos: "+ carros +"\nMestre-sala e Porta-bandeira: "+ sala +"\nBateria: "+ bateria +"\nMadrinha de bateria: "+ madrinha +"\nRecuo da bateria: " + recuo + "\n\n");
	}

}

