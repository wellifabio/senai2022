package gabrielmelo;

import java.io.IOException;
import java.util.Scanner;

public class Avaliacao2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 5) {
			System.out.println("1 - Horas Extras\n2 - Apuração\n3 - Matérias Primas\n4 - Blocos\n5 - Sair");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("|Horas Extras|");
				double valorH = 5.625, valorHEX = valorH * 0.75, salario, salarioR;
				int totalH, totalHEX;
				
				System.out.println("Informe o total de horas trabalhadas no mês: ");
				totalH = sc.nextInt();
				System.out.println("Informe o total de horas extras trabalhadas no mês: ");
				totalHEX = sc.nextInt();
				
				salario = totalH * valorH;
				salarioR = salario + (totalHEX * valorHEX);
				
				System.out.printf("Salário: R$%.2f\n", salario);
				System.out.printf("Salário reajustado com as horas extras: R$%.2f\n", salarioR);
				
				break;
			case 2:
				System.out.println("|Apuração|");
				int size = 6;
				
				String[] escolas = new String[size];
				int[] pontosB = new int[size];
				int[] pontosS = new int[size];
				int[] pontosF = new int[size];
				int[] media = new int[size];
				
				for(int i = 1; i < size; i++) {
					System.out.println("Nome da[" + i + "°] escola: ");
					escolas[i] = sc.next();
					System.out.println("Pontos de Bateria de 0 a 10: ");
					pontosB[i] = sc.nextInt();
					System.out.println("Pontos de Samba-Enredo de 0 a 10: ");
					pontosS[i] = sc.nextInt();
					System.out.println("Pontos de Fantasias de 0 a 10: ");
					pontosF[i] = sc.nextInt();
					
				}
				for(int i = 1; i < size; i++) {
					media[i] = pontosB[i] + pontosS[i] + pontosF[i] / 3; 
					}
				for(int i = 1; i < size; i++) {
					System.out.println("Escola " +escolas[i]+ " com média de pontos: "+media[i]);
				}
					if (media[1] > media[2] && media[1] > media[3] && media[1] > media[4] && media[1] > media[5]) {
						System.out.println("Escola " +escolas[1]+ " é a campeã");
					} else if (media[2] > media[1] && media[2] > media[3] && media[2] > media[4] && media[2] > media[5]) {
						System.out.println("Escola " +escolas[2]+ " é a campeã");
					} else if (media[3] > media[1] && media[3] > media[2] && media[3] > media[4] && media[3] > media[5]) {
						System.out.println("Escola " +escolas[3]+ " é a campeã");
					}else if (media[4] > media[1] && media[4] > media[2] && media[4] > media[3] && media[4] > media[5]) {
						System.out.println("Escola " +escolas[4]+ " é a campeã");
					}else if (media[5] > media[1] && media[5] > media[2] && media[5] > media[3] && media[5] > media[4]) {
						System.out.println("Escola " +escolas[5]+ " é a campeã");
					}else {
						System.out.println("Empate.");
					}
				
				break;
			case 3:
				System.out.println("|Matérias Primas|");
				float peso, valorE, valorLan, valorP, valorS;
				
				System.out.println("Digite o peso em KG dos materiais: ");
				peso = sc.nextFloat();
				System.out.println("Digite o valor estimado que quer gastar: ");
				valorE = sc.nextFloat();
				System.out.println("Digite o valor das lantejoulas: ");
				valorLan = sc.nextFloat();
				System.out.println("Digite o valor das Penas de Avestruz do Himalaia: ");
				valorP = sc.nextFloat();
				System.out.println("Digite o valor da Seda Húngara");
				valorS = sc.nextFloat();
				
				float valorTotal = valorLan + valorP + valorS;
				System.out.printf("Total de R$%.2f\n", valorTotal);
				if(valorTotal>valorE) {
					System.out.println("O valor passa do estimado.");
				} else {
					System.out.println("Está dentro do orçamento.");
				}
				break;
			case 4:
				System.out.println("|Bloco|");
				int totalPessoas; 
				double comissaoF, abreA, alaB, carAleg, mestreS, portaB, bateria, madriBateria, recuoB;
				
				System.out.println("Quantas pessoas irão participar do desfile? ");
				totalPessoas = sc.nextInt();
				
				comissaoF = totalPessoas * 0.15;
				abreA = totalPessoas * 0.5;
				alaB = totalPessoas * 0.15;
				carAleg = totalPessoas * 0.20;
				mestreS = totalPessoas * 0.3;
				portaB = totalPessoas * 0.3;
				bateria = totalPessoas * 0.20;
				madriBateria = totalPessoas * 0.2;
				recuoB = totalPessoas * 0.20;
				
				System.out.println("Quantidade de pessoas do bloco Comissão da Frente: " + comissaoF);
				System.out.println("Quantidade de pessoas do bloco Abre-Alas: " + abreA);
				System.out.println("Quantidade de pessoas do bloco Ala das Baianas: " + alaB);
				System.out.println("Quantidade de pessoas do bloco Carros Alegóricos: " + carAleg);
				System.out.println("Quantidade de pessoas do bloco Mestre-sala: " + mestreS);
				System.out.println("Quantidade de pessoas do bloco Porta-Bandeira: " + portaB);
				System.out.println("Quantidade de pessoas do bloco Bateria: " + bateria);
				System.out.println("Quantidade de pessoas do bloco Madrinha de Bateria: " + madriBateria);
				System.out.println("Quantidade de pessoas do bloco Recuo da Bateria: " + recuoB);
				break;
			case 5:
				System.out.println("Vlw, Flw!");
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
