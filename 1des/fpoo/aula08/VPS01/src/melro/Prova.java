package melro;

import java.util.Scanner;
public class Prova {

	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int menu =0;		
		System.out.println("1. Horas Extras");;
		System.out.println("2. Apuração");
		System.out.println("3. Matérias Primas");
		System.out.println("4. Blocos");
		System.out.println("5. Sair");		
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Horas Extras");
			double salario ,salarioR, HT = 5.625, HEX = HT * 0.75;
			int th, exh ; 
			System.out.println("Horas que vc trabalha por mês? ");
			th = sc.nextInt();
			System.out.println("Horas extras que vc trabalhou esse mês? ");
			exh = sc.nextInt();
			salario = th * HT;
			salarioR = salario + (exh * HEX);
			System.out.printf("Valor do seu salario: R$%.2f", salario);
			System.out.printf("Reajuste do seu salarío com horas extras: R$%.2f", salarioR);
			break;
		case 2:
			System.out.println("|Apuração|");
			int size = 6;		
			String[] excolas = new String[size];
			int[] pB = new int[size];
			int[] pS = new int[size];
			int[] pF = new int[size];
			int[] media = new int[size];		
			for(int i = 1; i < size; i++) {
				System.out.println("Nome da[" + i + "°] escola: ");
				excolas[i] = sc.next();
				System.out.println("Pontos de Bateria de 0 a 10: ");
				pB[i] = sc.nextInt();
				System.out.println("Pontos de Samba-Enredo de 0 a 10: ");
				pS[i] = sc.nextInt();
				System.out.println("Pontos de Fantasias de 0 a 10: ");
				pF[i] = sc.nextInt();				
			}
			for(int i = 1; i < size; i++) {
				media[i] = pB[i] + pS[i] + pF[i] / 3; 
				}
			for(int i = 1; i < size; i++) {
				System.out.println("Ex-cola " +excolas[i]+ " com média de pontos: "+media[i]);
			}
				if (media[1] > media[2] && media[1] > media[3] && media[1] > media[4] && media[1] > media[5]) {
					System.out.println("Excola " +excolas[1]+ " é a campeã");
				} else if (media[2] > media[1] && media[2] > media[3] && media[2] > media[4] && media[2] > media[5]) {
					System.out.println("Excola " +excolas[2]+ " é a campeã");
				} else if (media[3] > media[1] && media[3] > media[2] && media[3] > media[4] && media[3] > media[5]) {
					System.out.println("Excola " +excolas[3]+ " é a campeã");
				}else if (media[4] > media[1] && media[4] > media[2] && media[4] > media[3] && media[4] > media[5]) {
					System.out.println("Excola " +excolas[4]+ " é a campeã");
				}else if (media[5] > media[1] && media[5] > media[2] && media[5] > media[3] && media[5] > media[4]) {
					System.out.println("Excola " +excolas[5]+ " é a campeã");
				}else {
					System.out.println("Impate.");
				}
		case 3:
			System.out.println("Matéria Prima");
			double peso, valorE, valorL, valorP, valorS;
			
			System.out.println("Insira o peso em KG dos materiais: ");
			peso = sc.nextFloat();
			System.out.println("Insira o valor estimado que gastará: ");
			valorE = sc.nextFloat();
			System.out.println("Insira o valor das lantejoulas: ");
			valorL = sc.nextFloat();
			System.out.println("Insira o valor das Penas de Avestruz do Himalaia: ");
			valorP = sc.nextDouble();
			System.out.println("Insira o valor da Seda Húngara");
			valorS = sc.nextDouble();			
			double valorT = valorL + valorP + valorS;
			System.out.printf("Total de R$%.2f\n", valorT);
			if(valorT>valorE) {
				System.out.println("O valor passa do estimado.");
			} else {
				System.out.println("Está dentro do orçamento.");
			} 
		case 4:
			int totalP, CF, AA, AB, CA, MS, PB, B, MB, RB;
			
			System.out.println("Pessoas Desfile");
			System.out.println("Digite o valor de pessoas do desfile: ");
			totalP = sc.nextInt();
			CF = (totalP / 100) * 15;
			AA = (totalP / 100) * 5;
			AB = (totalP / 100) * 15;
			CA = (totalP / 100) * 20;
			MS = (totalP / 100) * 3;
			PB = (totalP / 100) * 3;
			B = (totalP / 100) * 20;
			MB = (totalP / 100) * 2;
			RB = (totalP / 100) * 20;
			System.out.println("Pessoas da Comissão da Frente: " + CF);
			System.out.println("Pessoas da Abre-Alas: " + AA);
			System.out.println("Pessoas da Ala das Baianas: " + AB);
			System.out.println("Pessoas do Carros Alegóricos: " + CA);
			System.out.println("Pessoas do Mestre-sala: " + MS);
			System.out.println("Pessoas da Porta-Bandeira: " + PB);
			System.out.println("Pessoas da Bateria: " + B);
			System.out.println("Pessoas do Madrinha de Bateria: " + MB);
			System.out.println("Pessoas do Mestre-sala: " + RB);			
			break;
		case 5: 
			System.out.println("Tchau, obrigado pela preferência");
			break;
			default:
				System.out.println("Esta opções esta invalida");
				break;	
		} 
	}

}