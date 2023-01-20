package guilhermemendes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Prova {
	
	public static Scanner entrada;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("Selecione uma opção");
			System.out.println("1- Horas Extras\n2- Apuração\n3- Matérias Primas\n4- Blocos\n5- Sair\n");
			
			menu = entrada.nextInt();
			
			switch (menu) {
			case 1:
				
				horasExtras();
				
				break;
				
			case 2:
				
				apuracao();
				
				break;
				
			case 3:
				
				materiaPrima();
				
				break;
				
			case 4:
				
				blocos();
				
				break;
				
			default:
				System.out.println("Opção Inválida!");
			}
		} while(menu != 5);
		
		
		

	}
	
	public static void horasExtras() {
		entrada = new Scanner(System.in);
		System.out.println("Digite o total de horas comuns trabalhadas");
		int horas = entrada.nextInt();
		
		System.out.println("Digite o total de horas extras trabalhadas no mês");
		int horasE = entrada.nextInt();
		
		double salLiq = (horas * 5.625) + (horasE * (5.625 + (5.625 * 100/75)));
		
		df.setRoundingMode(RoundingMode.UP);
		System.out.printf("O salário reajustado é de R$ %s\n----------------------------------\n", df.format(salLiq));
		
	}
	
	public static void apuracao() {
		entrada = new Scanner(System.in);
		String[] escolas = new String[5];
		double[] notasBateria = new double[5];
		double[] notasSE = new double[5];
		double[] notasFantasias = new double[5];
		double[] medias = new double[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o nome da escola de samba: ");
			escolas[i] = entrada.nextLine();
			
		}
		
		int maiorMediaId = 0;
		double maiorMedia = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("\nDigite as notas para a escola %s\n", escolas[i]);
			
			System.out.print("Bateria: ");
			notasBateria[i] = entrada.nextDouble();
			
			System.out.print("Samba Enredo: ");
			notasSE[i] = entrada.nextDouble();
			
			System.out.print("Fantasias: ");
			notasFantasias[i] = entrada.nextDouble();
			
			medias[i] = (notasBateria[i] + notasSE[i] + notasFantasias[i])/3;
			
			if(medias[i] > maiorMedia) {
				maiorMedia = medias[i];
				maiorMediaId = i;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Escola: %s\nBateria: %.2f\nSamba Enredo: %.2f\nFantasias: %.2f\nMEDIA: %.2f\n\n", escolas[i], notasBateria[i], notasSE[i], notasFantasias[i], medias[i]);
		}
		
		System.out.println("ESCOLA CAMPEÃ: " + escolas[maiorMediaId] + "\n----------------------------------\n");
		
		
	}
	
	public static void materiaPrima() {
		entrada = new Scanner(System.in);
		String[] mats = new String[3];
		
		mats[0] = "Lantejoulas";
		mats[1] = "Pena de Avestruz do Himalaia";
		mats[2] = "Tecido de Seda Húngara";
		
		double[] qtdeKg = new double[3];
		double[] vl = new double[3];
		double[] vlEst = new double[3];
		boolean[] excede = new boolean[3];
		
		int maisCaraId = 0;
		double maisCara = 0;
		
		int segMaisCaraId = 0;
		double segMaisCara = 0;
		
		int terMaisCaraId = 0;
		double terMaisCara = 0;
		
		for (int i = 0; i < vlEst.length; i++) {
			System.out.println("\nDigite a quantidade em Kg de " + mats[i]);
			qtdeKg[i] = entrada.nextDouble();
			
			System.out.println("\nDigite o valor do Kg de " + mats[i]);
			vl[i] = entrada.nextDouble();
			
			System.out.println("\nDigite o valor estimado a ser gasto com " + mats[i]);
			vlEst[i] = entrada.nextDouble();
			
			
		}
		
		for (int i = 0; i < vlEst.length; i++) {
			if (vl[i]*qtdeKg[i] > vlEst[i]) {
				excede[i] = true;
			} else {
				excede[i] = false;
			}
		}
		
		for (int i = 0; i < excede.length; i++) {
			if(vl[i] * qtdeKg[i] > maisCara) {
				maisCaraId = i;
				maisCara = vl[i] * qtdeKg[i]; 
			}
		}
		
		for (int i = 0; i < excede.length; i++) {
			if(vl[i] * qtdeKg[i] > segMaisCara && vl[i] * qtdeKg[i] < maisCara) {
				segMaisCaraId = i;
				segMaisCara = vl[i] * qtdeKg[i];
			} else if (vl[i] * qtdeKg[i] < segMaisCara && vl[i] * qtdeKg[i] < maisCara) {
				terMaisCaraId = i;
				terMaisCara = vl[i] * qtdeKg[i];
			}
		}
		
		if (excede[maisCaraId]) {
			System.out.printf("A matéria prima %s excede o valor estimado.\nValor Estimado: %.2f\nValor Gasto: %.2f\n\n", mats[maisCaraId], vlEst[maisCaraId], vl[maisCaraId] * qtdeKg[maisCaraId]);
		}
		if (excede[segMaisCaraId]) {
			System.out.printf("A matéria prima %s excede o valor estimado.\nValor Estimado: %.2f\nValor Gasto: %.2f\n\n", mats[segMaisCaraId], vlEst[segMaisCaraId], vl[segMaisCaraId] * qtdeKg[segMaisCaraId]);
		}
		if (excede[terMaisCaraId]) {
			System.out.printf("A matéria prima %s excede o valor estimado.\nValor Estimado: %.2f\nValor Gasto: %.2f\n\n", mats[terMaisCaraId], vlEst[terMaisCaraId], vl[terMaisCaraId] * qtdeKg[terMaisCaraId]);
		}
		
		
	}
	
	public static void blocos() {
		System.out.println("Digite o número total de participantes");
		double participantes = entrada.nextInt();
		
		System.out.printf("Comissão de Frente: %.0f participantes\nAbre-Alas: %.0f participantes\nAla das baianas: %.0f participantes\nCarros alegóricos: %.0f participantes\nMestre-sala e Porta-bandeira: %.0f participantes\nBateria: %.0f participantes\nMadrinha de Bateria: %.0f participantes\nRecuo da Bateria: %.0f participantes\n----------------------------------\n", participantes*15/100, participantes*5/100, participantes*15/100, participantes*20/100, participantes*3/100, participantes*20/100, participantes*2/100, participantes*20/100);
	}

}